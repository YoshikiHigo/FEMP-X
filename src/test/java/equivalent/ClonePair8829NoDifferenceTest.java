package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair8829NoDifferenceTest {

    private final ClonePair8829 subject = new ClonePair8829();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{new short[]{}, (short) -1};
        assertEquivalent(
            capture(values -> subject.method1((short[]) values[0], ((Short) values[1]).shortValue()), caseInputs0),
            capture(values -> subject.method2((short[]) values[0], ((Short) values[1]).shortValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, (short) -1};
        assertEquivalent(
            capture(values -> subject.method1((short[]) values[0], ((Short) values[1]).shortValue()), caseInputs1),
            capture(values -> subject.method2((short[]) values[0], ((Short) values[1]).shortValue()), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{new short[]{-1, 0, 1}, (short) -1};
        assertEquivalent(
            capture(values -> subject.method1((short[]) values[0], ((Short) values[1]).shortValue()), caseInputs2),
            capture(values -> subject.method2((short[]) values[0], ((Short) values[1]).shortValue()), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{new short[]{0}, (short) 1};
        assertEquivalent(
            capture(values -> subject.method1((short[]) values[0], ((Short) values[1]).shortValue()), caseInputs3),
            capture(values -> subject.method2((short[]) values[0], ((Short) values[1]).shortValue()), caseInputs3)
        );
        Object[] caseInputs4 = new Object[]{new short[]{1, 2}, (short) 8};
        assertEquivalent(
            capture(values -> subject.method1((short[]) values[0], ((Short) values[1]).shortValue()), caseInputs4),
            capture(values -> subject.method2((short[]) values[0], ((Short) values[1]).shortValue()), caseInputs4)
        );
    }
}
