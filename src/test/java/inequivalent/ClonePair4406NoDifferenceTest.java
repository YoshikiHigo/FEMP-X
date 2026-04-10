package inequivalent;

import org.junit.jupiter.api.Test;

import static inequivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair4406NoDifferenceTest {

    private final ClonePair4406 subject = new ClonePair4406();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{new char[]{}};
        assertEquivalent(
            capture(values -> subject.method1((char[]) values[0]), caseInputs0),
            capture(values -> subject.method2((char[]) values[0]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null};
        assertEquivalent(
            capture(values -> subject.method1((char[]) values[0]), caseInputs1),
            capture(values -> subject.method2((char[]) values[0]), caseInputs1)
        );
    }
}
