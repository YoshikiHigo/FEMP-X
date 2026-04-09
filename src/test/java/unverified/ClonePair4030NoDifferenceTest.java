package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair4030NoDifferenceTest {

    private final ClonePair4030 subject = new ClonePair4030();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1]), new Object[]{"Key:\"Value\";Other:Two", "Key:\"Value\";Other:Two"}),
            capture(values -> subject.method2((String) values[0], (String) values[1]), new Object[]{"Key:\"Value\";Other:Two", "Key:\"Value\";Other:Two"})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1]), new Object[]{null, "Key:\"Value\";Other:Two"}),
            capture(values -> subject.method2((String) values[0], (String) values[1]), new Object[]{null, "Key:\"Value\";Other:Two"})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1]), new Object[]{"a=1|b=2", "Key:\"Value\";Other:Two"}),
            capture(values -> subject.method2((String) values[0], (String) values[1]), new Object[]{"a=1|b=2", "Key:\"Value\";Other:Two"})
        );
    }
}
