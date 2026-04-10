package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair13082NoDifferenceTest {

    private final ClonePair13082 subject = new ClonePair13082();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{(short) -1};
        assertEquivalent(
            capture(values -> subject.method1(((Short) values[0]).shortValue()), caseInputs0),
            capture(values -> subject.method2(((Short) values[0]).shortValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{(short) 0};
        assertEquivalent(
            capture(values -> subject.method1(((Short) values[0]).shortValue()), caseInputs1),
            capture(values -> subject.method2(((Short) values[0]).shortValue()), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{(short) 1};
        assertEquivalent(
            capture(values -> subject.method1(((Short) values[0]).shortValue()), caseInputs2),
            capture(values -> subject.method2(((Short) values[0]).shortValue()), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{(short) 8};
        assertEquivalent(
            capture(values -> subject.method1(((Short) values[0]).shortValue()), caseInputs3),
            capture(values -> subject.method2(((Short) values[0]).shortValue()), caseInputs3)
        );
        Object[] caseInputs4 = new Object[]{(short) 16};
        assertEquivalent(
            capture(values -> subject.method1(((Short) values[0]).shortValue()), caseInputs4),
            capture(values -> subject.method2(((Short) values[0]).shortValue()), caseInputs4)
        );
    }
}
