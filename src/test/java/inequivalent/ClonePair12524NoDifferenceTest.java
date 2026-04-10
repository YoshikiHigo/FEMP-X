package inequivalent;

import org.junit.jupiter.api.Test;

import static inequivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair12524NoDifferenceTest {

    private final ClonePair12524 subject = new ClonePair12524();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{"", new char[]{}, 1};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (char[]) values[1], ((Integer) values[2]).intValue()), caseInputs0),
            capture(values -> subject.method2((String) values[0], (char[]) values[1], ((Integer) values[2]).intValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{"", null, 1};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (char[]) values[1], ((Integer) values[2]).intValue()), caseInputs1),
            capture(values -> subject.method2((String) values[0], (char[]) values[1], ((Integer) values[2]).intValue()), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{"foo/bar", new char[]{'a'}, -1};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (char[]) values[1], ((Integer) values[2]).intValue()), caseInputs2),
            capture(values -> subject.method2((String) values[0], (char[]) values[1], ((Integer) values[2]).intValue()), caseInputs2)
        );
    }
}
