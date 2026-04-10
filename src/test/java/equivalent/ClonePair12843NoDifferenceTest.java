package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair12843NoDifferenceTest {

    private final ClonePair12843 subject = new ClonePair12843();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{new byte[]{}, 1, 1, new char[][]{}};
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (char[][]) values[3]), caseInputs0),
            capture(values -> subject.method2((byte[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (char[][]) values[3]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{new byte[]{}, 1, 1, null};
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (char[][]) values[3]), caseInputs1),
            capture(values -> subject.method2((byte[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (char[][]) values[3]), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{null, 1, 1, null};
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (char[][]) values[3]), caseInputs2),
            capture(values -> subject.method2((byte[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (char[][]) values[3]), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{new byte[]{}, 1, -1, null};
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (char[][]) values[3]), caseInputs3),
            capture(values -> subject.method2((byte[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (char[][]) values[3]), caseInputs3)
        );
    }
}
