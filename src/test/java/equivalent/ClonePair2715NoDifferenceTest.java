package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair2715NoDifferenceTest {

    private final ClonePair2715 subject = new ClonePair2715();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((boolean[]) values[0], (boolean[]) values[1], ((Integer) values[2]).intValue()), new Object[]{new boolean[]{}, new boolean[]{}, 1}),
            capture(values -> subject.method2((boolean[]) values[0], (boolean[]) values[1], ((Integer) values[2]).intValue()), new Object[]{new boolean[]{}, new boolean[]{}, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((boolean[]) values[0], (boolean[]) values[1], ((Integer) values[2]).intValue()), new Object[]{null, new boolean[]{}, 1}),
            capture(values -> subject.method2((boolean[]) values[0], (boolean[]) values[1], ((Integer) values[2]).intValue()), new Object[]{null, new boolean[]{}, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((boolean[]) values[0], (boolean[]) values[1], ((Integer) values[2]).intValue()), new Object[]{new boolean[]{}, new boolean[]{}, -1}),
            capture(values -> subject.method2((boolean[]) values[0], (boolean[]) values[1], ((Integer) values[2]).intValue()), new Object[]{new boolean[]{}, new boolean[]{}, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1((boolean[]) values[0], (boolean[]) values[1], ((Integer) values[2]).intValue()), new Object[]{new boolean[]{true}, new boolean[]{false, true}, 1}),
            capture(values -> subject.method2((boolean[]) values[0], (boolean[]) values[1], ((Integer) values[2]).intValue()), new Object[]{new boolean[]{true}, new boolean[]{false, true}, 1})
        );
    }
}
