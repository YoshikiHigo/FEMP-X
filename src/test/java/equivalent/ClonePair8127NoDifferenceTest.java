package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair8127NoDifferenceTest {

    private final ClonePair8127 subject = new ClonePair8127();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{(byte) -1};
        assertEquivalent(
            capture(values -> subject.method1(((Byte) values[0]).byteValue()), caseInputs0),
            capture(values -> subject.method2(((Byte) values[0]).byteValue()), caseInputs0)
        );
    }
}
