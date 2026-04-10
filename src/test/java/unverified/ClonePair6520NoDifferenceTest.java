package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair6520NoDifferenceTest {

    private final ClonePair6520 subject = new ClonePair6520();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new int[]{}, 1}),
            capture(values -> subject.method2((int[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new int[]{}, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], ((Integer) values[1]).intValue()), new Object[]{null, 1}),
            capture(values -> subject.method2((int[]) values[0], ((Integer) values[1]).intValue()), new Object[]{null, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new int[]{}, -1}),
            capture(values -> subject.method2((int[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new int[]{}, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new int[]{}, 0}),
            capture(values -> subject.method2((int[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new int[]{}, 0})
        );
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new int[]{0}, 4}),
            capture(values -> subject.method2((int[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new int[]{0}, 4})
        );
    }
}
