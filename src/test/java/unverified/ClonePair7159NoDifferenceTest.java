package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair7159NoDifferenceTest {

    private final ClonePair7159 subject = new ClonePair7159();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((java.util.Collection) values[0], (String) values[1]), new Object[]{list(), null}),
            capture(values -> subject.method2((java.util.Collection) values[0], (String) values[1]), new Object[]{list(), null})
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
            capture(values -> subject.method1((java.util.Collection) values[0], (String) values[1]), new Object[]{list("alpha", "beta"), "a"}),
            capture(values -> subject.method2((java.util.Collection) values[0], (String) values[1]), new Object[]{list("alpha", "beta"), "a"})
        );
        assertEquivalent(
            capture(values -> subject.method1((java.util.Collection) values[0], (String) values[1]), new Object[]{list("alpha", "beta"), "A"}),
            capture(values -> subject.method2((java.util.Collection) values[0], (String) values[1]), new Object[]{list("alpha", "beta"), "A"})
        );
    }
}
