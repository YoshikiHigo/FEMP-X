# FEMP-X

**FEMP-X** is a witness-augmented dataset for candidate functionally equivalent Java method pairs.

Unlike datasets that provide only pair-level labels, FEMP-X adds **execution-validated witnesses of inequivalence** when candidate equivalence can be falsified. Each retained witness is backed by an executable JUnit test and exposes a concrete behavioral difference between two methods, such as a difference in returned values, side effects, exception behavior, or termination behavior.

FEMP-X is built on top of the original candidate pool of **13,710** Java method pairs derived from the prior FEMPD study.

Zenodo DOI: https://doi.org/10.5281/zenodo.19543614

## Overview

The original FEMPD dataset was constructed from Java methods extracted from IJADataset. Methods were grouped by identical return types and parameter types, test cases were generated for each method, and the generated tests were executed mutually between method pairs in the same group. Pairs that succeeded in both directions were retained as candidate pairs for functional equivalence, and a subset of them was manually inspected.

FEMP-X extends that candidate pool with a new **witness-backed data layer**. Instead of asking an LLM to prove equivalence, the construction procedure searches for a concrete input under which the two methods behave differently. When such a difference is found and reproduced by execution, the pair is recorded together with an executable witness.

Accordingly, FEMP-X should not be interpreted as merely a larger version of the original equivalence dataset. Its main contribution is a reusable layer of **behavioral falsification evidence** over the original candidate pool.

## Main Contributions

FEMP-X provides:

- the original candidate pool of **13,710** compilable and executable Java method pairs
- the original human curation status, when available
- LLM-based witness-generation outcomes for all candidate pairs
- execution-validated distinguishing tests for witness-backed inequivalent pairs
- behavioral difference metadata describing how the two methods differ
- reproducibility-oriented artifacts for downstream analysis

The key novelty of FEMP-X is not merely that it increases the number of annotated pairs. Rather, it releases **reusable execution-backed evidence** for pairs whose candidate equivalence can be falsified.

## Construction Summary

FEMP-X was constructed with **GPT-5.4 through Codex** in an agentic workflow.

For each candidate pair:

1. the model was given a Java file containing `method1` and `method2`
2. it searched for an input under which the two methods differ behaviorally
3. it generated a candidate JUnit test
4. the generated test was executed immediately
5. only tests that actually reproduced a behavioral difference were retained

Each pair was processed with a maximum analysis budget of **three minutes**.
If no executable witness was found within that budget, the pair was recorded as `no_witness_found`.

## Behavioral Difference Categories

A retained witness may expose one of the following types of behavioral difference:

- `return_value`: the two methods return different values
- `side_effect`: the two methods differ in side effects such as standard output, standard error, or mutation of reference-type inputs
- `exception`: the two methods differ in exception behavior
- `no_termination`: only one side fails to terminate, for example due to timeout or infinite looping behavior

## This Zenodo Release Includes

This Zenodo release includes:

- a SQLite database containing the dataset
- this `README.md`
- `llm_inspected_pairs.md`, which documents the main LLM-augmented table in detail

The generated JUnit test cases are **not** distributed as separate files in this release. Instead, they are stored inside the SQLite database as source text in the `test_src` field of `llm_inspected_pairs`.

## Main Table

A central table in the released artifact is **`llm_inspected_pairs`**.

This table records, for each clone pair:

- the pair identifier (`pair_id`)
- the original human curation status (`human_status`)
- the outcome of the LLM-based witness-generation workflow (`llm_status`)
- the behavioral difference category (`difference_type`), when a witness was found
- the full source code of the corresponding pair file (`pair_src`)
- the full source code of the corresponding test file (`test_src`)

For the complete schema, integrity constraints, indexes, and example queries, see `llm_inspected_pairs.md`.

## Current Record Counts

In this release, `llm_inspected_pairs` contains **13,710** rows.

### Overall distribution

- `witness_found`: **4,193**
- `no_witness_found`: **9,517**

### Breakdown of `witness_found` by `difference_type`

- `return_value`: **2,676**
- `exception`: **798**
- `no_termination`: **415**
- `side_effect`: **304**

### Distribution by human curation status

| human_status | llm_status | difference_type | count |
|---|---|---|---:|
| `human_equivalent` | `no_witness_found` | `NULL` | 1,225 |
| `human_equivalent` | `witness_found` | `exception` | 50 |
| `human_equivalent` | `witness_found` | `no_termination` | 6 |
| `human_equivalent` | `witness_found` | `return_value` | 57 |
| `human_equivalent` | `witness_found` | `side_effect` | 4 |
| `human_inequivalent` | `no_witness_found` | `NULL` | 4 |
| `human_inequivalent` | `witness_found` | `exception` | 59 |
| `human_inequivalent` | `witness_found` | `no_termination` | 18 |
| `human_inequivalent` | `witness_found` | `return_value` | 771 |
| `not_manually_inspected` | `no_witness_found` | `NULL` | 8,288 |
| `not_manually_inspected` | `witness_found` | `exception` | 689 |
| `not_manually_inspected` | `witness_found` | `no_termination` | 391 |
| `not_manually_inspected` | `witness_found` | `return_value` | 1,848 |
| `not_manually_inspected` | `witness_found` | `side_effect` | 300 |

These counts indicate that FEMP-X contributes a large witness-backed layer not only over the original human-validated subset but also over the previously uninspected portion of the candidate pool.

## Interpretation Notes

FEMP-X is intentionally **asymmetric**.

A single reproduced witness is enough to establish that a pair is behaviorally inequivalent under the exercised condition. By contrast, failure to find a witness does **not** prove equivalence.

Please interpret the labels as follows:

- `witness_found` means that the current workflow obtained an **execution-validated witness of inequivalence**
- `no_witness_found` means that the current workflow did **not** obtain such a witness within the current search budget
- `human_equivalent` should not be interpreted as a formal proof of equivalence
- `human_inequivalent` refers to the original manually curated inequivalent subset from FEMPD

Therefore, pairs in the `no_witness_found` category may be useful as **candidate functionally equivalent pairs** or **hard-to-falsify pairs**, but they should not be treated as ground-truth equivalent pairs without further validation.

## Using the Dataset

You can inspect the SQLite artifact with standard SQLite tools.

In the examples below, we assume that the SQLite database file is named `FEMP-X.sqlite`. If your local copy uses a different filename, replace it accordingly.

Example:

```bash
sqlite3 FEMP-X.sqlite
```

Useful SQLite commands:

```sql
.tables
.schema llm_inspected_pairs
SELECT COUNT(*) FROM llm_inspected_pairs;
```

Example query: retrieve pairs for which an executable witness was found.

```sql
SELECT pair_id, human_status, llm_status, difference_type
FROM llm_inspected_pairs
WHERE llm_status = 'witness_found';
```

Example query: retrieve pairs originally marked as human-equivalent but later falsified by an executable witness.

```sql
SELECT pair_id, difference_type
FROM llm_inspected_pairs
WHERE human_status = 'human_equivalent'
  AND llm_status = 'witness_found';
```

For the full schema and additional example queries, see `llm_inspected_pairs.md`.

## Intended Research Uses

FEMP-X is intended to support research on:

- semantic clone detection
- behavioral similarity analysis
- false-positive analysis for clone and similarity detectors
- counterexample generation
- executable test generation
- LLM-assisted dataset curation
- hybrid human-LLM curation workflows

Because witness-backed pairs include executable distinguishing tests, FEMP-X supports analyses that go beyond binary labels and enables users to inspect **how** a candidate pair was falsified.

## Limitations

FEMP-X inherits several limitations from the original candidate construction process.

First, the dataset is restricted to **Java methods** and reflects the filtering conditions of the original candidate-pair construction pipeline.

Second, the witness-generation workflow is effective at **falsifying** equivalence, but it does not **prove** equivalence when no witness is found.

Third, each retained witness reflects a reproduced behavioral difference under a particular test and should not be interpreted as an exhaustive characterization of full program semantics.

Finally, although the released artifact is execution-backed, downstream use still requires careful interpretation of the distinction between:

- manually curated labels from the original dataset
- newly added witness-backed inequivalence evidence
- no-counterexample-found outcomes

## AI Usage Disclosure

This dataset was curated in part with **GPT-5.4 through Codex**.

The model was used in an agentic workflow to generate candidate distinguishing tests, execute them immediately, and iteratively refine the search when no behavioral difference was reproduced. Only execution-validated witness tests were retained in the released artifact.

Accordingly, the final stored evidence is based on reproduced behavioral differences rather than on unvalidated natural-language judgments.

## Relationship to the Original Dataset

FEMP-X is built on top of the candidate pair pool introduced by the original FEMPD work.

The original dataset remains important because it provides:

- the source candidate pool
- original manual judgments for the human-validated subset
- the basis for tracing pair identifiers and source artifacts

FEMP-X adds a new reusable witness-backed layer over that foundation.

## License

This release is distributed under **Creative Commons Attribution-NonCommercial 4.0 International (CC BY-NC 4.0)**. FEMP-X is derived in part from IJADataset, and the source-code content contained in this release, including the code stored in the `pair_src` field of `FEMP-X.sqlite`, is distributed under the same CC BY-NC 4.0 license. Please preserve attribution to FEMP-X and IJADataset, provide a link to the license, indicate whether changes were made, and do not use the material for commercial purposes. See the accompanying `LICENSE` file for details.

## Availability

Project repository:

- https://github.com/YoshikiHigo/FEMP-X

Zenodo release:

- https://doi.org/10.5281/zenodo.19543614

## Citation

If you use FEMP-X, please cite:

1. the Zenodo release of FEMP-X:
   https://doi.org/10.5281/zenodo.19543614
2. the original FEMPD paper

If an accompanying FEMP-X paper is published later, its citation information can be added in a future revision of this README.

## Contact

For questions about the dataset, please use the project repository below or the contact information provided in the Zenodo record:

- https://github.com/YoshikiHigo/FEMP-X
