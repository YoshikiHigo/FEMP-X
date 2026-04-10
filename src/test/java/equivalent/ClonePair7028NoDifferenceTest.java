package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair7028NoDifferenceTest {

    private final ClonePair7028 subject = new ClonePair7028();

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
    }
}
