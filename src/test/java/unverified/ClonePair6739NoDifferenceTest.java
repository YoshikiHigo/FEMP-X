package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair6739NoDifferenceTest {

    private final ClonePair6739 subject = new ClonePair6739();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0]), new Object[]{new byte[]{}}),
            capture(values -> subject.method2((byte[]) values[0]), new Object[]{new byte[]{}})
        );
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0]), new Object[]{null}),
            capture(values -> subject.method2((byte[]) values[0]), new Object[]{null})
        );
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0]), new Object[]{new byte[]{0, 1, 2, 3, 4, 5, 6, 7}}),
            capture(values -> subject.method2((byte[]) values[0]), new Object[]{new byte[]{0, 1, 2, 3, 4, 5, 6, 7}})
        );
    }
}
