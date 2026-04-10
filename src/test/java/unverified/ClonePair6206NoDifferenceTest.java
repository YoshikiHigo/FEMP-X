package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair6206NoDifferenceTest {

    private final ClonePair6206 subject = new ClonePair6206();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((boolean[]) values[0], (boolean[]) values[1]), new Object[]{new boolean[]{}, new boolean[]{}}),
            capture(values -> subject.method2((boolean[]) values[0], (boolean[]) values[1]), new Object[]{new boolean[]{}, new boolean[]{}})
        );
        assertEquivalent(
            capture(values -> subject.method1((boolean[]) values[0], (boolean[]) values[1]), new Object[]{null, new boolean[]{}}),
            capture(values -> subject.method2((boolean[]) values[0], (boolean[]) values[1]), new Object[]{null, new boolean[]{}})
        );
    }
}
