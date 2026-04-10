package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair11103NoDifferenceTest {

    private final ClonePair11103 subject = new ClonePair11103();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((double[][]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue()), new Object[]{d2(), -1, -1, -1, -1}),
            capture(values -> subject.method2((double[][]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue()), new Object[]{d2(), -1, -1, -1, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1((double[][]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue()), new Object[]{null, -1, -1, -1, -1}),
            capture(values -> subject.method2((double[][]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue()), new Object[]{null, -1, -1, -1, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1((double[][]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue()), new Object[]{null, 0, -1, -1, -1}),
            capture(values -> subject.method2((double[][]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue()), new Object[]{null, 0, -1, -1, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1((double[][]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue()), new Object[]{null, 1, -1, -1, -1}),
            capture(values -> subject.method2((double[][]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue()), new Object[]{null, 1, -1, -1, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1((double[][]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue()), new Object[]{null, -1, -1, 0, -1}),
            capture(values -> subject.method2((double[][]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue()), new Object[]{null, -1, -1, 0, -1})
        );
    }
}
