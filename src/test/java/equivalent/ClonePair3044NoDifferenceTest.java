package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair3044NoDifferenceTest {

    private final ClonePair3044 subject = new ClonePair3044();

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
    }
}
