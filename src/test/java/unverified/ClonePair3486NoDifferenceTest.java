package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair3486NoDifferenceTest {

    private final ClonePair3486 subject = new ClonePair3486();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((short[]) values[0], (short[]) values[1]), new Object[]{new short[]{}, new short[]{}}),
            capture(values -> subject.method2((short[]) values[0], (short[]) values[1]), new Object[]{new short[]{}, new short[]{}})
        );
        assertEquivalent(
            capture(values -> subject.method1((short[]) values[0], (short[]) values[1]), new Object[]{null, new short[]{}}),
            capture(values -> subject.method2((short[]) values[0], (short[]) values[1]), new Object[]{null, new short[]{}})
        );
    }
}
