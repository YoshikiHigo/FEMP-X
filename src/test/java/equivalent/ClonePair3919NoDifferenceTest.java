package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair3919NoDifferenceTest {

    private final ClonePair3919 subject = new ClonePair3919();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], (byte[]) values[1], ((Integer) values[2]).intValue()), new Object[]{new byte[]{}, new byte[]{}, -1}),
            capture(values -> subject.method2((byte[]) values[0], (byte[]) values[1], ((Integer) values[2]).intValue()), new Object[]{new byte[]{}, new byte[]{}, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], (byte[]) values[1], ((Integer) values[2]).intValue()), new Object[]{null, new byte[]{}, -1}),
            capture(values -> subject.method2((byte[]) values[0], (byte[]) values[1], ((Integer) values[2]).intValue()), new Object[]{null, new byte[]{}, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], (byte[]) values[1], ((Integer) values[2]).intValue()), new Object[]{new byte[]{}, new byte[]{}, 0}),
            capture(values -> subject.method2((byte[]) values[0], (byte[]) values[1], ((Integer) values[2]).intValue()), new Object[]{new byte[]{}, new byte[]{}, 0})
        );
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], (byte[]) values[1], ((Integer) values[2]).intValue()), new Object[]{new byte[]{0}, new byte[]{}, 0}),
            capture(values -> subject.method2((byte[]) values[0], (byte[]) values[1], ((Integer) values[2]).intValue()), new Object[]{new byte[]{0}, new byte[]{}, 0})
        );
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], (byte[]) values[1], ((Integer) values[2]).intValue()), new Object[]{new byte[]{0, 1, 2}, new byte[]{}, 0}),
            capture(values -> subject.method2((byte[]) values[0], (byte[]) values[1], ((Integer) values[2]).intValue()), new Object[]{new byte[]{0, 1, 2}, new byte[]{}, 0})
        );
    }
}
