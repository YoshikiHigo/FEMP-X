package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair13219NoDifferenceTest {

    private final ClonePair13219 subject = new ClonePair13219();

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
        Object[] caseInputs2 = new Object[]{calendar(86_400_000L), calendar(0L)};
        assertEquivalent(
            capture(values -> subject.method1((java.util.Calendar) values[0], (java.util.Calendar) values[1]), caseInputs2),
            capture(values -> subject.method2((java.util.Calendar) values[0], (java.util.Calendar) values[1]), caseInputs2)
        );
    }
}
