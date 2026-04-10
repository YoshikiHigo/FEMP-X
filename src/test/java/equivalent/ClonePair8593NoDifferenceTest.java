package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair8593NoDifferenceTest {

    private final ClonePair8593 subject = new ClonePair8593();

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
        Object[] caseInputs2 = new Object[]{new byte[]{0}, new byte[]{0}};
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], (byte[]) values[1]), caseInputs2),
            capture(values -> subject.method2((byte[]) values[0], (byte[]) values[1]), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{new byte[]{0, 1, 2}, new byte[]{0, 1, 2}};
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], (byte[]) values[1]), caseInputs3),
            capture(values -> subject.method2((byte[]) values[0], (byte[]) values[1]), caseInputs3)
        );
        Object[] caseInputs4 = new Object[]{new byte[]{1, 2, 3, 4}, new byte[]{1, 2, 3, 4}};
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], (byte[]) values[1]), caseInputs4),
            capture(values -> subject.method2((byte[]) values[0], (byte[]) values[1]), caseInputs4)
        );
    }
}
