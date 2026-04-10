package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair6667NoDifferenceTest {

    private final ClonePair6667 subject = new ClonePair6667();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{-1.0f, -1.0f, -1.0f, -1.0f};
        assertEquivalent(
            capture(values -> subject.method1(((Float) values[0]).floatValue(), ((Float) values[1]).floatValue(), ((Float) values[2]).floatValue(), ((Float) values[3]).floatValue()), caseInputs0),
            capture(values -> subject.method2(((Float) values[0]).floatValue(), ((Float) values[1]).floatValue(), ((Float) values[2]).floatValue(), ((Float) values[3]).floatValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{0.0f, -1.0f, -1.0f, -1.0f};
        assertEquivalent(
            capture(values -> subject.method1(((Float) values[0]).floatValue(), ((Float) values[1]).floatValue(), ((Float) values[2]).floatValue(), ((Float) values[3]).floatValue()), caseInputs1),
            capture(values -> subject.method2(((Float) values[0]).floatValue(), ((Float) values[1]).floatValue(), ((Float) values[2]).floatValue(), ((Float) values[3]).floatValue()), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{0.5f, -1.0f, -1.0f, -1.0f};
        assertEquivalent(
            capture(values -> subject.method1(((Float) values[0]).floatValue(), ((Float) values[1]).floatValue(), ((Float) values[2]).floatValue(), ((Float) values[3]).floatValue()), caseInputs2),
            capture(values -> subject.method2(((Float) values[0]).floatValue(), ((Float) values[1]).floatValue(), ((Float) values[2]).floatValue(), ((Float) values[3]).floatValue()), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{-1.0f, 0.5f, -1.0f, -1.0f};
        assertEquivalent(
            capture(values -> subject.method1(((Float) values[0]).floatValue(), ((Float) values[1]).floatValue(), ((Float) values[2]).floatValue(), ((Float) values[3]).floatValue()), caseInputs3),
            capture(values -> subject.method2(((Float) values[0]).floatValue(), ((Float) values[1]).floatValue(), ((Float) values[2]).floatValue(), ((Float) values[3]).floatValue()), caseInputs3)
        );
        Object[] caseInputs4 = new Object[]{-1.0f, 1.0f, -1.0f, -1.0f};
        assertEquivalent(
            capture(values -> subject.method1(((Float) values[0]).floatValue(), ((Float) values[1]).floatValue(), ((Float) values[2]).floatValue(), ((Float) values[3]).floatValue()), caseInputs4),
            capture(values -> subject.method2(((Float) values[0]).floatValue(), ((Float) values[1]).floatValue(), ((Float) values[2]).floatValue(), ((Float) values[3]).floatValue()), caseInputs4)
        );
    }
}
