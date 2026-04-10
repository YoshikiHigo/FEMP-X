package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair3769NoDifferenceTest {

    private final ClonePair3769 subject = new ClonePair3769();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], (int[]) values[1], (int[]) values[2], ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue()), new Object[]{new byte[]{}, new int[]{}, new int[]{}, -1, 1}),
            capture(values -> subject.method2((byte[]) values[0], (int[]) values[1], (int[]) values[2], ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue()), new Object[]{new byte[]{}, new int[]{}, new int[]{}, -1, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], (int[]) values[1], (int[]) values[2], ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue()), new Object[]{new byte[]{}, null, new int[]{}, -1, 1}),
            capture(values -> subject.method2((byte[]) values[0], (int[]) values[1], (int[]) values[2], ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue()), new Object[]{new byte[]{}, null, new int[]{}, -1, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], (int[]) values[1], (int[]) values[2], ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue()), new Object[]{new byte[]{}, new int[]{}, new int[]{}, 0, 1}),
            capture(values -> subject.method2((byte[]) values[0], (int[]) values[1], (int[]) values[2], ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue()), new Object[]{new byte[]{}, new int[]{}, new int[]{}, 0, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], (int[]) values[1], (int[]) values[2], ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue()), new Object[]{new byte[]{}, new int[]{}, new int[]{}, 1, 1}),
            capture(values -> subject.method2((byte[]) values[0], (int[]) values[1], (int[]) values[2], ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue()), new Object[]{new byte[]{}, new int[]{}, new int[]{}, 1, 1})
        );
    }
}
