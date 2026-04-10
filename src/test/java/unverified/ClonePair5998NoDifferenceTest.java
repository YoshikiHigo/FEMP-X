package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair5998NoDifferenceTest {

    private final ClonePair5998 subject = new ClonePair5998();

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
