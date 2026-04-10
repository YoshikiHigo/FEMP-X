package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair7025NoDifferenceTest {

    private final ClonePair7025 subject = new ClonePair7025();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{0.5f, -1.0f, 0.5f, -1.0f, -1.0f};
        assertEquivalent(
            capture(values -> subject.method1(((Float) values[0]).floatValue(), ((Float) values[1]).floatValue(), ((Float) values[2]).floatValue(), ((Float) values[3]).floatValue(), ((Float) values[4]).floatValue()), caseInputs0),
            capture(values -> subject.method2(((Float) values[0]).floatValue(), ((Float) values[1]).floatValue(), ((Float) values[2]).floatValue(), ((Float) values[3]).floatValue(), ((Float) values[4]).floatValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{-1.0f, -1.0f, 0.5f, 0.0f, -1.0f};
        assertEquivalent(
            capture(values -> subject.method1(((Float) values[0]).floatValue(), ((Float) values[1]).floatValue(), ((Float) values[2]).floatValue(), ((Float) values[3]).floatValue(), ((Float) values[4]).floatValue()), caseInputs1),
            capture(values -> subject.method2(((Float) values[0]).floatValue(), ((Float) values[1]).floatValue(), ((Float) values[2]).floatValue(), ((Float) values[3]).floatValue(), ((Float) values[4]).floatValue()), caseInputs1)
        );
    }
}
