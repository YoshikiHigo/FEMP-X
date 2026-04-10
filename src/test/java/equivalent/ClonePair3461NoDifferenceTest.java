package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair3461NoDifferenceTest {

    private final ClonePair3461 subject = new ClonePair3461();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], (byte[]) values[1]), new Object[]{new int[]{}, new byte[]{}}),
            capture(values -> subject.method2((int[]) values[0], (byte[]) values[1]), new Object[]{new int[]{}, new byte[]{}})
        );
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], (byte[]) values[1]), new Object[]{null, new byte[]{}}),
            capture(values -> subject.method2((int[]) values[0], (byte[]) values[1]), new Object[]{null, new byte[]{}})
        );
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], (byte[]) values[1]), new Object[]{new int[]{0}, new byte[]{}}),
            capture(values -> subject.method2((int[]) values[0], (byte[]) values[1]), new Object[]{new int[]{0}, new byte[]{}})
        );
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], (byte[]) values[1]), new Object[]{new int[]{1, 2}, new byte[]{}}),
            capture(values -> subject.method2((int[]) values[0], (byte[]) values[1]), new Object[]{new int[]{1, 2}, new byte[]{}})
        );
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], (byte[]) values[1]), new Object[]{new int[]{-1, 0, 1}, new byte[]{}}),
            capture(values -> subject.method2((int[]) values[0], (byte[]) values[1]), new Object[]{new int[]{-1, 0, 1}, new byte[]{}})
        );
    }
}
