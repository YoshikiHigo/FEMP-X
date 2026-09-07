# `llm_inspected_pairs`

`llm_inspected_pairs` is a table that stores LLM-based inspection results for clone pairs, together with the full source code used for that inspection.

Each row corresponds to exactly one clone pair identified by `pair_id`, and `pair_id` refers to the same clone pair as `pairs.id`.

The `pairs` table is included in the same SQLite database release. It stores the underlying clone-pair identities and related source-pair information referenced by `llm_inspected_pairs`.

This table consolidates three kinds of information in one place:

- the human label assigned to the clone pair
- whether the LLM found a witness of behavioral difference
- the full source code of the target clone-pair file and its corresponding test file

## Purpose

The existing `pairs` table only represents which two methods form a pair. In contrast, `llm_inspected_pairs` records:

- whether the pair is considered equivalent, inequivalent, or not manually inspected by humans
- whether the LLM found a behavioral witness
- the type of behavioral difference, if a witness was found
- the full Java source of the corresponding `ClonePair<ID>.java` file
- the full Java source of the corresponding `ClonePair<ID>DifferenceFindingTest.java` or `ClonePair<ID>NoDifferenceTest.java` file

In other words, `llm_inspected_pairs` is an extended research table that combines LLM inspection metadata with reproducibility artifacts.

## Schema

```sql
CREATE TABLE llm_inspected_pairs (
    pair_id INTEGER PRIMARY KEY,
    human_status TEXT NOT NULL,
    llm_status TEXT NOT NULL,
    difference_type TEXT,
    pair_src TEXT NOT NULL,
    test_src TEXT NOT NULL,
    FOREIGN KEY (pair_id) REFERENCES pairs(id),
    CHECK (human_status IN ('human_equivalent','human_inequivalent','not_manually_inspected')),
    CHECK (llm_status IN ('witness_found','no_witness_found')),
    CHECK (
        (llm_status='no_witness_found' AND difference_type IS NULL)
        OR
        (llm_status='witness_found' AND difference_type IN ('return_value','side_effect','exception','no_termination'))
    )
);
```

## Columns

| Column | Type | Description |
|---|---|---|
| `pair_id` | `INTEGER` | Clone-pair identifier. This is the primary key of the table and refers to `pairs.id`. |
| `human_status` | `TEXT` | Human annotation for the pair. Allowed values are `human_equivalent`, `human_inequivalent`, and `not_manually_inspected`. |
| `llm_status` | `TEXT` | Whether the LLM found a witness of difference. Allowed values are `witness_found` and `no_witness_found`. |
| `difference_type` | `TEXT` | Type of behavioral difference when `llm_status='witness_found'`. Allowed values are `return_value`, `side_effect`, `exception`, and `no_termination`. It must be `NULL` when `llm_status='no_witness_found'`. |
| `pair_src` | `TEXT` | Full source text of the corresponding `ClonePair<ID>.java` file, including both `method1` and `method2`. |
| `test_src` | `TEXT` | Full source text of the corresponding `DifferenceFindingTest` or `NoDifferenceTest` class. |

## Value Semantics

### `human_status`

- `human_equivalent`
  - The pair was manually judged to be equivalent.
- `human_inequivalent`
  - The pair was manually judged to be inequivalent.
- `not_manually_inspected`
  - The pair has not been manually inspected.

### `llm_status`

- `witness_found`
  - The LLM found an input or observable behavior showing a difference.
- `no_witness_found`
  - The LLM did not find such a witness.

### `difference_type`

- `return_value`
  - The methods return different values.
- `side_effect`
  - The methods differ in side effects such as stdout, stderr, or input mutation.
- `exception`
  - The methods differ in exception behavior, including whether an exception is thrown or which exception type is thrown.
- `no_termination`
  - The methods differ in termination behavior, for example when one side times out.

## Integrity Constraints

The table enforces the following constraints:

- `pair_id` is unique and serves as the primary key.
- `pair_id` must reference an existing row in `pairs(id)`.
- `human_status` is restricted to three allowed labels.
- `llm_status` is restricted to two allowed labels.
- `difference_type` must be `NULL` when `llm_status='no_witness_found'`.
- `difference_type` must be one of four allowed categories when `llm_status='witness_found'`.
- `pair_src` and `test_src` cannot be `NULL`.

These constraints prevent inconsistent states such as invalid labels or a non-`NULL` `difference_type` when no witness was found.

## Indexes

The table currently has the following indexes:

```sql
CREATE INDEX idx_llm_inspected_pairs_llm_status
ON llm_inspected_pairs(llm_status);

CREATE INDEX idx_llm_inspected_pairs_human_status
ON llm_inspected_pairs(human_status);

CREATE INDEX idx_llm_inspected_pairs_difference_type
ON llm_inspected_pairs(difference_type);

CREATE INDEX idx_llm_inspected_pairs_human_status_llm_status
ON llm_inspected_pairs(human_status, llm_status);
```

Notes:

- `pair_id` does not need an additional index because it is already the primary key.
- the composite index on `(human_status, llm_status)` is intended for queries such as `WHERE human_status=? AND llm_status=?`

## Current Record Counts

In this release, the table contains:

- total rows: `13710`
- `witness_found`: `6208`
- `no_witness_found`: `7502`

Breakdown of `witness_found` rows by `difference_type`:

- `return_value`: `3731`
- `exception`: `1420`
- `no_termination`: `679`
- `side_effect`: `378`

Detailed distribution by human label:

| human_status | llm_status | difference_type | count |
|---|---|---|---:|
| `human_equivalent` | `no_witness_found` | `NULL` | 1180 |
| `human_equivalent` | `witness_found` | `exception` | 72 |
| `human_equivalent` | `witness_found` | `no_termination` | 9 |
| `human_equivalent` | `witness_found` | `return_value` | 76 |
| `human_equivalent` | `witness_found` | `side_effect` | 5 |
| `human_inequivalent` | `no_witness_found` | `NULL` | 4 |
| `human_inequivalent` | `witness_found` | `exception` | 59 |
| `human_inequivalent` | `witness_found` | `no_termination` | 18 |
| `human_inequivalent` | `witness_found` | `return_value` | 736 |
| `human_inequivalent` | `witness_found` | `side_effect` | 35 |
| `not_manually_inspected` | `no_witness_found` | `NULL` | 6318 |
| `not_manually_inspected` | `witness_found` | `exception` | 1289 |
| `not_manually_inspected` | `witness_found` | `no_termination` | 652 |
| `not_manually_inspected` | `witness_found` | `return_value` | 2919 |
| `not_manually_inspected` | `witness_found` | `side_effect` | 338 |

## Typical Queries

### Retrieve one inspected pair

```sql
SELECT *
FROM llm_inspected_pairs
WHERE pair_id = ?;
```

### Find human-equivalent pairs for which the LLM still found a witness

```sql
SELECT pair_id, difference_type
FROM llm_inspected_pairs
WHERE human_status = 'human_equivalent'
  AND llm_status = 'witness_found';
```

### List pairs with non-termination differences

```sql
SELECT pair_id, human_status
FROM llm_inspected_pairs
WHERE difference_type = 'no_termination';
```

### Retrieve all pairs in a specific human and LLM category

```sql
SELECT pair_id
FROM llm_inspected_pairs
WHERE human_status = ?
  AND llm_status = ?;
```

## Storage Notes

- `pair_src` and `test_src` are stored as `TEXT`.
- This design is appropriate when the stored content is treated as source code text rather than as raw file bytes.
- Unicode content, including non-ASCII characters, is preserved as long as the source files are read correctly as text before insertion.
- The table stores decoded source text, not raw byte-for-byte file contents. If exact byte preservation were required, `BLOB` would be more appropriate.

## Summary

`llm_inspected_pairs` is a documentation-oriented and analysis-oriented extension of the clone-pair dataset. It ties together:

- the pair identifier
- the human annotation
- the LLM inspection result
- the difference category, when available
- the complete pair source file
- the complete test source file

This makes the table useful as a single access point for analysis, auditing, reproducibility, and downstream dataset export.
