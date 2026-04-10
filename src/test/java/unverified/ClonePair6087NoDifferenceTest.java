package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair6087NoDifferenceTest {

    private final ClonePair6087 subject = new ClonePair6087();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((Object[]) values[0], (Object[]) values[1]), new Object[]{new Object[]{}, new Object[]{}}),
            capture(values -> subject.method2((Object[]) values[0], (Object[]) values[1]), new Object[]{new Object[]{}, new Object[]{}})
        );
        assertEquivalent(
            capture(values -> subject.method1((Object[]) values[0], (Object[]) values[1]), new Object[]{null, new Object[]{}}),
            capture(values -> subject.method2((Object[]) values[0], (Object[]) values[1]), new Object[]{null, new Object[]{}})
        );
    }
}
