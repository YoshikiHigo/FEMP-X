package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair8122NoDifferenceTest {

    private final ClonePair8122 subject = new ClonePair8122();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((int[][]) values[0], (int[][]) values[1]), new Object[]{i2(), i2()}),
            capture(values -> subject.method2((int[][]) values[0], (int[][]) values[1]), new Object[]{i2(), i2()})
        );
        assertEquivalent(
            capture(values -> subject.method1((int[][]) values[0], (int[][]) values[1]), new Object[]{null, null}),
            capture(values -> subject.method2((int[][]) values[0], (int[][]) values[1]), new Object[]{null, null})
        );
    }
}
