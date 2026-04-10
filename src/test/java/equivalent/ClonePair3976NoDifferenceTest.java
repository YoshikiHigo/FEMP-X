package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair3976NoDifferenceTest {

    private final ClonePair3976 subject = new ClonePair3976();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1(((Float) values[0]).floatValue(), ((Float) values[1]).floatValue()), new Object[]{-1.0f, -1.0f}),
            capture(values -> subject.method2(((Float) values[0]).floatValue(), ((Float) values[1]).floatValue()), new Object[]{-1.0f, -1.0f})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Float) values[0]).floatValue(), ((Float) values[1]).floatValue()), new Object[]{0.0f, -1.0f}),
            capture(values -> subject.method2(((Float) values[0]).floatValue(), ((Float) values[1]).floatValue()), new Object[]{0.0f, -1.0f})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Float) values[0]).floatValue(), ((Float) values[1]).floatValue()), new Object[]{0.5f, -1.0f}),
            capture(values -> subject.method2(((Float) values[0]).floatValue(), ((Float) values[1]).floatValue()), new Object[]{0.5f, -1.0f})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Float) values[0]).floatValue(), ((Float) values[1]).floatValue()), new Object[]{2.0f, -1.0f}),
            capture(values -> subject.method2(((Float) values[0]).floatValue(), ((Float) values[1]).floatValue()), new Object[]{2.0f, -1.0f})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Float) values[0]).floatValue(), ((Float) values[1]).floatValue()), new Object[]{Float.NaN, -1.0f}),
            capture(values -> subject.method2(((Float) values[0]).floatValue(), ((Float) values[1]).floatValue()), new Object[]{Float.NaN, -1.0f})
        );
    }
}
