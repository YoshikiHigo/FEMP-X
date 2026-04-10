package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair5079NoDifferenceTest {

    private final ClonePair5079 subject = new ClonePair5079();

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
        assertEquivalent(
            capture(values -> subject.method1((boolean[]) values[0], (boolean[]) values[1]), new Object[]{new boolean[]{true}, new boolean[]{}}),
            capture(values -> subject.method2((boolean[]) values[0], (boolean[]) values[1]), new Object[]{new boolean[]{true}, new boolean[]{}})
        );
        assertEquivalent(
            capture(values -> subject.method1((boolean[]) values[0], (boolean[]) values[1]), new Object[]{new boolean[]{true}, new boolean[]{true}}),
            capture(values -> subject.method2((boolean[]) values[0], (boolean[]) values[1]), new Object[]{new boolean[]{true}, new boolean[]{true}})
        );
        assertEquivalent(
            capture(values -> subject.method1((boolean[]) values[0], (boolean[]) values[1]), new Object[]{new boolean[]{true}, new boolean[]{false, true}}),
            capture(values -> subject.method2((boolean[]) values[0], (boolean[]) values[1]), new Object[]{new boolean[]{true}, new boolean[]{false, true}})
        );
    }
}
