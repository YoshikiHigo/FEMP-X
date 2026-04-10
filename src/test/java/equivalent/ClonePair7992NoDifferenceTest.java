package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair7992NoDifferenceTest {

    private final ClonePair7992 subject = new ClonePair7992();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{new int[]{}, 1, 1, 1, 1, -1, i2()};
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue(), ((Integer) values[5]).intValue(), (int[][]) values[6]), caseInputs0),
            capture(values -> subject.method2((int[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue(), ((Integer) values[5]).intValue(), (int[][]) values[6]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{new int[]{}, 1, 1, 1, 1, -1, null};
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue(), ((Integer) values[5]).intValue(), (int[][]) values[6]), caseInputs1),
            capture(values -> subject.method2((int[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue(), ((Integer) values[5]).intValue(), (int[][]) values[6]), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{new int[]{}, -1, 1, 1, 1, -1, null};
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue(), ((Integer) values[5]).intValue(), (int[][]) values[6]), caseInputs2),
            capture(values -> subject.method2((int[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue(), ((Integer) values[5]).intValue(), (int[][]) values[6]), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{new int[]{}, 0, 1, 1, 1, -1, null};
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue(), ((Integer) values[5]).intValue(), (int[][]) values[6]), caseInputs3),
            capture(values -> subject.method2((int[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue(), ((Integer) values[5]).intValue(), (int[][]) values[6]), caseInputs3)
        );
        Object[] caseInputs4 = new Object[]{new int[]{}, 1, 1, 1, -1, -1, null};
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue(), ((Integer) values[5]).intValue(), (int[][]) values[6]), caseInputs4),
            capture(values -> subject.method2((int[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue(), ((Integer) values[5]).intValue(), (int[][]) values[6]), caseInputs4)
        );
    }
}
