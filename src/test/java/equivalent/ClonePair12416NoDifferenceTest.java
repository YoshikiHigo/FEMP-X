package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair12416NoDifferenceTest {

    private final ClonePair12416 subject = new ClonePair12416();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{"", false};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Boolean) values[1]).booleanValue()), caseInputs0),
            capture(values -> subject.method2((String) values[0], ((Boolean) values[1]).booleanValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, false};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Boolean) values[1]).booleanValue()), caseInputs1),
            capture(values -> subject.method2((String) values[0], ((Boolean) values[1]).booleanValue()), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{"a", false};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Boolean) values[1]).booleanValue()), caseInputs2),
            capture(values -> subject.method2((String) values[0], ((Boolean) values[1]).booleanValue()), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{"A", false};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Boolean) values[1]).booleanValue()), caseInputs3),
            capture(values -> subject.method2((String) values[0], ((Boolean) values[1]).booleanValue()), caseInputs3)
        );
        Object[] caseInputs4 = new Object[]{"abc", false};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Boolean) values[1]).booleanValue()), caseInputs4),
            capture(values -> subject.method2((String) values[0], ((Boolean) values[1]).booleanValue()), caseInputs4)
        );
    }
}
