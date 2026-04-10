package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair8921NoDifferenceTest {

    private final ClonePair8921 subject = new ClonePair8921();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{new int[]{}, 1, 1}),
            capture(values -> subject.method2((int[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{new int[]{}, 1, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{null, 1, 1}),
            capture(values -> subject.method2((int[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{null, 1, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{new int[]{}, 1, -1}),
            capture(values -> subject.method2((int[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{new int[]{}, 1, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{new int[]{1}, 0, 1}),
            capture(values -> subject.method2((int[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{new int[]{1}, 0, 1})
        );
    }
}
