package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair9040NoDifferenceTest {

    private final ClonePair9040 subject = new ClonePair9040();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{date(0L), date(0L)};
        assertEquivalent(
            capture(values -> subject.method1((java.util.Date) values[0], (java.util.Date) values[1]), caseInputs0),
            capture(values -> subject.method2((java.util.Date) values[0], (java.util.Date) values[1]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, date(0L)};
        assertEquivalent(
            capture(values -> subject.method1((java.util.Date) values[0], (java.util.Date) values[1]), caseInputs1),
            capture(values -> subject.method2((java.util.Date) values[0], (java.util.Date) values[1]), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{date(86_400_000L), date(0L)};
        assertEquivalent(
            capture(values -> subject.method1((java.util.Date) values[0], (java.util.Date) values[1]), caseInputs2),
            capture(values -> subject.method2((java.util.Date) values[0], (java.util.Date) values[1]), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{date(-86_400_000L), date(0L)};
        assertEquivalent(
            capture(values -> subject.method1((java.util.Date) values[0], (java.util.Date) values[1]), caseInputs3),
            capture(values -> subject.method2((java.util.Date) values[0], (java.util.Date) values[1]), caseInputs3)
        );
    }
}
