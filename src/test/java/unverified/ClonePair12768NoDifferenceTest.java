package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair12768NoDifferenceTest {

    private final ClonePair12768 subject = new ClonePair12768();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new byte[]{}, 1}),
            capture(values -> subject.method2((byte[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new byte[]{}, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Integer) values[1]).intValue()), new Object[]{null, 1}),
            capture(values -> subject.method2((byte[]) values[0], ((Integer) values[1]).intValue()), new Object[]{null, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new byte[]{0, 1, 2}, 1}),
            capture(values -> subject.method2((byte[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new byte[]{0, 1, 2}, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new byte[]{1, 2, 3, 4}, 1}),
            capture(values -> subject.method2((byte[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new byte[]{1, 2, 3, 4}, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new byte[]{0, 1, 2}, 0}),
            capture(values -> subject.method2((byte[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new byte[]{0, 1, 2}, 0})
        );
    }
}
