package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair6863NoDifferenceTest {

    private final ClonePair6863 subject = new ClonePair6863();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{new byte[]{}, -1};
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Integer) values[1]).intValue()), caseInputs0),
            capture(values -> subject.method2((byte[]) values[0], ((Integer) values[1]).intValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, -1};
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Integer) values[1]).intValue()), caseInputs1),
            capture(values -> subject.method2((byte[]) values[0], ((Integer) values[1]).intValue()), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{new byte[]{}, 0};
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Integer) values[1]).intValue()), caseInputs2),
            capture(values -> subject.method2((byte[]) values[0], ((Integer) values[1]).intValue()), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{new byte[]{0}, 0};
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Integer) values[1]).intValue()), caseInputs3),
            capture(values -> subject.method2((byte[]) values[0], ((Integer) values[1]).intValue()), caseInputs3)
        );
    }
}
