package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair6548NoDifferenceTest {

    private final ClonePair6548 subject = new ClonePair6548();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{"a", false, false, false};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Boolean) values[1]).booleanValue(), ((Boolean) values[2]).booleanValue(), ((Boolean) values[3]).booleanValue()), caseInputs0),
            capture(values -> subject.method2((String) values[0], ((Boolean) values[1]).booleanValue(), ((Boolean) values[2]).booleanValue(), ((Boolean) values[3]).booleanValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, false, false, false};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Boolean) values[1]).booleanValue(), ((Boolean) values[2]).booleanValue(), ((Boolean) values[3]).booleanValue()), caseInputs1),
            capture(values -> subject.method2((String) values[0], ((Boolean) values[1]).booleanValue(), ((Boolean) values[2]).booleanValue(), ((Boolean) values[3]).booleanValue()), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{"a.b", false, false, false};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Boolean) values[1]).booleanValue(), ((Boolean) values[2]).booleanValue(), ((Boolean) values[3]).booleanValue()), caseInputs2),
            capture(values -> subject.method2((String) values[0], ((Boolean) values[1]).booleanValue(), ((Boolean) values[2]).booleanValue(), ((Boolean) values[3]).booleanValue()), caseInputs2)
        );
    }
}
