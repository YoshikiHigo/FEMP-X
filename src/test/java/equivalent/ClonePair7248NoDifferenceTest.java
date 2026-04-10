package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair7248NoDifferenceTest {

    private final ClonePair7248 subject = new ClonePair7248();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{"a", new char[]{}, 1, 1};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (char[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), caseInputs0),
            capture(values -> subject.method2((String) values[0], (char[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, new char[]{}, 1, 1};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (char[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), caseInputs1),
            capture(values -> subject.method2((String) values[0], (char[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{"a", new char[]{}, -1, 1};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (char[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), caseInputs2),
            capture(values -> subject.method2((String) values[0], (char[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{"a", new char[]{'a'}, 0, 1};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (char[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), caseInputs3),
            capture(values -> subject.method2((String) values[0], (char[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), caseInputs3)
        );
    }
}
