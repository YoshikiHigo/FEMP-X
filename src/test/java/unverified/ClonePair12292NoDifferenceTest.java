package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair12292NoDifferenceTest {

    private final ClonePair12292 subject = new ClonePair12292();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((java.util.Collection) values[0], (String) values[1]), new Object[]{list(), null}),
            capture(values -> subject.method2((java.util.Collection) values[0], (String) values[1]), new Object[]{list(), null})
        );
        assertEquivalent(
            capture(values -> subject.method1((java.util.Collection) values[0], (String) values[1]), new Object[]{null, null}),
            capture(values -> subject.method2((java.util.Collection) values[0], (String) values[1]), new Object[]{null, null})
        );
        assertEquivalent(
            capture(values -> subject.method1((java.util.Collection) values[0], (String) values[1]), new Object[]{list("alpha"), null}),
            capture(values -> subject.method2((java.util.Collection) values[0], (String) values[1]), new Object[]{list("alpha"), null})
        );
        assertEquivalent(
            capture(values -> subject.method1((java.util.Collection) values[0], (String) values[1]), new Object[]{list("alpha", "beta"), null}),
            capture(values -> subject.method2((java.util.Collection) values[0], (String) values[1]), new Object[]{list("alpha", "beta"), null})
        );
        assertEquivalent(
            capture(values -> subject.method1((java.util.Collection) values[0], (String) values[1]), new Object[]{list("alpha", "beta"), "foo"}),
            capture(values -> subject.method2((java.util.Collection) values[0], (String) values[1]), new Object[]{list("alpha", "beta"), "foo"})
        );
    }
}
