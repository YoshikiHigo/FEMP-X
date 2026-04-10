package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair7116NoDifferenceTest {

    private final ClonePair7116 subject = new ClonePair7116();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0]), new Object[]{new byte[]{}}),
            capture(values -> subject.method2((byte[]) values[0]), new Object[]{new byte[]{}})
        );
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0]), new Object[]{new byte[]{0}}),
            capture(values -> subject.method2((byte[]) values[0]), new Object[]{new byte[]{0}})
        );
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0]), new Object[]{new byte[]{0, 1, 2}}),
            capture(values -> subject.method2((byte[]) values[0]), new Object[]{new byte[]{0, 1, 2}})
        );
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0]), new Object[]{new byte[]{1, 2, 3, 4}}),
            capture(values -> subject.method2((byte[]) values[0]), new Object[]{new byte[]{1, 2, 3, 4}})
        );
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0]), new Object[]{new byte[]{0, 1, 2, 3, 4, 5, 6, 7}}),
            capture(values -> subject.method2((byte[]) values[0]), new Object[]{new byte[]{0, 1, 2, 3, 4, 5, 6, 7}})
        );
    }
}
