package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair6833NoDifferenceTest {

    private final ClonePair6833 subject = new ClonePair6833();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{new float[]{}, 1, new float[]{}, 1, 1};
        assertEquivalent(
            capture(values -> subject.method1((float[]) values[0], ((Integer) values[1]).intValue(), (float[]) values[2], ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue()), caseInputs0),
            capture(values -> subject.method2((float[]) values[0], ((Integer) values[1]).intValue(), (float[]) values[2], ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, 1, new float[]{}, 1, 1};
        assertEquivalent(
            capture(values -> subject.method1((float[]) values[0], ((Integer) values[1]).intValue(), (float[]) values[2], ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue()), caseInputs1),
            capture(values -> subject.method2((float[]) values[0], ((Integer) values[1]).intValue(), (float[]) values[2], ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue()), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{new float[]{}, 1, new float[]{}, 1, -1};
        assertEquivalent(
            capture(values -> subject.method1((float[]) values[0], ((Integer) values[1]).intValue(), (float[]) values[2], ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue()), caseInputs2),
            capture(values -> subject.method2((float[]) values[0], ((Integer) values[1]).intValue(), (float[]) values[2], ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue()), caseInputs2)
        );
    }
}
