package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair4095NoDifferenceTest {

    private final ClonePair4095 subject = new ClonePair4095();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1(((Double) values[0]).doubleValue(), ((Double) values[1]).doubleValue()), new Object[]{-1.0, 0.5}),
            capture(values -> subject.method2(((Double) values[0]).doubleValue(), ((Double) values[1]).doubleValue()), new Object[]{-1.0, 0.5})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Double) values[0]).doubleValue(), ((Double) values[1]).doubleValue()), new Object[]{0.0, 0.5}),
            capture(values -> subject.method2(((Double) values[0]).doubleValue(), ((Double) values[1]).doubleValue()), new Object[]{0.0, 0.5})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Double) values[0]).doubleValue(), ((Double) values[1]).doubleValue()), new Object[]{0.5, 0.5}),
            capture(values -> subject.method2(((Double) values[0]).doubleValue(), ((Double) values[1]).doubleValue()), new Object[]{0.5, 0.5})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Double) values[0]).doubleValue(), ((Double) values[1]).doubleValue()), new Object[]{1.0, 0.5}),
            capture(values -> subject.method2(((Double) values[0]).doubleValue(), ((Double) values[1]).doubleValue()), new Object[]{1.0, 0.5})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Double) values[0]).doubleValue(), ((Double) values[1]).doubleValue()), new Object[]{2.0, 0.5}),
            capture(values -> subject.method2(((Double) values[0]).doubleValue(), ((Double) values[1]).doubleValue()), new Object[]{2.0, 0.5})
        );
    }
}
