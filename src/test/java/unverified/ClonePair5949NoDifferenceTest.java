package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair5949NoDifferenceTest {

    private final ClonePair5949 subject = new ClonePair5949();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1]), new Object[]{"foo", ""}),
            capture(values -> subject.method2((String) values[0], (String) values[1]), new Object[]{"foo", ""})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1]), new Object[]{null, ""}),
            capture(values -> subject.method2((String) values[0], (String) values[1]), new Object[]{null, ""})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1]), new Object[]{"", ""}),
            capture(values -> subject.method2((String) values[0], (String) values[1]), new Object[]{"", ""})
        );
    }
}
