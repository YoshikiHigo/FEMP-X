package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair9284NoDifferenceTest {

    private final ClonePair9284 subject = new ClonePair9284();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{"a", -1, new int[]{}};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue(), (int[]) values[2]), caseInputs0),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue(), (int[]) values[2]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, -1, new int[]{}};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue(), (int[]) values[2]), caseInputs1),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue(), (int[]) values[2]), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{"a.b", -1, new int[]{}};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue(), (int[]) values[2]), caseInputs2),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue(), (int[]) values[2]), caseInputs2)
        );
    }
}
