package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair4430NoDifferenceTest {

    private final ClonePair4430 subject = new ClonePair4430();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1(((Float) values[0]).floatValue(), ((Float) values[1]).floatValue(), ((Float) values[2]).floatValue()), new Object[]{-1.0f, 0.5f, 0.5f}),
            capture(values -> subject.method2(((Float) values[0]).floatValue(), ((Float) values[1]).floatValue(), ((Float) values[2]).floatValue()), new Object[]{-1.0f, 0.5f, 0.5f})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Float) values[0]).floatValue(), ((Float) values[1]).floatValue(), ((Float) values[2]).floatValue()), new Object[]{0.5f, 0.5f, 0.5f}),
            capture(values -> subject.method2(((Float) values[0]).floatValue(), ((Float) values[1]).floatValue(), ((Float) values[2]).floatValue()), new Object[]{0.5f, 0.5f, 0.5f})
        );
    }
}
