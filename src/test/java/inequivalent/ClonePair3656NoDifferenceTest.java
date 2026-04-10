package inequivalent;

import org.junit.jupiter.api.Test;

import static inequivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair3656NoDifferenceTest {

    private final ClonePair3656 subject = new ClonePair3656();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{"a", 1, '\0', false};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue(), ((Character) values[2]).charValue(), ((Boolean) values[3]).booleanValue()), caseInputs0),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue(), ((Character) values[2]).charValue(), ((Boolean) values[3]).booleanValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, 1, '\0', false};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue(), ((Character) values[2]).charValue(), ((Boolean) values[3]).booleanValue()), caseInputs1),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue(), ((Character) values[2]).charValue(), ((Boolean) values[3]).booleanValue()), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{"A", 1, '\0', false};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue(), ((Character) values[2]).charValue(), ((Boolean) values[3]).booleanValue()), caseInputs2),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue(), ((Character) values[2]).charValue(), ((Boolean) values[3]).booleanValue()), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{"a", 2, '\0', false};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue(), ((Character) values[2]).charValue(), ((Boolean) values[3]).booleanValue()), caseInputs3),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue(), ((Character) values[2]).charValue(), ((Boolean) values[3]).booleanValue()), caseInputs3)
        );
        Object[] caseInputs4 = new Object[]{"", 1, '\0', false};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue(), ((Character) values[2]).charValue(), ((Boolean) values[3]).booleanValue()), caseInputs4),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue(), ((Character) values[2]).charValue(), ((Boolean) values[3]).booleanValue()), caseInputs4)
        );
    }
}
