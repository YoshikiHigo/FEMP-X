package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair8141NoDifferenceTest {

    private final ClonePair8141 subject = new ClonePair8141();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{new float[]{}, new float[]{}, 1};
        assertEquivalent(
            capture(values -> subject.method1((float[]) values[0], (float[]) values[1], ((Integer) values[2]).intValue()), caseInputs0),
            capture(values -> subject.method2((float[]) values[0], (float[]) values[1], ((Integer) values[2]).intValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, new float[]{}, 1};
        assertEquivalent(
            capture(values -> subject.method1((float[]) values[0], (float[]) values[1], ((Integer) values[2]).intValue()), caseInputs1),
            capture(values -> subject.method2((float[]) values[0], (float[]) values[1], ((Integer) values[2]).intValue()), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{new float[]{}, new float[]{}, -1};
        assertEquivalent(
            capture(values -> subject.method1((float[]) values[0], (float[]) values[1], ((Integer) values[2]).intValue()), caseInputs2),
            capture(values -> subject.method2((float[]) values[0], (float[]) values[1], ((Integer) values[2]).intValue()), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{new float[]{1.0f}, new float[]{1.0f}, 1};
        assertEquivalent(
            capture(values -> subject.method1((float[]) values[0], (float[]) values[1], ((Integer) values[2]).intValue()), caseInputs3),
            capture(values -> subject.method2((float[]) values[0], (float[]) values[1], ((Integer) values[2]).intValue()), caseInputs3)
        );
    }
}
