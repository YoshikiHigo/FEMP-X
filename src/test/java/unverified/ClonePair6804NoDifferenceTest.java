package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair6804NoDifferenceTest {

    private final ClonePair6804 subject = new ClonePair6804();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], (int[]) values[1], ((Integer) values[2]).intValue()), new Object[]{new int[]{}, new int[]{}, 1}),
            capture(values -> subject.method2((int[]) values[0], (int[]) values[1], ((Integer) values[2]).intValue()), new Object[]{new int[]{}, new int[]{}, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], (int[]) values[1], ((Integer) values[2]).intValue()), new Object[]{null, new int[]{}, 1}),
            capture(values -> subject.method2((int[]) values[0], (int[]) values[1], ((Integer) values[2]).intValue()), new Object[]{null, new int[]{}, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], (int[]) values[1], ((Integer) values[2]).intValue()), new Object[]{new int[]{}, new int[]{}, -1}),
            capture(values -> subject.method2((int[]) values[0], (int[]) values[1], ((Integer) values[2]).intValue()), new Object[]{new int[]{}, new int[]{}, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], (int[]) values[1], ((Integer) values[2]).intValue()), new Object[]{new int[]{0}, new int[]{1}, 1}),
            capture(values -> subject.method2((int[]) values[0], (int[]) values[1], ((Integer) values[2]).intValue()), new Object[]{new int[]{0}, new int[]{1}, 1})
        );
    }
}
