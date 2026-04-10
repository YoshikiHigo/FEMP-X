package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair5956NoDifferenceTest {

    private final ClonePair5956 subject = new ClonePair5956();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], (byte[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), new Object[]{new byte[]{}, new byte[]{}, -1, 1}),
            capture(values -> subject.method2((byte[]) values[0], (byte[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), new Object[]{new byte[]{}, new byte[]{}, -1, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], (byte[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), new Object[]{new byte[]{}, null, -1, 1}),
            capture(values -> subject.method2((byte[]) values[0], (byte[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), new Object[]{new byte[]{}, null, -1, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], (byte[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), new Object[]{new byte[]{}, new byte[]{0}, -1, 1}),
            capture(values -> subject.method2((byte[]) values[0], (byte[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), new Object[]{new byte[]{}, new byte[]{0}, -1, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], (byte[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), new Object[]{new byte[]{}, new byte[]{}, 0, 1}),
            capture(values -> subject.method2((byte[]) values[0], (byte[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), new Object[]{new byte[]{}, new byte[]{}, 0, 1})
        );
    }
}
