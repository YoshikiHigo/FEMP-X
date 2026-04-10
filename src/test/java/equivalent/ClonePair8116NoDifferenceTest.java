package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair8116NoDifferenceTest {

    private final ClonePair8116 subject = new ClonePair8116();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{new java.util.GregorianCalendar(java.util.TimeZone.getTimeZone("UTC")), new java.util.GregorianCalendar(java.util.TimeZone.getTimeZone("UTC"))};
        assertEquivalent(
            capture(values -> subject.method1((java.util.GregorianCalendar) values[0], (java.util.GregorianCalendar) values[1]), caseInputs0),
            capture(values -> subject.method2((java.util.GregorianCalendar) values[0], (java.util.GregorianCalendar) values[1]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, new java.util.GregorianCalendar(java.util.TimeZone.getTimeZone("UTC"))};
        assertEquivalent(
            capture(values -> subject.method1((java.util.GregorianCalendar) values[0], (java.util.GregorianCalendar) values[1]), caseInputs1),
            capture(values -> subject.method2((java.util.GregorianCalendar) values[0], (java.util.GregorianCalendar) values[1]), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{new java.util.GregorianCalendar(2020, java.util.Calendar.JANUARY, 2), new java.util.GregorianCalendar(java.util.TimeZone.getTimeZone("UTC"))};
        assertEquivalent(
            capture(values -> subject.method1((java.util.GregorianCalendar) values[0], (java.util.GregorianCalendar) values[1]), caseInputs2),
            capture(values -> subject.method2((java.util.GregorianCalendar) values[0], (java.util.GregorianCalendar) values[1]), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{new java.util.GregorianCalendar(java.util.TimeZone.getTimeZone("UTC")), new java.util.GregorianCalendar(2020, java.util.Calendar.JANUARY, 2)};
        assertEquivalent(
            capture(values -> subject.method1((java.util.GregorianCalendar) values[0], (java.util.GregorianCalendar) values[1]), caseInputs3),
            capture(values -> subject.method2((java.util.GregorianCalendar) values[0], (java.util.GregorianCalendar) values[1]), caseInputs3)
        );
    }
}
