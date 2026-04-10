package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair8637NoDifferenceTest {

    private final ClonePair8637 subject = new ClonePair8637();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{new char[]{}, 1, '\0'};
        assertEquivalent(
            capture(values -> subject.method1((char[]) values[0], ((Integer) values[1]).intValue(), ((Character) values[2]).charValue()), caseInputs0),
            capture(values -> subject.method2((char[]) values[0], ((Integer) values[1]).intValue(), ((Character) values[2]).charValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, 1, '\0'};
        assertEquivalent(
            capture(values -> subject.method1((char[]) values[0], ((Integer) values[1]).intValue(), ((Character) values[2]).charValue()), caseInputs1),
            capture(values -> subject.method2((char[]) values[0], ((Integer) values[1]).intValue(), ((Character) values[2]).charValue()), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{new char[]{}, -1, '\0'};
        assertEquivalent(
            capture(values -> subject.method1((char[]) values[0], ((Integer) values[1]).intValue(), ((Character) values[2]).charValue()), caseInputs2),
            capture(values -> subject.method2((char[]) values[0], ((Integer) values[1]).intValue(), ((Character) values[2]).charValue()), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{new char[]{'a'}, 0, 'a'};
        assertEquivalent(
            capture(values -> subject.method1((char[]) values[0], ((Integer) values[1]).intValue(), ((Character) values[2]).charValue()), caseInputs3),
            capture(values -> subject.method2((char[]) values[0], ((Integer) values[1]).intValue(), ((Character) values[2]).charValue()), caseInputs3)
        );
        Object[] caseInputs4 = new Object[]{new char[]{'a', '.'}, 0, '.'};
        assertEquivalent(
            capture(values -> subject.method1((char[]) values[0], ((Integer) values[1]).intValue(), ((Character) values[2]).charValue()), caseInputs4),
            capture(values -> subject.method2((char[]) values[0], ((Integer) values[1]).intValue(), ((Character) values[2]).charValue()), caseInputs4)
        );
    }
}
