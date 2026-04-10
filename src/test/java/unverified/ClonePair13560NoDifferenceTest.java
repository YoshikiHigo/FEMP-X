package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair13560NoDifferenceTest {

    private final ClonePair13560 subject = new ClonePair13560();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), new Object[]{""}),
            capture(values -> subject.method2((String) values[0]), new Object[]{""})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), new Object[]{"Key:\"Value\";Other:Two"}),
            capture(values -> subject.method2((String) values[0]), new Object[]{"Key:\"Value\";Other:Two"})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), new Object[]{"a=1|b=2"}),
            capture(values -> subject.method2((String) values[0]), new Object[]{"a=1|b=2"})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), new Object[]{"broken"}),
            capture(values -> subject.method2((String) values[0]), new Object[]{"broken"})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), new Object[]{"foo"}),
            capture(values -> subject.method2((String) values[0]), new Object[]{"foo"})
        );
    }
}
