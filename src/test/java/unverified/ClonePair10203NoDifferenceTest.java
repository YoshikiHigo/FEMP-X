package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair10203NoDifferenceTest {

    private final ClonePair10203 subject = new ClonePair10203();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{new byte[]{}, 1, 1}),
            capture(values -> subject.method2((byte[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{new byte[]{}, 1, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{null, 1, 1}),
            capture(values -> subject.method2((byte[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{null, 1, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{new byte[]{0, 1, 2}, 1, 1}),
            capture(values -> subject.method2((byte[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{new byte[]{0, 1, 2}, 1, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{new byte[]{}, 1, -1}),
            capture(values -> subject.method2((byte[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{new byte[]{}, 1, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{new byte[]{0, 1, 2}, 1, 2}),
            capture(values -> subject.method2((byte[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{new byte[]{0, 1, 2}, 1, 2})
        );
    }
}
