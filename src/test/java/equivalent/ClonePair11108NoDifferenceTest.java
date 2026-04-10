package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair11108NoDifferenceTest {

    private final ClonePair11108 subject = new ClonePair11108();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{d2(), -1, 1, -1, 1};
        assertEquivalent(
            capture(values -> subject.method1((double[][]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue()), caseInputs0),
            capture(values -> subject.method2((double[][]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, -1, 1, -1, 1};
        assertEquivalent(
            capture(values -> subject.method1((double[][]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue()), caseInputs1),
            capture(values -> subject.method2((double[][]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue()), caseInputs1)
        );
    }
}
