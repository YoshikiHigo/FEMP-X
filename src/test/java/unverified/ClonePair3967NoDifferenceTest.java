package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair3967NoDifferenceTest {

    private final ClonePair3967 subject = new ClonePair3967();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], (byte[]) values[1]), new Object[]{new byte[]{}, new byte[]{}}),
            capture(values -> subject.method2((byte[]) values[0], (byte[]) values[1]), new Object[]{new byte[]{}, new byte[]{}})
        );
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], (byte[]) values[1]), new Object[]{null, new byte[]{}}),
            capture(values -> subject.method2((byte[]) values[0], (byte[]) values[1]), new Object[]{null, new byte[]{}})
        );
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], (byte[]) values[1]), new Object[]{new byte[]{0}, new byte[]{}}),
            capture(values -> subject.method2((byte[]) values[0], (byte[]) values[1]), new Object[]{new byte[]{0}, new byte[]{}})
        );
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], (byte[]) values[1]), new Object[]{new byte[]{0}, new byte[]{1, 2, 3, 4}}),
            capture(values -> subject.method2((byte[]) values[0], (byte[]) values[1]), new Object[]{new byte[]{0}, new byte[]{1, 2, 3, 4}})
        );
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], (byte[]) values[1]), new Object[]{new byte[]{1, 2, 3, 4}, new byte[]{0}}),
            capture(values -> subject.method2((byte[]) values[0], (byte[]) values[1]), new Object[]{new byte[]{1, 2, 3, 4}, new byte[]{0}})
        );
    }
}
