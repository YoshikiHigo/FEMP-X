package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair4922NoDifferenceTest {

    private final ClonePair4922 subject = new ClonePair4922();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1(((Float) values[0]).floatValue()), new Object[]{-1.0f}),
            capture(values -> subject.method2(((Float) values[0]).floatValue()), new Object[]{-1.0f})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Float) values[0]).floatValue()), new Object[]{0.5f}),
            capture(values -> subject.method2(((Float) values[0]).floatValue()), new Object[]{0.5f})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Float) values[0]).floatValue()), new Object[]{1.0f}),
            capture(values -> subject.method2(((Float) values[0]).floatValue()), new Object[]{1.0f})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Float) values[0]).floatValue()), new Object[]{Float.NaN}),
            capture(values -> subject.method2(((Float) values[0]).floatValue()), new Object[]{Float.NaN})
        );
    }
}
