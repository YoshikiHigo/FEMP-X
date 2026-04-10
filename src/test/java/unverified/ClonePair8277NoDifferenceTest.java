package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair8277NoDifferenceTest {

    private final ClonePair8277 subject = new ClonePair8277();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1]), new Object[]{"", ""}),
            capture(values -> subject.method2((String) values[0], (String) values[1]), new Object[]{"", ""})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1]), new Object[]{"Key:\"Value\";Other:Two", "Key:\"Value\";Other:Two"}),
            capture(values -> subject.method2((String) values[0], (String) values[1]), new Object[]{"Key:\"Value\";Other:Two", "Key:\"Value\";Other:Two"})
        );
    }
}
