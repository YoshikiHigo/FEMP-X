package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair3205NoDifferenceTest {

    private final ClonePair3205 subject = new ClonePair3205();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Integer) values[1]).intValue(), (byte[]) values[2]), new Object[]{new byte[]{}, -1, new byte[]{}}),
            capture(values -> subject.method2((byte[]) values[0], ((Integer) values[1]).intValue(), (byte[]) values[2]), new Object[]{new byte[]{}, -1, new byte[]{}})
        );
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Integer) values[1]).intValue(), (byte[]) values[2]), new Object[]{null, -1, new byte[]{}}),
            capture(values -> subject.method2((byte[]) values[0], ((Integer) values[1]).intValue(), (byte[]) values[2]), new Object[]{null, -1, new byte[]{}})
        );
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Integer) values[1]).intValue(), (byte[]) values[2]), new Object[]{new byte[]{}, 1, new byte[]{}}),
            capture(values -> subject.method2((byte[]) values[0], ((Integer) values[1]).intValue(), (byte[]) values[2]), new Object[]{new byte[]{}, 1, new byte[]{}})
        );
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Integer) values[1]).intValue(), (byte[]) values[2]), new Object[]{new byte[]{}, -1, new byte[]{0}}),
            capture(values -> subject.method2((byte[]) values[0], ((Integer) values[1]).intValue(), (byte[]) values[2]), new Object[]{new byte[]{}, -1, new byte[]{0}})
        );
    }
}
