package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair4135NoDifferenceTest {

    private final ClonePair4135 subject = new ClonePair4135();

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
        assertEquivalent(
            capture(values -> subject.method1((java.util.List) values[0], (java.util.List) values[1]), new Object[]{list("alpha", "beta"), list()}),
            capture(values -> subject.method2((java.util.List) values[0], (java.util.List) values[1]), new Object[]{list("alpha", "beta"), list()})
        );
        assertEquivalent(
            capture(values -> subject.method1((java.util.List) values[0], (java.util.List) values[1]), new Object[]{list("beta", "gamma"), list()}),
            capture(values -> subject.method2((java.util.List) values[0], (java.util.List) values[1]), new Object[]{list("beta", "gamma"), list()})
        );
    }
}
