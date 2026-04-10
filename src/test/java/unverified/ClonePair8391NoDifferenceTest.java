package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair8391NoDifferenceTest {

    private final ClonePair8391 subject = new ClonePair8391();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], (byte[]) values[1], ((Integer) values[2]).intValue()), new Object[]{new byte[]{}, new byte[]{}, 1}),
            capture(values -> subject.method2((byte[]) values[0], (byte[]) values[1], ((Integer) values[2]).intValue()), new Object[]{new byte[]{}, new byte[]{}, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], (byte[]) values[1], ((Integer) values[2]).intValue()), new Object[]{null, new byte[]{}, 1}),
            capture(values -> subject.method2((byte[]) values[0], (byte[]) values[1], ((Integer) values[2]).intValue()), new Object[]{null, new byte[]{}, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], (byte[]) values[1], ((Integer) values[2]).intValue()), new Object[]{new byte[]{}, new byte[]{}, -1}),
            capture(values -> subject.method2((byte[]) values[0], (byte[]) values[1], ((Integer) values[2]).intValue()), new Object[]{new byte[]{}, new byte[]{}, -1})
        );
    }
}
