package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair13482NoDifferenceTest {

    private final ClonePair13482 subject = new ClonePair13482();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), new Object[]{"foo"}),
            capture(values -> subject.method2((String) values[0]), new Object[]{"foo"})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), new Object[]{null}),
            capture(values -> subject.method2((String) values[0]), new Object[]{null})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), new Object[]{"bar"}),
            capture(values -> subject.method2((String) values[0]), new Object[]{"bar"})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), new Object[]{"00"}),
            capture(values -> subject.method2((String) values[0]), new Object[]{"00"})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), new Object[]{"0A"}),
            capture(values -> subject.method2((String) values[0]), new Object[]{"0A"})
        );
    }
}
