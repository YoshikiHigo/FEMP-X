package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair13396NoDifferenceTest {

    private final ClonePair13396 subject = new ClonePair13396();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{new byte[]{}, new byte[]{}};
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], (byte[]) values[1]), caseInputs0),
            capture(values -> subject.method2((byte[]) values[0], (byte[]) values[1]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, new byte[]{}};
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], (byte[]) values[1]), caseInputs1),
            capture(values -> subject.method2((byte[]) values[0], (byte[]) values[1]), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{new byte[]{0}, new byte[]{}};
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], (byte[]) values[1]), caseInputs2),
            capture(values -> subject.method2((byte[]) values[0], (byte[]) values[1]), caseInputs2)
        );
    }
}
