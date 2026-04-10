package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair6795NoDifferenceTest {

    private final ClonePair6795 subject = new ClonePair6795();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{new byte[]{}, ""};
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], (String) values[1]), caseInputs0),
            capture(values -> subject.method2((byte[]) values[0], (String) values[1]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, ""};
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], (String) values[1]), caseInputs1),
            capture(values -> subject.method2((byte[]) values[0], (String) values[1]), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{new byte[]{}, "a"};
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], (String) values[1]), caseInputs2),
            capture(values -> subject.method2((byte[]) values[0], (String) values[1]), caseInputs2)
        );
    }
}
