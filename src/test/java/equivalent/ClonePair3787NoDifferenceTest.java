package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair3787NoDifferenceTest {

    private final ClonePair3787 subject = new ClonePair3787();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1(((Byte) values[0]).byteValue()), new Object[]{(byte) -1}),
            capture(values -> subject.method2(((Byte) values[0]).byteValue()), new Object[]{(byte) -1})
        );
    }
}
