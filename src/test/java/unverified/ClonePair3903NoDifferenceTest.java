package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair3903NoDifferenceTest {

    private final ClonePair3903 subject = new ClonePair3903();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1]), new Object[]{"", ""}),
            capture(values -> subject.method2((String) values[0], (String) values[1]), new Object[]{"", ""})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1]), new Object[]{"a", "a"}),
            capture(values -> subject.method2((String) values[0], (String) values[1]), new Object[]{"a", "a"})
        );
    }
}
