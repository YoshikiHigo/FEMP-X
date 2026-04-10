package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair11311NoDifferenceTest {

    private final ClonePair11311 subject = new ClonePair11311();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{Integer.valueOf(-1), Integer.valueOf(-1)};
        assertEquivalent(
            capture(values -> subject.method1((Number) values[0], (Number) values[1]), caseInputs0),
            capture(values -> subject.method2((Number) values[0], (Number) values[1]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, Integer.valueOf(-1)};
        assertEquivalent(
            capture(values -> subject.method1((Number) values[0], (Number) values[1]), caseInputs1),
            capture(values -> subject.method2((Number) values[0], (Number) values[1]), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{Integer.valueOf(0), Integer.valueOf(-1)};
        assertEquivalent(
            capture(values -> subject.method1((Number) values[0], (Number) values[1]), caseInputs2),
            capture(values -> subject.method2((Number) values[0], (Number) values[1]), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{Integer.valueOf(1), Integer.valueOf(-1)};
        assertEquivalent(
            capture(values -> subject.method1((Number) values[0], (Number) values[1]), caseInputs3),
            capture(values -> subject.method2((Number) values[0], (Number) values[1]), caseInputs3)
        );
        Object[] caseInputs4 = new Object[]{Double.valueOf(1.5), Integer.valueOf(-1)};
        assertEquivalent(
            capture(values -> subject.method1((Number) values[0], (Number) values[1]), caseInputs4),
            capture(values -> subject.method2((Number) values[0], (Number) values[1]), caseInputs4)
        );
    }
}
