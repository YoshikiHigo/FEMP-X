package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair4225NoDifferenceTest {

    private final ClonePair4225 subject = new ClonePair4225();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1(((Float) values[0]).floatValue(), ((Float) values[1]).floatValue(), ((Float) values[2]).floatValue()), new Object[]{-1.0f, -1.0f, -1.0f}),
            capture(values -> subject.method2(((Float) values[0]).floatValue(), ((Float) values[1]).floatValue(), ((Float) values[2]).floatValue()), new Object[]{-1.0f, -1.0f, -1.0f})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Float) values[0]).floatValue(), ((Float) values[1]).floatValue(), ((Float) values[2]).floatValue()), new Object[]{0.0f, -1.0f, -1.0f}),
            capture(values -> subject.method2(((Float) values[0]).floatValue(), ((Float) values[1]).floatValue(), ((Float) values[2]).floatValue()), new Object[]{0.0f, -1.0f, -1.0f})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Float) values[0]).floatValue(), ((Float) values[1]).floatValue(), ((Float) values[2]).floatValue()), new Object[]{0.5f, -1.0f, -1.0f}),
            capture(values -> subject.method2(((Float) values[0]).floatValue(), ((Float) values[1]).floatValue(), ((Float) values[2]).floatValue()), new Object[]{0.5f, -1.0f, -1.0f})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Float) values[0]).floatValue(), ((Float) values[1]).floatValue(), ((Float) values[2]).floatValue()), new Object[]{1.0f, -1.0f, -1.0f}),
            capture(values -> subject.method2(((Float) values[0]).floatValue(), ((Float) values[1]).floatValue(), ((Float) values[2]).floatValue()), new Object[]{1.0f, -1.0f, -1.0f})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Float) values[0]).floatValue(), ((Float) values[1]).floatValue(), ((Float) values[2]).floatValue()), new Object[]{-1.0f, 0.0f, 0.5f}),
            capture(values -> subject.method2(((Float) values[0]).floatValue(), ((Float) values[1]).floatValue(), ((Float) values[2]).floatValue()), new Object[]{-1.0f, 0.0f, 0.5f})
        );
    }
}
