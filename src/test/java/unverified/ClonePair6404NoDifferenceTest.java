package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair6404NoDifferenceTest {

    private final ClonePair6404 subject = new ClonePair6404();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new byte[]{}, -1}),
            capture(values -> subject.method2((byte[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new byte[]{}, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Integer) values[1]).intValue()), new Object[]{null, -1}),
            capture(values -> subject.method2((byte[]) values[0], ((Integer) values[1]).intValue()), new Object[]{null, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new byte[]{0, 1, 2, 3, 4, 5, 6, 7}, 0}),
            capture(values -> subject.method2((byte[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new byte[]{0, 1, 2, 3, 4, 5, 6, 7}, 0})
        );
    }
}
