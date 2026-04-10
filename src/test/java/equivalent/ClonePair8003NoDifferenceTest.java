package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair8003NoDifferenceTest {

    private final ClonePair8003 subject = new ClonePair8003();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{new byte[]{}};
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0]), caseInputs0),
            capture(values -> subject.method2((byte[]) values[0]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null};
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0]), caseInputs1),
            capture(values -> subject.method2((byte[]) values[0]), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{new byte[]{0}};
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0]), caseInputs2),
            capture(values -> subject.method2((byte[]) values[0]), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{new byte[]{1, 2, 3, 4}};
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0]), caseInputs3),
            capture(values -> subject.method2((byte[]) values[0]), caseInputs3)
        );
        Object[] caseInputs4 = new Object[]{new byte[]{0, 1, 2, 3, 4, 5, 6, 7}};
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0]), caseInputs4),
            capture(values -> subject.method2((byte[]) values[0]), caseInputs4)
        );
    }
}
