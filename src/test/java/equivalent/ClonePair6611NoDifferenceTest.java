package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair6611NoDifferenceTest {

    private final ClonePair6611 subject = new ClonePair6611();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{new double[]{}, -1, 1};
        assertEquivalent(
            capture(values -> subject.method1((double[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), caseInputs0),
            capture(values -> subject.method2((double[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, -1, 1};
        assertEquivalent(
            capture(values -> subject.method1((double[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), caseInputs1),
            capture(values -> subject.method2((double[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{new double[]{}, 1, 1};
        assertEquivalent(
            capture(values -> subject.method1((double[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), caseInputs2),
            capture(values -> subject.method2((double[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{new double[]{1.0}, 0, 1};
        assertEquivalent(
            capture(values -> subject.method1((double[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), caseInputs3),
            capture(values -> subject.method2((double[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), caseInputs3)
        );
    }
}
