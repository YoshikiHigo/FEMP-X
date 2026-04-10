package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair6629NoDifferenceTest {

    private final ClonePair6629 subject = new ClonePair6629();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1(((Double) values[0]).doubleValue(), ((Integer) values[1]).intValue()), new Object[]{-1.0, -1}),
            capture(values -> subject.method2(((Double) values[0]).doubleValue(), ((Integer) values[1]).intValue()), new Object[]{-1.0, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Double) values[0]).doubleValue(), ((Integer) values[1]).intValue()), new Object[]{0.0, -1}),
            capture(values -> subject.method2(((Double) values[0]).doubleValue(), ((Integer) values[1]).intValue()), new Object[]{0.0, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Double) values[0]).doubleValue(), ((Integer) values[1]).intValue()), new Object[]{0.5, -1}),
            capture(values -> subject.method2(((Double) values[0]).doubleValue(), ((Integer) values[1]).intValue()), new Object[]{0.5, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Double) values[0]).doubleValue(), ((Integer) values[1]).intValue()), new Object[]{1.0, -1}),
            capture(values -> subject.method2(((Double) values[0]).doubleValue(), ((Integer) values[1]).intValue()), new Object[]{1.0, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Double) values[0]).doubleValue(), ((Integer) values[1]).intValue()), new Object[]{2.0, -1}),
            capture(values -> subject.method2(((Double) values[0]).doubleValue(), ((Integer) values[1]).intValue()), new Object[]{2.0, -1})
        );
    }
}
