package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair10536NoDifferenceTest {

    private final ClonePair10536 subject = new ClonePair10536();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1(((Double) values[0]).doubleValue()), new Object[]{-1.0}),
            capture(values -> subject.method2(((Double) values[0]).doubleValue()), new Object[]{-1.0})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Double) values[0]).doubleValue()), new Object[]{0.0}),
            capture(values -> subject.method2(((Double) values[0]).doubleValue()), new Object[]{0.0})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Double) values[0]).doubleValue()), new Object[]{0.5}),
            capture(values -> subject.method2(((Double) values[0]).doubleValue()), new Object[]{0.5})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Double) values[0]).doubleValue()), new Object[]{1.0}),
            capture(values -> subject.method2(((Double) values[0]).doubleValue()), new Object[]{1.0})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Double) values[0]).doubleValue()), new Object[]{2.0}),
            capture(values -> subject.method2(((Double) values[0]).doubleValue()), new Object[]{2.0})
        );
    }
}
