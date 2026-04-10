package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair12572NoDifferenceTest {

    private final ClonePair12572 subject = new ClonePair12572();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{"a", false};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Boolean) values[1]).booleanValue()), caseInputs0),
            capture(values -> subject.method2((String) values[0], ((Boolean) values[1]).booleanValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, false};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Boolean) values[1]).booleanValue()), caseInputs1),
            capture(values -> subject.method2((String) values[0], ((Boolean) values[1]).booleanValue()), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{"", false};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Boolean) values[1]).booleanValue()), caseInputs2),
            capture(values -> subject.method2((String) values[0], ((Boolean) values[1]).booleanValue()), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{"a.b", false};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Boolean) values[1]).booleanValue()), caseInputs3),
            capture(values -> subject.method2((String) values[0], ((Boolean) values[1]).booleanValue()), caseInputs3)
        );
        Object[] caseInputs4 = new Object[]{"a.b.c", false};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Boolean) values[1]).booleanValue()), caseInputs4),
            capture(values -> subject.method2((String) values[0], ((Boolean) values[1]).booleanValue()), caseInputs4)
        );
    }
}
