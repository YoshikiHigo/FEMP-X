package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair6589NoDifferenceTest {

    private final ClonePair6589 subject = new ClonePair6589();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{new long[]{}, new long[]{}};
        assertEquivalent(
            capture(values -> subject.method1((long[]) values[0], (long[]) values[1]), caseInputs0),
            capture(values -> subject.method2((long[]) values[0], (long[]) values[1]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, new long[]{}};
        assertEquivalent(
            capture(values -> subject.method1((long[]) values[0], (long[]) values[1]), caseInputs1),
            capture(values -> subject.method2((long[]) values[0], (long[]) values[1]), caseInputs1)
        );
    }
}
