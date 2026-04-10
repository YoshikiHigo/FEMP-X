package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair9611NoDifferenceTest {

    private final ClonePair9611 subject = new ClonePair9611();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{new char[]{}, new char[]{}};
        assertEquivalent(
            capture(values -> subject.method1((char[]) values[0], (char[]) values[1]), caseInputs0),
            capture(values -> subject.method2((char[]) values[0], (char[]) values[1]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, new char[]{}};
        assertEquivalent(
            capture(values -> subject.method1((char[]) values[0], (char[]) values[1]), caseInputs1),
            capture(values -> subject.method2((char[]) values[0], (char[]) values[1]), caseInputs1)
        );
    }
}
