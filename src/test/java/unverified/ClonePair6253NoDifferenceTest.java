package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair6253NoDifferenceTest {

    private final ClonePair6253 subject = new ClonePair6253();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Integer) values[1]).intValue(), ((Boolean) values[2]).booleanValue()), new Object[]{new byte[]{}, 1, false}),
            capture(values -> subject.method2((byte[]) values[0], ((Integer) values[1]).intValue(), ((Boolean) values[2]).booleanValue()), new Object[]{new byte[]{}, 1, false})
        );
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Integer) values[1]).intValue(), ((Boolean) values[2]).booleanValue()), new Object[]{null, 1, false}),
            capture(values -> subject.method2((byte[]) values[0], ((Integer) values[1]).intValue(), ((Boolean) values[2]).booleanValue()), new Object[]{null, 1, false})
        );
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Integer) values[1]).intValue(), ((Boolean) values[2]).booleanValue()), new Object[]{new byte[]{0, 1, 2}, 1, false}),
            capture(values -> subject.method2((byte[]) values[0], ((Integer) values[1]).intValue(), ((Boolean) values[2]).booleanValue()), new Object[]{new byte[]{0, 1, 2}, 1, false})
        );
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Integer) values[1]).intValue(), ((Boolean) values[2]).booleanValue()), new Object[]{new byte[]{0, 1, 2}, 0, false}),
            capture(values -> subject.method2((byte[]) values[0], ((Integer) values[1]).intValue(), ((Boolean) values[2]).booleanValue()), new Object[]{new byte[]{0, 1, 2}, 0, false})
        );
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Integer) values[1]).intValue(), ((Boolean) values[2]).booleanValue()), new Object[]{new byte[]{0, 1, 2}, 0, true}),
            capture(values -> subject.method2((byte[]) values[0], ((Integer) values[1]).intValue(), ((Boolean) values[2]).booleanValue()), new Object[]{new byte[]{0, 1, 2}, 0, true})
        );
    }
}
