package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair8992NoDifferenceTest {

    private final ClonePair8992 subject = new ClonePair8992();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{d2()};
        assertEquivalent(
            capture(values -> subject.method1((double[][]) values[0]), caseInputs0),
            capture(values -> subject.method2((double[][]) values[0]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null};
        assertEquivalent(
            capture(values -> subject.method1((double[][]) values[0]), caseInputs1),
            capture(values -> subject.method2((double[][]) values[0]), caseInputs1)
        );
    }
}
