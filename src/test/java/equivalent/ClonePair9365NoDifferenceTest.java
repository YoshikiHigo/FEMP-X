package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair9365NoDifferenceTest {

    private final ClonePair9365 subject = new ClonePair9365();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{new byte[]{}, new int[]{}, 1, -1, 1, -1};
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], (int[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue(), ((Integer) values[5]).intValue()), caseInputs0),
            capture(values -> subject.method2((byte[]) values[0], (int[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue(), ((Integer) values[5]).intValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{new byte[]{}, new int[]{}, 1, -1, -1, -1};
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], (int[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue(), ((Integer) values[5]).intValue()), caseInputs1),
            capture(values -> subject.method2((byte[]) values[0], (int[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue(), ((Integer) values[5]).intValue()), caseInputs1)
        );
    }
}
