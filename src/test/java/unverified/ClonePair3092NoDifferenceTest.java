package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair3092NoDifferenceTest {

    private final ClonePair3092 subject = new ClonePair3092();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1]), new Object[]{"", ""}),
            capture(values -> subject.method2((String) values[0], (String) values[1]), new Object[]{"", ""})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1]), new Object[]{"Key:\"Value\";Other:Two", ""}),
            capture(values -> subject.method2((String) values[0], (String) values[1]), new Object[]{"Key:\"Value\";Other:Two", ""})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1]), new Object[]{"a=1|b=2", ""}),
            capture(values -> subject.method2((String) values[0], (String) values[1]), new Object[]{"a=1|b=2", ""})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1]), new Object[]{"broken", ""}),
            capture(values -> subject.method2((String) values[0], (String) values[1]), new Object[]{"broken", ""})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1]), new Object[]{"foo", ""}),
            capture(values -> subject.method2((String) values[0], (String) values[1]), new Object[]{"foo", ""})
        );
    }
}
