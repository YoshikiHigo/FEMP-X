package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair13398NoDifferenceTest {

    private final ClonePair13398 subject = new ClonePair13398();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), new Object[]{""}),
            capture(values -> subject.method2((String) values[0]), new Object[]{""})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), new Object[]{null}),
            capture(values -> subject.method2((String) values[0]), new Object[]{null})
        );
    }
}
