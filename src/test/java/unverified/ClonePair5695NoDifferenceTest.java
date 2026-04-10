package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair5695NoDifferenceTest {

    private final ClonePair5695 subject = new ClonePair5695();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Boolean) values[2]).booleanValue()), new Object[]{"", "foo", false}),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Boolean) values[2]).booleanValue()), new Object[]{"", "foo", false})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Boolean) values[2]).booleanValue()), new Object[]{null, "foo", false}),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Boolean) values[2]).booleanValue()), new Object[]{null, "foo", false})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Boolean) values[2]).booleanValue()), new Object[]{"foo", "foo", false}),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Boolean) values[2]).booleanValue()), new Object[]{"foo", "foo", false})
        );
    }
}
