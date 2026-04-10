package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair7527NoDifferenceTest {

    private final ClonePair7527 subject = new ClonePair7527();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{"a", new byte[]{}, -1, 1, 1};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (byte[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue()), caseInputs0),
            capture(values -> subject.method2((String) values[0], (byte[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, new byte[]{}, -1, 1, 1};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (byte[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue()), caseInputs1),
            capture(values -> subject.method2((String) values[0], (byte[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue()), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{"a", new byte[]{0, 1, 2}, -1, 1, 1};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (byte[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue()), caseInputs2),
            capture(values -> subject.method2((String) values[0], (byte[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue()), caseInputs2)
        );
    }
}
