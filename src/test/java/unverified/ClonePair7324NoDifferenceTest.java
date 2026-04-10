package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair7324NoDifferenceTest {

    private final ClonePair7324 subject = new ClonePair7324();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((java.util.Vector) values[0]), new Object[]{vector()}),
            capture(values -> subject.method2((java.util.Vector) values[0]), new Object[]{vector()})
        );
        assertEquivalent(
            capture(values -> subject.method1((java.util.Vector) values[0]), new Object[]{null}),
            capture(values -> subject.method2((java.util.Vector) values[0]), new Object[]{null})
        );
    }
}
