package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair13146NoDifferenceTest {

    private final ClonePair13146 subject = new ClonePair13146();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{calendar(0L), calendar(0L)};
        assertEquivalent(
            capture(values -> subject.method1((java.util.Calendar) values[0], (java.util.Calendar) values[1]), caseInputs0),
            capture(values -> subject.method2((java.util.Calendar) values[0], (java.util.Calendar) values[1]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, calendar(0L)};
        assertEquivalent(
            capture(values -> subject.method1((java.util.Calendar) values[0], (java.util.Calendar) values[1]), caseInputs1),
            capture(values -> subject.method2((java.util.Calendar) values[0], (java.util.Calendar) values[1]), caseInputs1)
        );
    }
}
