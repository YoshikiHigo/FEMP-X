package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair7049NoDifferenceTest {

    private final ClonePair7049 subject = new ClonePair7049();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{new double[]{}, new double[]{}, -1.0, -1.0};
        assertEquivalent(
            capture(values -> subject.method1((double[]) values[0], (double[]) values[1], ((Double) values[2]).doubleValue(), ((Double) values[3]).doubleValue()), caseInputs0),
            capture(values -> subject.method2((double[]) values[0], (double[]) values[1], ((Double) values[2]).doubleValue(), ((Double) values[3]).doubleValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, new double[]{}, -1.0, -1.0};
        assertEquivalent(
            capture(values -> subject.method1((double[]) values[0], (double[]) values[1], ((Double) values[2]).doubleValue(), ((Double) values[3]).doubleValue()), caseInputs1),
            capture(values -> subject.method2((double[]) values[0], (double[]) values[1], ((Double) values[2]).doubleValue(), ((Double) values[3]).doubleValue()), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{new double[]{0.0}, new double[]{}, -1.0, -1.0};
        assertEquivalent(
            capture(values -> subject.method1((double[]) values[0], (double[]) values[1], ((Double) values[2]).doubleValue(), ((Double) values[3]).doubleValue()), caseInputs2),
            capture(values -> subject.method2((double[]) values[0], (double[]) values[1], ((Double) values[2]).doubleValue(), ((Double) values[3]).doubleValue()), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{new double[]{0.0}, new double[]{0.0}, -1.0, -1.0};
        assertEquivalent(
            capture(values -> subject.method1((double[]) values[0], (double[]) values[1], ((Double) values[2]).doubleValue(), ((Double) values[3]).doubleValue()), caseInputs3),
            capture(values -> subject.method2((double[]) values[0], (double[]) values[1], ((Double) values[2]).doubleValue(), ((Double) values[3]).doubleValue()), caseInputs3)
        );
    }
}
