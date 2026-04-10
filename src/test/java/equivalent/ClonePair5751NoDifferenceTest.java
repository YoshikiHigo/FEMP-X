package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair5751NoDifferenceTest {

    private final ClonePair5751 subject = new ClonePair5751();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((long[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new long[]{}, 1}),
            capture(values -> subject.method2((long[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new long[]{}, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((long[]) values[0], ((Integer) values[1]).intValue()), new Object[]{null, 1}),
            capture(values -> subject.method2((long[]) values[0], ((Integer) values[1]).intValue()), new Object[]{null, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((long[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new long[]{1L, 2L}, 1}),
            capture(values -> subject.method2((long[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new long[]{1L, 2L}, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((long[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new long[]{}, -1}),
            capture(values -> subject.method2((long[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new long[]{}, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1((long[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new long[]{}, 2}),
            capture(values -> subject.method2((long[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new long[]{}, 2})
        );
    }
}
