package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair8759NoDifferenceTest {

    private final ClonePair8759 subject = new ClonePair8759();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{new float[]{}, 1};
        assertEquivalent(
            capture(values -> subject.method1((float[]) values[0], ((Integer) values[1]).intValue()), caseInputs0),
            capture(values -> subject.method2((float[]) values[0], ((Integer) values[1]).intValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, 1};
        assertEquivalent(
            capture(values -> subject.method1((float[]) values[0], ((Integer) values[1]).intValue()), caseInputs1),
            capture(values -> subject.method2((float[]) values[0], ((Integer) values[1]).intValue()), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{new float[]{0.0f}, 1};
        assertEquivalent(
            capture(values -> subject.method1((float[]) values[0], ((Integer) values[1]).intValue()), caseInputs2),
            capture(values -> subject.method2((float[]) values[0], ((Integer) values[1]).intValue()), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{new float[]{1.0f}, 1};
        assertEquivalent(
            capture(values -> subject.method1((float[]) values[0], ((Integer) values[1]).intValue()), caseInputs3),
            capture(values -> subject.method2((float[]) values[0], ((Integer) values[1]).intValue()), caseInputs3)
        );
        Object[] caseInputs4 = new Object[]{new float[]{Float.NaN}, 1};
        assertEquivalent(
            capture(values -> subject.method1((float[]) values[0], ((Integer) values[1]).intValue()), caseInputs4),
            capture(values -> subject.method2((float[]) values[0], ((Integer) values[1]).intValue()), caseInputs4)
        );
    }
}
