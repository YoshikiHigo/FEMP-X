package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair7185NoDifferenceTest {

    private final ClonePair7185 subject = new ClonePair7185();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (byte[]) values[3], ((Integer) values[4]).intValue(), ((Integer) values[5]).intValue()), new Object[]{new byte[]{}, -1, -1, new byte[]{}, -1, -1}),
            capture(values -> subject.method2((byte[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (byte[]) values[3], ((Integer) values[4]).intValue(), ((Integer) values[5]).intValue()), new Object[]{new byte[]{}, -1, -1, new byte[]{}, -1, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (byte[]) values[3], ((Integer) values[4]).intValue(), ((Integer) values[5]).intValue()), new Object[]{new byte[]{}, -1, 0, new byte[]{}, -1, -1}),
            capture(values -> subject.method2((byte[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (byte[]) values[3], ((Integer) values[4]).intValue(), ((Integer) values[5]).intValue()), new Object[]{new byte[]{}, -1, 0, new byte[]{}, -1, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (byte[]) values[3], ((Integer) values[4]).intValue(), ((Integer) values[5]).intValue()), new Object[]{new byte[]{}, -1, 1, new byte[]{}, -1, -1}),
            capture(values -> subject.method2((byte[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (byte[]) values[3], ((Integer) values[4]).intValue(), ((Integer) values[5]).intValue()), new Object[]{new byte[]{}, -1, 1, new byte[]{}, -1, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (byte[]) values[3], ((Integer) values[4]).intValue(), ((Integer) values[5]).intValue()), new Object[]{new byte[]{}, -1, 2, new byte[]{}, -1, -1}),
            capture(values -> subject.method2((byte[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (byte[]) values[3], ((Integer) values[4]).intValue(), ((Integer) values[5]).intValue()), new Object[]{new byte[]{}, -1, 2, new byte[]{}, -1, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (byte[]) values[3], ((Integer) values[4]).intValue(), ((Integer) values[5]).intValue()), new Object[]{new byte[]{}, -1, -1, new byte[]{}, -1, 0}),
            capture(values -> subject.method2((byte[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (byte[]) values[3], ((Integer) values[4]).intValue(), ((Integer) values[5]).intValue()), new Object[]{new byte[]{}, -1, -1, new byte[]{}, -1, 0})
        );
    }
}
