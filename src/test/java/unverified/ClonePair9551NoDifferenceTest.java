package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair9551NoDifferenceTest {

    private final ClonePair9551 subject = new ClonePair9551();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((java.util.Calendar) values[0]), new Object[]{calendar(0L)}),
            capture(values -> subject.method2((java.util.Calendar) values[0]), new Object[]{calendar(0L)})
        );
        assertEquivalent(
            capture(values -> subject.method1((java.util.Calendar) values[0]), new Object[]{null}),
            capture(values -> subject.method2((java.util.Calendar) values[0]), new Object[]{null})
        );
        assertEquivalent(
            capture(values -> subject.method1((java.util.Calendar) values[0]), new Object[]{calendar(86_400_000L)}),
            capture(values -> subject.method2((java.util.Calendar) values[0]), new Object[]{calendar(86_400_000L)})
        );
        assertEquivalent(
            capture(values -> subject.method1((java.util.Calendar) values[0]), new Object[]{calendar(1_000_000_000L)}),
            capture(values -> subject.method2((java.util.Calendar) values[0]), new Object[]{calendar(1_000_000_000L)})
        );
    }
}
