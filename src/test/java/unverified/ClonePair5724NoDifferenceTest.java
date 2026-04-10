package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair5724NoDifferenceTest {

    private final ClonePair5724 subject = new ClonePair5724();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Boolean) values[1]).booleanValue()), new Object[]{"", false}),
            capture(values -> subject.method2((String) values[0], ((Boolean) values[1]).booleanValue()), new Object[]{"", false})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Boolean) values[1]).booleanValue()), new Object[]{"foo", false}),
            capture(values -> subject.method2((String) values[0], ((Boolean) values[1]).booleanValue()), new Object[]{"foo", false})
        );
    }
}
