package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair6247NoDifferenceTest {

    private final ClonePair6247 subject = new ClonePair6247();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{new byte[]{}, 1, false};
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Integer) values[1]).intValue(), ((Boolean) values[2]).booleanValue()), caseInputs0),
            capture(values -> subject.method2((byte[]) values[0], ((Integer) values[1]).intValue(), ((Boolean) values[2]).booleanValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, 1, false};
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Integer) values[1]).intValue(), ((Boolean) values[2]).booleanValue()), caseInputs1),
            capture(values -> subject.method2((byte[]) values[0], ((Integer) values[1]).intValue(), ((Boolean) values[2]).booleanValue()), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{new byte[]{0, 1, 2}, 1, false};
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Integer) values[1]).intValue(), ((Boolean) values[2]).booleanValue()), caseInputs2),
            capture(values -> subject.method2((byte[]) values[0], ((Integer) values[1]).intValue(), ((Boolean) values[2]).booleanValue()), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{new byte[]{0, 1, 2}, 0, false};
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Integer) values[1]).intValue(), ((Boolean) values[2]).booleanValue()), caseInputs3),
            capture(values -> subject.method2((byte[]) values[0], ((Integer) values[1]).intValue(), ((Boolean) values[2]).booleanValue()), caseInputs3)
        );
        Object[] caseInputs4 = new Object[]{new byte[]{0, 1, 2}, 0, true};
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Integer) values[1]).intValue(), ((Boolean) values[2]).booleanValue()), caseInputs4),
            capture(values -> subject.method2((byte[]) values[0], ((Integer) values[1]).intValue(), ((Boolean) values[2]).booleanValue()), caseInputs4)
        );
    }
}
