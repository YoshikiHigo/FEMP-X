package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair12838NoDifferenceTest {

    private final ClonePair12838 subject = new ClonePair12838();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{new Class[]{}, new Class[]{}};
        assertEquivalent(
            capture(values -> subject.method1((Class[]) values[0], (Class[]) values[1]), caseInputs0),
            capture(values -> subject.method2((Class[]) values[0], (Class[]) values[1]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, null};
        assertEquivalent(
            capture(values -> subject.method1((Class[]) values[0], (Class[]) values[1]), caseInputs1),
            capture(values -> subject.method2((Class[]) values[0], (Class[]) values[1]), caseInputs1)
        );
    }
}
