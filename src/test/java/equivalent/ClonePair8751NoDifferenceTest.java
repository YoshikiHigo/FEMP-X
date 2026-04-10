package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair8751NoDifferenceTest {

    private final ClonePair8751 subject = new ClonePair8751();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{Byte.valueOf((byte) -1), Byte.valueOf((byte) -1)};
        assertEquivalent(
            capture(values -> subject.method1((Byte) values[0], (Byte) values[1]), caseInputs0),
            capture(values -> subject.method2((Byte) values[0], (Byte) values[1]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, Byte.valueOf((byte) -1)};
        assertEquivalent(
            capture(values -> subject.method1((Byte) values[0], (Byte) values[1]), caseInputs1),
            capture(values -> subject.method2((Byte) values[0], (Byte) values[1]), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{Byte.valueOf((byte) 0), Byte.valueOf((byte) -1)};
        assertEquivalent(
            capture(values -> subject.method1((Byte) values[0], (Byte) values[1]), caseInputs2),
            capture(values -> subject.method2((Byte) values[0], (Byte) values[1]), caseInputs2)
        );
    }
}
