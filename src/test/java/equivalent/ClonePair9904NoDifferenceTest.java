package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair9904NoDifferenceTest {

    private final ClonePair9904 subject = new ClonePair9904();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{new String[]{}, -1};
        assertEquivalent(
            capture(values -> subject.method1((String[]) values[0], ((Integer) values[1]).intValue()), caseInputs0),
            capture(values -> subject.method2((String[]) values[0], ((Integer) values[1]).intValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, -1};
        assertEquivalent(
            capture(values -> subject.method1((String[]) values[0], ((Integer) values[1]).intValue()), caseInputs1),
            capture(values -> subject.method2((String[]) values[0], ((Integer) values[1]).intValue()), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{null, 0};
        assertEquivalent(
            capture(values -> subject.method1((String[]) values[0], ((Integer) values[1]).intValue()), caseInputs2),
            capture(values -> subject.method2((String[]) values[0], ((Integer) values[1]).intValue()), caseInputs2)
        );
    }
}
