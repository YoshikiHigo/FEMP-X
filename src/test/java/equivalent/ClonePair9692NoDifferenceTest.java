package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair9692NoDifferenceTest {

    private final ClonePair9692 subject = new ClonePair9692();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{-1.0};
        assertEquivalent(
            capture(values -> subject.method1(((Double) values[0]).doubleValue()), caseInputs0),
            capture(values -> subject.method2(((Double) values[0]).doubleValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{0.0};
        assertEquivalent(
            capture(values -> subject.method1(((Double) values[0]).doubleValue()), caseInputs1),
            capture(values -> subject.method2(((Double) values[0]).doubleValue()), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{0.5};
        assertEquivalent(
            capture(values -> subject.method1(((Double) values[0]).doubleValue()), caseInputs2),
            capture(values -> subject.method2(((Double) values[0]).doubleValue()), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{1.0};
        assertEquivalent(
            capture(values -> subject.method1(((Double) values[0]).doubleValue()), caseInputs3),
            capture(values -> subject.method2(((Double) values[0]).doubleValue()), caseInputs3)
        );
        Object[] caseInputs4 = new Object[]{3.5};
        assertEquivalent(
            capture(values -> subject.method1(((Double) values[0]).doubleValue()), caseInputs4),
            capture(values -> subject.method2(((Double) values[0]).doubleValue()), caseInputs4)
        );
    }
}
