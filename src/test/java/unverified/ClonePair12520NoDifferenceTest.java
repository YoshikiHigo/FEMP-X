package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair12520NoDifferenceTest {

    private final ClonePair12520 subject = new ClonePair12520();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((double[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{new double[]{}, 1, 1}),
            capture(values -> subject.method2((double[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{new double[]{}, 1, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((double[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{null, 1, 1}),
            capture(values -> subject.method2((double[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{null, 1, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((double[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{new double[]{0.0}, 1, 1}),
            capture(values -> subject.method2((double[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{new double[]{0.0}, 1, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((double[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{new double[]{1.0}, 1, 1}),
            capture(values -> subject.method2((double[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{new double[]{1.0}, 1, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((double[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{new double[]{}, -1, 1}),
            capture(values -> subject.method2((double[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{new double[]{}, -1, 1})
        );
    }
}
