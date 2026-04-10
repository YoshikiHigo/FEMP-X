package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair9379NoDifferenceTest {

    private final ClonePair9379 subject = new ClonePair9379();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{new double[]{}, 1, -1.0, -1.0};
        assertEquivalent(
            capture(values -> subject.method1((double[]) values[0], ((Integer) values[1]).intValue(), ((Double) values[2]).doubleValue(), ((Double) values[3]).doubleValue()), caseInputs0),
            capture(values -> subject.method2((double[]) values[0], ((Integer) values[1]).intValue(), ((Double) values[2]).doubleValue(), ((Double) values[3]).doubleValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, 1, -1.0, -1.0};
        assertEquivalent(
            capture(values -> subject.method1((double[]) values[0], ((Integer) values[1]).intValue(), ((Double) values[2]).doubleValue(), ((Double) values[3]).doubleValue()), caseInputs1),
            capture(values -> subject.method2((double[]) values[0], ((Integer) values[1]).intValue(), ((Double) values[2]).doubleValue(), ((Double) values[3]).doubleValue()), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{new double[]{0.0}, 1, -1.0, -1.0};
        assertEquivalent(
            capture(values -> subject.method1((double[]) values[0], ((Integer) values[1]).intValue(), ((Double) values[2]).doubleValue(), ((Double) values[3]).doubleValue()), caseInputs2),
            capture(values -> subject.method2((double[]) values[0], ((Integer) values[1]).intValue(), ((Double) values[2]).doubleValue(), ((Double) values[3]).doubleValue()), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{new double[]{1.0}, 1, -1.0, -1.0};
        assertEquivalent(
            capture(values -> subject.method1((double[]) values[0], ((Integer) values[1]).intValue(), ((Double) values[2]).doubleValue(), ((Double) values[3]).doubleValue()), caseInputs3),
            capture(values -> subject.method2((double[]) values[0], ((Integer) values[1]).intValue(), ((Double) values[2]).doubleValue(), ((Double) values[3]).doubleValue()), caseInputs3)
        );
        Object[] caseInputs4 = new Object[]{new double[]{0.0}, 1, 0.0, -1.0};
        assertEquivalent(
            capture(values -> subject.method1((double[]) values[0], ((Integer) values[1]).intValue(), ((Double) values[2]).doubleValue(), ((Double) values[3]).doubleValue()), caseInputs4),
            capture(values -> subject.method2((double[]) values[0], ((Integer) values[1]).intValue(), ((Double) values[2]).doubleValue(), ((Double) values[3]).doubleValue()), caseInputs4)
        );
    }
}
