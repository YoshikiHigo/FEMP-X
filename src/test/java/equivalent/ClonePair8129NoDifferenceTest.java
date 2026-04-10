package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair8129NoDifferenceTest {

    private final ClonePair8129 subject = new ClonePair8129();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{(byte) -1};
        assertEquivalent(
            capture(values -> subject.method1(((Byte) values[0]).byteValue()), caseInputs0),
            capture(values -> subject.method2(((Byte) values[0]).byteValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{(byte) 0};
        assertEquivalent(
            capture(values -> subject.method1(((Byte) values[0]).byteValue()), caseInputs1),
            capture(values -> subject.method2(((Byte) values[0]).byteValue()), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{(byte) 1};
        assertEquivalent(
            capture(values -> subject.method1(((Byte) values[0]).byteValue()), caseInputs2),
            capture(values -> subject.method2(((Byte) values[0]).byteValue()), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{(byte) 16};
        assertEquivalent(
            capture(values -> subject.method1(((Byte) values[0]).byteValue()), caseInputs3),
            capture(values -> subject.method2(((Byte) values[0]).byteValue()), caseInputs3)
        );
        Object[] caseInputs4 = new Object[]{(byte) 0x7F};
        assertEquivalent(
            capture(values -> subject.method1(((Byte) values[0]).byteValue()), caseInputs4),
            capture(values -> subject.method2(((Byte) values[0]).byteValue()), caseInputs4)
        );
    }
}
