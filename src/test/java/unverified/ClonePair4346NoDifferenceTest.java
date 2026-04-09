package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair4346NoDifferenceTest {

    private final ClonePair4346 subject = new ClonePair4346();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((java.util.Date) values[0], (java.util.Date) values[1]), new Object[]{date(0L), date(0L)}),
            capture(values -> subject.method2((java.util.Date) values[0], (java.util.Date) values[1]), new Object[]{date(0L), date(0L)})
        );
        assertEquivalent(
            capture(values -> subject.method1((java.util.Date) values[0], (java.util.Date) values[1]), new Object[]{null, date(0L)}),
            capture(values -> subject.method2((java.util.Date) values[0], (java.util.Date) values[1]), new Object[]{null, date(0L)})
        );
        assertEquivalent(
            capture(values -> subject.method1((java.util.Date) values[0], (java.util.Date) values[1]), new Object[]{date(86_400_000L), date(0L)}),
            capture(values -> subject.method2((java.util.Date) values[0], (java.util.Date) values[1]), new Object[]{date(86_400_000L), date(0L)})
        );
    }
}
