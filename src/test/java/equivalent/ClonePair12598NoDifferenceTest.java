package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair12598NoDifferenceTest {

    private final ClonePair12598 subject = new ClonePair12598();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{-1.0, new double[]{}, 1};
        assertEquivalent(
            capture(values -> subject.method1(((Double) values[0]).doubleValue(), (double[]) values[1], ((Integer) values[2]).intValue()), caseInputs0),
            capture(values -> subject.method2(((Double) values[0]).doubleValue(), (double[]) values[1], ((Integer) values[2]).intValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{-1.0, null, 1};
        assertEquivalent(
            capture(values -> subject.method1(((Double) values[0]).doubleValue(), (double[]) values[1], ((Integer) values[2]).intValue()), caseInputs1),
            capture(values -> subject.method2(((Double) values[0]).doubleValue(), (double[]) values[1], ((Integer) values[2]).intValue()), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{-1.0, new double[]{0.0}, 1};
        assertEquivalent(
            capture(values -> subject.method1(((Double) values[0]).doubleValue(), (double[]) values[1], ((Integer) values[2]).intValue()), caseInputs2),
            capture(values -> subject.method2(((Double) values[0]).doubleValue(), (double[]) values[1], ((Integer) values[2]).intValue()), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{-1.0, new double[]{1.0}, 1};
        assertEquivalent(
            capture(values -> subject.method1(((Double) values[0]).doubleValue(), (double[]) values[1], ((Integer) values[2]).intValue()), caseInputs3),
            capture(values -> subject.method2(((Double) values[0]).doubleValue(), (double[]) values[1], ((Integer) values[2]).intValue()), caseInputs3)
        );
        Object[] caseInputs4 = new Object[]{0.0, new double[]{1.0}, -1};
        assertEquivalent(
            capture(values -> subject.method1(((Double) values[0]).doubleValue(), (double[]) values[1], ((Integer) values[2]).intValue()), caseInputs4),
            capture(values -> subject.method2(((Double) values[0]).doubleValue(), (double[]) values[1], ((Integer) values[2]).intValue()), caseInputs4)
        );
    }
}
