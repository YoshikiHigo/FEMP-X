package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair6793NoDifferenceTest {

    private final ClonePair6793 subject = new ClonePair6793();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{"a", "a", '\0', '\0'};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Character) values[2]).charValue(), ((Character) values[3]).charValue()), caseInputs0),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Character) values[2]).charValue(), ((Character) values[3]).charValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, "a", '\0', '\0'};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Character) values[2]).charValue(), ((Character) values[3]).charValue()), caseInputs1),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Character) values[2]).charValue(), ((Character) values[3]).charValue()), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{"a.b", "a", '\0', '\0'};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Character) values[2]).charValue(), ((Character) values[3]).charValue()), caseInputs2),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Character) values[2]).charValue(), ((Character) values[3]).charValue()), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{"a", "a.b", '\0', '\0'};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Character) values[2]).charValue(), ((Character) values[3]).charValue()), caseInputs3),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Character) values[2]).charValue(), ((Character) values[3]).charValue()), caseInputs3)
        );
        Object[] caseInputs4 = new Object[]{"a", "a", 'a', '\0'};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Character) values[2]).charValue(), ((Character) values[3]).charValue()), caseInputs4),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Character) values[2]).charValue(), ((Character) values[3]).charValue()), caseInputs4)
        );
    }
}
