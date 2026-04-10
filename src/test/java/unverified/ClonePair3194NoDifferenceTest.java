package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair3194NoDifferenceTest {

    private final ClonePair3194 subject = new ClonePair3194();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1(((Double) values[0]).doubleValue(), ((Integer) values[1]).intValue()), new Object[]{-1.0, -1}),
            capture(values -> subject.method2(((Double) values[0]).doubleValue(), ((Integer) values[1]).intValue()), new Object[]{-1.0, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Double) values[0]).doubleValue(), ((Integer) values[1]).intValue()), new Object[]{-1.0, 0}),
            capture(values -> subject.method2(((Double) values[0]).doubleValue(), ((Integer) values[1]).intValue()), new Object[]{-1.0, 0})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Double) values[0]).doubleValue(), ((Integer) values[1]).intValue()), new Object[]{0.0, 0}),
            capture(values -> subject.method2(((Double) values[0]).doubleValue(), ((Integer) values[1]).intValue()), new Object[]{0.0, 0})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Double) values[0]).doubleValue(), ((Integer) values[1]).intValue()), new Object[]{0.5, 0}),
            capture(values -> subject.method2(((Double) values[0]).doubleValue(), ((Integer) values[1]).intValue()), new Object[]{0.5, 0})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Double) values[0]).doubleValue(), ((Integer) values[1]).intValue()), new Object[]{0.5, 1}),
            capture(values -> subject.method2(((Double) values[0]).doubleValue(), ((Integer) values[1]).intValue()), new Object[]{0.5, 1})
        );
    }
}
