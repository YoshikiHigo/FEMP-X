package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair5129NoDifferenceTest {

    private final ClonePair5129 subject = new ClonePair5129();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((java.util.Set) values[0], (java.util.Set) values[1]), new Object[]{linkedSet(), linkedSet()}),
            capture(values -> subject.method2((java.util.Set) values[0], (java.util.Set) values[1]), new Object[]{linkedSet(), linkedSet()})
        );
        assertEquivalent(
            capture(values -> subject.method1((java.util.Set) values[0], (java.util.Set) values[1]), new Object[]{null, linkedSet()}),
            capture(values -> subject.method2((java.util.Set) values[0], (java.util.Set) values[1]), new Object[]{null, linkedSet()})
        );
        assertEquivalent(
            capture(values -> subject.method1((java.util.Set) values[0], (java.util.Set) values[1]), new Object[]{linkedSet("alpha"), linkedSet()}),
            capture(values -> subject.method2((java.util.Set) values[0], (java.util.Set) values[1]), new Object[]{linkedSet("alpha"), linkedSet()})
        );
    }
}
