package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair5316NoDifferenceTest {

    private final ClonePair5316 subject = new ClonePair5316();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (int[]) values[2]), new Object[]{"a", "a", new int[]{}}),
            capture(values -> subject.method2((String) values[0], (String) values[1], (int[]) values[2]), new Object[]{"a", "a", new int[]{}})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (int[]) values[2]), new Object[]{null, "a", new int[]{}}),
            capture(values -> subject.method2((String) values[0], (String) values[1], (int[]) values[2]), new Object[]{null, "a", new int[]{}})
        );
    }
}
