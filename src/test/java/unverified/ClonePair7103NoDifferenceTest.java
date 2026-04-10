package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair7103NoDifferenceTest {

    private final ClonePair7103 subject = new ClonePair7103();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1(((Byte) values[0]).byteValue()), new Object[]{(byte) -1}),
            capture(values -> subject.method2(((Byte) values[0]).byteValue()), new Object[]{(byte) -1})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Byte) values[0]).byteValue()), new Object[]{(byte) 0}),
            capture(values -> subject.method2(((Byte) values[0]).byteValue()), new Object[]{(byte) 0})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Byte) values[0]).byteValue()), new Object[]{(byte) 1}),
            capture(values -> subject.method2(((Byte) values[0]).byteValue()), new Object[]{(byte) 1})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Byte) values[0]).byteValue()), new Object[]{(byte) 16}),
            capture(values -> subject.method2(((Byte) values[0]).byteValue()), new Object[]{(byte) 16})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Byte) values[0]).byteValue()), new Object[]{(byte) 0x7F}),
            capture(values -> subject.method2(((Byte) values[0]).byteValue()), new Object[]{(byte) 0x7F})
        );
    }
}
