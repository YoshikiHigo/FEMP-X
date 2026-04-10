package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair6584NoDifferenceTest {

    private final ClonePair6584 subject = new ClonePair6584();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{Integer.valueOf(-1), Integer.valueOf(-1)};
        assertEquivalent(
            capture(values -> subject.method1((Integer) values[0], (Integer) values[1]), caseInputs0),
            capture(values -> subject.method2((Integer) values[0], (Integer) values[1]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, Integer.valueOf(-1)};
        assertEquivalent(
            capture(values -> subject.method1((Integer) values[0], (Integer) values[1]), caseInputs1),
            capture(values -> subject.method2((Integer) values[0], (Integer) values[1]), caseInputs1)
        );
    }
}
