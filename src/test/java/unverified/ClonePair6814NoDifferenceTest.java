package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair6814NoDifferenceTest {

    private final ClonePair6814 subject = new ClonePair6814();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((java.util.Date) values[0]), new Object[]{date(0L)}),
            capture(values -> subject.method2((java.util.Date) values[0]), new Object[]{date(0L)})
        );
        assertEquivalent(
            capture(values -> subject.method1((java.util.Date) values[0]), new Object[]{null}),
            capture(values -> subject.method2((java.util.Date) values[0]), new Object[]{null})
        );
    }
}
