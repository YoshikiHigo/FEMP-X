package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair12596NoDifferenceTest {

    private final ClonePair12596 subject = new ClonePair12596();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{d2(), 1};
        assertEquivalent(
            capture(values -> subject.method1((double[][]) values[0], ((Integer) values[1]).intValue()), caseInputs0),
            capture(values -> subject.method2((double[][]) values[0], ((Integer) values[1]).intValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, 1};
        assertEquivalent(
            capture(values -> subject.method1((double[][]) values[0], ((Integer) values[1]).intValue()), caseInputs1),
            capture(values -> subject.method2((double[][]) values[0], ((Integer) values[1]).intValue()), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{null, -1};
        assertEquivalent(
            capture(values -> subject.method1((double[][]) values[0], ((Integer) values[1]).intValue()), caseInputs2),
            capture(values -> subject.method2((double[][]) values[0], ((Integer) values[1]).intValue()), caseInputs2)
        );
    }
}
