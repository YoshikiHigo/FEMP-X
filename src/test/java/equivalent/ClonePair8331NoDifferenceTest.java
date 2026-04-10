package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair8331NoDifferenceTest {

    private final ClonePair8331 subject = new ClonePair8331();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{Integer.valueOf(-1)};
        assertEquivalent(
            capture(values -> subject.method1((Integer) values[0]), caseInputs0),
            capture(values -> subject.method2((Integer) values[0]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null};
        assertEquivalent(
            capture(values -> subject.method1((Integer) values[0]), caseInputs1),
            capture(values -> subject.method2((Integer) values[0]), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{Integer.valueOf(0)};
        assertEquivalent(
            capture(values -> subject.method1((Integer) values[0]), caseInputs2),
            capture(values -> subject.method2((Integer) values[0]), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{Integer.valueOf(1)};
        assertEquivalent(
            capture(values -> subject.method1((Integer) values[0]), caseInputs3),
            capture(values -> subject.method2((Integer) values[0]), caseInputs3)
        );
        Object[] caseInputs4 = new Object[]{Integer.valueOf(2)};
        assertEquivalent(
            capture(values -> subject.method1((Integer) values[0]), caseInputs4),
            capture(values -> subject.method2((Integer) values[0]), caseInputs4)
        );
    }
}
