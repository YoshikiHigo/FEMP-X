package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair5790NoDifferenceTest {

    private final ClonePair5790 subject = new ClonePair5790();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((boolean[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{new boolean[]{}, -1, 1}),
            capture(values -> subject.method2((boolean[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{new boolean[]{}, -1, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((boolean[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{null, -1, 1}),
            capture(values -> subject.method2((boolean[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{null, -1, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((boolean[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{new boolean[]{}, -1, -1}),
            capture(values -> subject.method2((boolean[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{new boolean[]{}, -1, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1((boolean[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{new boolean[]{}, -1, 0}),
            capture(values -> subject.method2((boolean[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{new boolean[]{}, -1, 0})
        );
        assertEquivalent(
            capture(values -> subject.method1((boolean[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{new boolean[]{true}, 0, 1}),
            capture(values -> subject.method2((boolean[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{new boolean[]{true}, 0, 1})
        );
    }
}
