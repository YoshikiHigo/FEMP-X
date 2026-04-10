package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair5995NoDifferenceTest {

    private final ClonePair5995 subject = new ClonePair5995();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((java.util.Vector) values[0], (java.util.Vector) values[1]), new Object[]{vector(), vector()}),
            capture(values -> subject.method2((java.util.Vector) values[0], (java.util.Vector) values[1]), new Object[]{vector(), vector()})
        );
        assertEquivalent(
            capture(values -> subject.method1((java.util.Vector) values[0], (java.util.Vector) values[1]), new Object[]{null, null}),
            capture(values -> subject.method2((java.util.Vector) values[0], (java.util.Vector) values[1]), new Object[]{null, null})
        );
    }
}
