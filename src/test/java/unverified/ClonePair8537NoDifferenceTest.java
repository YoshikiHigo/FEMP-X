package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair8537NoDifferenceTest {

    private final ClonePair8537 subject = new ClonePair8537();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((StringBuffer) values[0], (String) values[1]), new Object[]{sb(""), "a"}),
            capture(values -> subject.method2((StringBuffer) values[0], (String) values[1]), new Object[]{sb(""), "a"})
        );
        assertEquivalent(
            capture(values -> subject.method1((StringBuffer) values[0], (String) values[1]), new Object[]{null, "a"}),
            capture(values -> subject.method2((StringBuffer) values[0], (String) values[1]), new Object[]{null, "a"})
        );
        assertEquivalent(
            capture(values -> subject.method1((StringBuffer) values[0], (String) values[1]), new Object[]{sb("a"), "a"}),
            capture(values -> subject.method2((StringBuffer) values[0], (String) values[1]), new Object[]{sb("a"), "a"})
        );
    }
}
