package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair6185NoDifferenceTest {

    private final ClonePair6185 subject = new ClonePair6185();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((java.util.List) values[0], (java.util.List) values[1]), new Object[]{list(), list()}),
            capture(values -> subject.method2((java.util.List) values[0], (java.util.List) values[1]), new Object[]{list(), list()})
        );
        assertEquivalent(
            capture(values -> subject.method1((java.util.List) values[0], (java.util.List) values[1]), new Object[]{null, list()}),
            capture(values -> subject.method2((java.util.List) values[0], (java.util.List) values[1]), new Object[]{null, list()})
        );
        assertEquivalent(
            capture(values -> subject.method1((java.util.List) values[0], (java.util.List) values[1]), new Object[]{list("alpha"), list()}),
            capture(values -> subject.method2((java.util.List) values[0], (java.util.List) values[1]), new Object[]{list("alpha"), list()})
        );
    }
}
