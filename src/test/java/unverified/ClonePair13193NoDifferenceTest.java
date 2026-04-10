package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair13193NoDifferenceTest {

    private final ClonePair13193 subject = new ClonePair13193();

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
        assertEquivalent(
            capture(values -> subject.method1((java.util.Calendar) values[0], (java.util.Calendar) values[1]), new Object[]{calendar(86_400_000L), calendar(0L)}),
            capture(values -> subject.method2((java.util.Calendar) values[0], (java.util.Calendar) values[1]), new Object[]{calendar(86_400_000L), calendar(0L)})
        );
    }
}
