package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair7187NoDifferenceTest {

    private final ClonePair7187 subject = new ClonePair7187();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{new byte[]{}, -1, 1, new byte[]{}, 1, 1};
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (byte[]) values[3], ((Integer) values[4]).intValue(), ((Integer) values[5]).intValue()), caseInputs0),
            capture(values -> subject.method2((byte[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (byte[]) values[3], ((Integer) values[4]).intValue(), ((Integer) values[5]).intValue()), caseInputs0)
        );
    }
}
