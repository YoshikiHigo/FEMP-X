package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair13647NoDifferenceTest {

    private final ClonePair13647 subject = new ClonePair13647();

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
            capture(values -> subject.method1((String) values[0]), new Object[]{"ab"}),
            capture(values -> subject.method2((String) values[0]), new Object[]{"ab"})
        );
    }
}
