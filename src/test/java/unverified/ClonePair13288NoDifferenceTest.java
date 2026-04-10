package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair13288NoDifferenceTest {

    private final ClonePair13288 subject = new ClonePair13288();

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
    }
}
