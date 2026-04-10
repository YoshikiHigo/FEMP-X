package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair7829NoDifferenceTest {

    private final ClonePair7829 subject = new ClonePair7829();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Byte) values[1]).byteValue(), ((Integer) values[2]).intValue()), new Object[]{new byte[]{}, (byte) -1, -1}),
            capture(values -> subject.method2((byte[]) values[0], ((Byte) values[1]).byteValue(), ((Integer) values[2]).intValue()), new Object[]{new byte[]{}, (byte) -1, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Byte) values[1]).byteValue(), ((Integer) values[2]).intValue()), new Object[]{null, (byte) -1, -1}),
            capture(values -> subject.method2((byte[]) values[0], ((Byte) values[1]).byteValue(), ((Integer) values[2]).intValue()), new Object[]{null, (byte) -1, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Byte) values[1]).byteValue(), ((Integer) values[2]).intValue()), new Object[]{new byte[]{}, (byte) -1, 0}),
            capture(values -> subject.method2((byte[]) values[0], ((Byte) values[1]).byteValue(), ((Integer) values[2]).intValue()), new Object[]{new byte[]{}, (byte) -1, 0})
        );
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Byte) values[1]).byteValue(), ((Integer) values[2]).intValue()), new Object[]{new byte[]{0}, (byte) 0, 0}),
            capture(values -> subject.method2((byte[]) values[0], ((Byte) values[1]).byteValue(), ((Integer) values[2]).intValue()), new Object[]{new byte[]{0}, (byte) 0, 0})
        );
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Byte) values[1]).byteValue(), ((Integer) values[2]).intValue()), new Object[]{new byte[]{0, 1, 2}, (byte) 1, 0}),
            capture(values -> subject.method2((byte[]) values[0], ((Byte) values[1]).byteValue(), ((Integer) values[2]).intValue()), new Object[]{new byte[]{0, 1, 2}, (byte) 1, 0})
        );
    }
}
