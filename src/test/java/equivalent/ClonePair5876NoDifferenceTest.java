package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair5876NoDifferenceTest {

    private final ClonePair5876 subject = new ClonePair5876();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), new Object[]{new int[]{}, -1, 1, -1}),
            capture(values -> subject.method2((int[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), new Object[]{new int[]{}, -1, 1, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), new Object[]{null, -1, 1, -1}),
            capture(values -> subject.method2((int[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), new Object[]{null, -1, 1, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), new Object[]{new int[]{}, 1, 1, -1}),
            capture(values -> subject.method2((int[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), new Object[]{new int[]{}, 1, 1, -1})
        );
    }
}
