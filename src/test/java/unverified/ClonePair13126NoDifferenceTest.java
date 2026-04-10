package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair13126NoDifferenceTest {

    private final ClonePair13126 subject = new ClonePair13126();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), new Object[]{null}),
            capture(values -> subject.method2((String) values[0]), new Object[]{null})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), new Object[]{"00"}),
            capture(values -> subject.method2((String) values[0]), new Object[]{"00"})
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
            capture(values -> subject.method1((String) values[0]), new Object[]{"a"}),
            capture(values -> subject.method2((String) values[0]), new Object[]{"a"})
        );
    }
}
