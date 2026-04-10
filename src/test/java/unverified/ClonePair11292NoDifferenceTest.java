package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair11292NoDifferenceTest {

    private final ClonePair11292 subject = new ClonePair11292();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((Number) values[0], (Number) values[1]), new Object[]{Integer.valueOf(-1), Integer.valueOf(1)}),
            capture(values -> subject.method2((Number) values[0], (Number) values[1]), new Object[]{Integer.valueOf(-1), Integer.valueOf(1)})
        );
        assertEquivalent(
            capture(values -> subject.method1((Number) values[0], (Number) values[1]), new Object[]{null, Integer.valueOf(1)}),
            capture(values -> subject.method2((Number) values[0], (Number) values[1]), new Object[]{null, Integer.valueOf(1)})
        );
        assertEquivalent(
            capture(values -> subject.method1((Number) values[0], (Number) values[1]), new Object[]{Integer.valueOf(0), Integer.valueOf(1)}),
            capture(values -> subject.method2((Number) values[0], (Number) values[1]), new Object[]{Integer.valueOf(0), Integer.valueOf(1)})
        );
        assertEquivalent(
            capture(values -> subject.method1((Number) values[0], (Number) values[1]), new Object[]{Double.valueOf(-2.0), Integer.valueOf(1)}),
            capture(values -> subject.method2((Number) values[0], (Number) values[1]), new Object[]{Double.valueOf(-2.0), Integer.valueOf(1)})
        );
        assertEquivalent(
            capture(values -> subject.method1((Number) values[0], (Number) values[1]), new Object[]{null, null}),
            capture(values -> subject.method2((Number) values[0], (Number) values[1]), new Object[]{null, null})
        );
    }
}
