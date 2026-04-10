package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair5816NoDifferenceTest {

    private final ClonePair5816 subject = new ClonePair5816();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Integer) values[1]).intValue(), (byte[]) values[2], ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue()), new Object[]{new byte[]{}, 1, new byte[]{}, 1, 1}),
            capture(values -> subject.method2((byte[]) values[0], ((Integer) values[1]).intValue(), (byte[]) values[2], ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue()), new Object[]{new byte[]{}, 1, new byte[]{}, 1, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Integer) values[1]).intValue(), (byte[]) values[2], ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue()), new Object[]{null, 1, new byte[]{}, 1, 1}),
            capture(values -> subject.method2((byte[]) values[0], ((Integer) values[1]).intValue(), (byte[]) values[2], ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue()), new Object[]{null, 1, new byte[]{}, 1, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Integer) values[1]).intValue(), (byte[]) values[2], ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue()), new Object[]{new byte[]{}, 1, new byte[]{}, 1, -1}),
            capture(values -> subject.method2((byte[]) values[0], ((Integer) values[1]).intValue(), (byte[]) values[2], ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue()), new Object[]{new byte[]{}, 1, new byte[]{}, 1, -1})
        );
    }
}
