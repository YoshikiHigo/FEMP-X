package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair8855NoDifferenceTest {

    private final ClonePair8855 subject = new ClonePair8855();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1]), new Object[]{"foo", "foo"}),
            capture(values -> subject.method2((String) values[0], (String) values[1]), new Object[]{"foo", "foo"})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1]), new Object[]{null, "foo"}),
            capture(values -> subject.method2((String) values[0], (String) values[1]), new Object[]{null, "foo"})
        );
    }
}
