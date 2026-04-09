package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair4185NoDifferenceTest {

    private final ClonePair4185 subject = new ClonePair4185();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1]), new Object[]{"", ""}),
            capture(values -> subject.method2((String) values[0], (String) values[1]), new Object[]{"", ""})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1]), new Object[]{null, ""}),
            capture(values -> subject.method2((String) values[0], (String) values[1]), new Object[]{null, ""})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1]), new Object[]{"foo", ""}),
            capture(values -> subject.method2((String) values[0], (String) values[1]), new Object[]{"foo", ""})
        );
    }
}
