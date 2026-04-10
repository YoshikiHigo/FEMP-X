package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair7689NoDifferenceTest {

    private final ClonePair7689 subject = new ClonePair7689();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{new char[]{}, 1, new char[]{}, 1};
        assertEquivalent(
            capture(values -> subject.method1((char[]) values[0], ((Integer) values[1]).intValue(), (char[]) values[2], ((Integer) values[3]).intValue()), caseInputs0),
            capture(values -> subject.method2((char[]) values[0], ((Integer) values[1]).intValue(), (char[]) values[2], ((Integer) values[3]).intValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, 1, new char[]{}, 1};
        assertEquivalent(
            capture(values -> subject.method1((char[]) values[0], ((Integer) values[1]).intValue(), (char[]) values[2], ((Integer) values[3]).intValue()), caseInputs1),
            capture(values -> subject.method2((char[]) values[0], ((Integer) values[1]).intValue(), (char[]) values[2], ((Integer) values[3]).intValue()), caseInputs1)
        );
    }
}
