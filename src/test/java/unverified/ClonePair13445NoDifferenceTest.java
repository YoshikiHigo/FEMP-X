package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair13445NoDifferenceTest {

    private final ClonePair13445 subject = new ClonePair13445();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), new Object[]{"0"}),
            capture(values -> subject.method2((String) values[0]), new Object[]{"0"})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), new Object[]{null}),
            capture(values -> subject.method2((String) values[0]), new Object[]{null})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), new Object[]{"0A"}),
            capture(values -> subject.method2((String) values[0]), new Object[]{"0A"})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), new Object[]{"7F"}),
            capture(values -> subject.method2((String) values[0]), new Object[]{"7F"})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), new Object[]{"a.b"}),
            capture(values -> subject.method2((String) values[0]), new Object[]{"a.b"})
        );
    }
}
