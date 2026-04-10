package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair9534NoDifferenceTest {

    private final ClonePair9534 subject = new ClonePair9534();

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
    }
}
