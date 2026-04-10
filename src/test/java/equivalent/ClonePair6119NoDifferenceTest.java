package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair6119NoDifferenceTest {

    private final ClonePair6119 subject = new ClonePair6119();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{0.5};
        assertEquivalent(
            capture(values -> subject.method1(((Double) values[0]).doubleValue()), caseInputs0),
            capture(values -> subject.method2(((Double) values[0]).doubleValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{-1.0};
        assertEquivalent(
            capture(values -> subject.method1(((Double) values[0]).doubleValue()), caseInputs1),
            capture(values -> subject.method2(((Double) values[0]).doubleValue()), caseInputs1)
        );
    }
}
