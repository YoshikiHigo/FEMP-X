package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair3494NoDifferenceTest {

    private final ClonePair3494 subject = new ClonePair3494();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], ((Integer) values[1]).intValue(), (int[]) values[2], ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue()), new Object[]{new int[]{}, 1, new int[]{}, 1, 1}),
            capture(values -> subject.method2((int[]) values[0], ((Integer) values[1]).intValue(), (int[]) values[2], ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue()), new Object[]{new int[]{}, 1, new int[]{}, 1, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], ((Integer) values[1]).intValue(), (int[]) values[2], ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue()), new Object[]{null, 1, new int[]{}, 1, 1}),
            capture(values -> subject.method2((int[]) values[0], ((Integer) values[1]).intValue(), (int[]) values[2], ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue()), new Object[]{null, 1, new int[]{}, 1, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], ((Integer) values[1]).intValue(), (int[]) values[2], ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue()), new Object[]{new int[]{}, 1, new int[]{}, 1, -1}),
            capture(values -> subject.method2((int[]) values[0], ((Integer) values[1]).intValue(), (int[]) values[2], ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue()), new Object[]{new int[]{}, 1, new int[]{}, 1, -1})
        );
    }
}
