package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair9156NoDifferenceTest {

    private final ClonePair9156 subject = new ClonePair9156();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1(((Byte) values[0]).byteValue()), new Object[]{(byte) -1}),
            capture(values -> subject.method2(((Byte) values[0]).byteValue()), new Object[]{(byte) -1})
        );
    }
}
