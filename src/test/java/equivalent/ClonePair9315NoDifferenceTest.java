package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair9315NoDifferenceTest {

    private final ClonePair9315 subject = new ClonePair9315();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{new java.util.GregorianCalendar(java.util.TimeZone.getTimeZone("UTC"))};
        assertEquivalent(
            capture(values -> subject.method1((java.util.GregorianCalendar) values[0]), caseInputs0),
            capture(values -> subject.method2((java.util.GregorianCalendar) values[0]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null};
        assertEquivalent(
            capture(values -> subject.method1((java.util.GregorianCalendar) values[0]), caseInputs1),
            capture(values -> subject.method2((java.util.GregorianCalendar) values[0]), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{new java.util.GregorianCalendar(2020, java.util.Calendar.JANUARY, 2)};
        assertEquivalent(
            capture(values -> subject.method1((java.util.GregorianCalendar) values[0]), caseInputs2),
            capture(values -> subject.method2((java.util.GregorianCalendar) values[0]), caseInputs2)
        );
    }
}
