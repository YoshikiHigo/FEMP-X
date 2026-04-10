package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair11300NoDifferenceTest {

    private final ClonePair11300 subject = new ClonePair11300();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((Number) values[0], (Number) values[1]), new Object[]{Integer.valueOf(-1), Integer.valueOf(1)}),
            capture(values -> subject.method2((Number) values[0], (Number) values[1]), new Object[]{Integer.valueOf(-1), Integer.valueOf(1)})
        );
        assertEquivalent(
            capture(values -> subject.method1((Number) values[0], (Number) values[1]), new Object[]{Integer.valueOf(-1), null}),
            capture(values -> subject.method2((Number) values[0], (Number) values[1]), new Object[]{Integer.valueOf(-1), null})
        );
        assertEquivalent(
            capture(values -> subject.method1((Number) values[0], (Number) values[1]), new Object[]{Integer.valueOf(-1), Integer.valueOf(0)}),
            capture(values -> subject.method2((Number) values[0], (Number) values[1]), new Object[]{Integer.valueOf(-1), Integer.valueOf(0)})
        );
        assertEquivalent(
            capture(values -> subject.method1((Number) values[0], (Number) values[1]), new Object[]{Integer.valueOf(-1), Double.valueOf(1.5)}),
            capture(values -> subject.method2((Number) values[0], (Number) values[1]), new Object[]{Integer.valueOf(-1), Double.valueOf(1.5)})
        );
        assertEquivalent(
            capture(values -> subject.method1((Number) values[0], (Number) values[1]), new Object[]{null, null}),
            capture(values -> subject.method2((Number) values[0], (Number) values[1]), new Object[]{null, null})
        );
    }
}
