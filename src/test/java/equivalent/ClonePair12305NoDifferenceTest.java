package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair12305NoDifferenceTest {

    private final ClonePair12305 subject = new ClonePair12305();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{new String[]{}, "", false};
        assertEquivalent(
            capture(values -> subject.method1((String[]) values[0], (String) values[1], ((Boolean) values[2]).booleanValue()), caseInputs0),
            capture(values -> subject.method2((String[]) values[0], (String) values[1], ((Boolean) values[2]).booleanValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, "", false};
        assertEquivalent(
            capture(values -> subject.method1((String[]) values[0], (String) values[1], ((Boolean) values[2]).booleanValue()), caseInputs1),
            capture(values -> subject.method2((String[]) values[0], (String) values[1], ((Boolean) values[2]).booleanValue()), caseInputs1)
        );
    }
}
