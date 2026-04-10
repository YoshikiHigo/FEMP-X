package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair13161NoDifferenceTest {

    private final ClonePair13161 subject = new ClonePair13161();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((java.util.Calendar) values[0], (java.util.Calendar) values[1]), new Object[]{calendar(0L), calendar(0L)}),
            capture(values -> subject.method2((java.util.Calendar) values[0], (java.util.Calendar) values[1]), new Object[]{calendar(0L), calendar(0L)})
        );
        assertEquivalent(
            capture(values -> subject.method1((java.util.Calendar) values[0], (java.util.Calendar) values[1]), new Object[]{null, calendar(0L)}),
            capture(values -> subject.method2((java.util.Calendar) values[0], (java.util.Calendar) values[1]), new Object[]{null, calendar(0L)})
        );
    }
}
