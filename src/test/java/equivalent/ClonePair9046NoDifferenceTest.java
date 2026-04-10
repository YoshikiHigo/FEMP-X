package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair9046NoDifferenceTest {

    private final ClonePair9046 subject = new ClonePair9046();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{new int[]{}, 1, new int[]{}, 1, -1};
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], ((Integer) values[1]).intValue(), (int[]) values[2], ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue()), caseInputs0),
            capture(values -> subject.method2((int[]) values[0], ((Integer) values[1]).intValue(), (int[]) values[2], ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{new int[]{}, 1, null, 1, -1};
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], ((Integer) values[1]).intValue(), (int[]) values[2], ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue()), caseInputs1),
            capture(values -> subject.method2((int[]) values[0], ((Integer) values[1]).intValue(), (int[]) values[2], ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue()), caseInputs1)
        );
    }
}
