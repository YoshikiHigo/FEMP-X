package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair11269NoDifferenceTest {

    private final ClonePair11269 subject = new ClonePair11269();

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
            capture(values -> subject.method1((int[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new int[]{0}, 1}),
            capture(values -> subject.method2((int[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new int[]{0}, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new int[]{1}, 1}),
            capture(values -> subject.method2((int[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new int[]{1}, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new int[]{-1, 0, 1}, 1}),
            capture(values -> subject.method2((int[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new int[]{-1, 0, 1}, 1})
        );
    }
}
