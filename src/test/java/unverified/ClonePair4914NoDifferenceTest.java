package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair4914NoDifferenceTest {

    private final ClonePair4914 subject = new ClonePair4914();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1(((Float) values[0]).floatValue()), new Object[]{-1.0f}),
            capture(values -> subject.method2(((Float) values[0]).floatValue()), new Object[]{-1.0f})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Float) values[0]).floatValue()), new Object[]{0.0f}),
            capture(values -> subject.method2(((Float) values[0]).floatValue()), new Object[]{0.0f})
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
            capture(values -> subject.method1(((Float) values[0]).floatValue()), new Object[]{2.0f}),
            capture(values -> subject.method2(((Float) values[0]).floatValue()), new Object[]{2.0f})
        );
    }
}
