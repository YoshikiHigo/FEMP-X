package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair6616NoDifferenceTest {

    private final ClonePair6616 subject = new ClonePair6616();

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
