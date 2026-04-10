package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair13653NoDifferenceTest {

    private final ClonePair13653 subject = new ClonePair13653();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{"0"};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), caseInputs0),
            capture(values -> subject.method2((String) values[0]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), caseInputs1),
            capture(values -> subject.method2((String) values[0]), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{"00"};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), caseInputs2),
            capture(values -> subject.method2((String) values[0]), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{"0A"};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), caseInputs3),
            capture(values -> subject.method2((String) values[0]), caseInputs3)
        );
        Object[] caseInputs4 = new Object[]{"7F"};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), caseInputs4),
            capture(values -> subject.method2((String) values[0]), caseInputs4)
        );
    }
}
