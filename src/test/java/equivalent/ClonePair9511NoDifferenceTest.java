package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair9511NoDifferenceTest {

    private final ClonePair9511 subject = new ClonePair9511();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{calendar(0L)};
        assertEquivalent(
            capture(values -> subject.method1((java.util.Calendar) values[0]), caseInputs0),
            capture(values -> subject.method2((java.util.Calendar) values[0]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null};
        assertEquivalent(
            capture(values -> subject.method1((java.util.Calendar) values[0]), caseInputs1),
            capture(values -> subject.method2((java.util.Calendar) values[0]), caseInputs1)
        );
    }
}
