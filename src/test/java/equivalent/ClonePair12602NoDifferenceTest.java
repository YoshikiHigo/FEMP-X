package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair12602NoDifferenceTest {

    private final ClonePair12602 subject = new ClonePair12602();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{"a", '\0'};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Character) values[1]).charValue()), caseInputs0),
            capture(values -> subject.method2((String) values[0], ((Character) values[1]).charValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, '\0'};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Character) values[1]).charValue()), caseInputs1),
            capture(values -> subject.method2((String) values[0], ((Character) values[1]).charValue()), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{"", '\0'};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Character) values[1]).charValue()), caseInputs2),
            capture(values -> subject.method2((String) values[0], ((Character) values[1]).charValue()), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{"a.b", '\0'};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Character) values[1]).charValue()), caseInputs3),
            capture(values -> subject.method2((String) values[0], ((Character) values[1]).charValue()), caseInputs3)
        );
        Object[] caseInputs4 = new Object[]{"a.b.c", '\0'};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Character) values[1]).charValue()), caseInputs4),
            capture(values -> subject.method2((String) values[0], ((Character) values[1]).charValue()), caseInputs4)
        );
    }
}
