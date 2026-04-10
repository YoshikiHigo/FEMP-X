package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair3182NoDifferenceTest {

    private final ClonePair3182 subject = new ClonePair3182();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((double[][]) values[0]), new Object[]{d2()}),
            capture(values -> subject.method2((double[][]) values[0]), new Object[]{d2()})
        );
        assertEquivalent(
            capture(values -> subject.method1((double[][]) values[0]), new Object[]{null}),
            capture(values -> subject.method2((double[][]) values[0]), new Object[]{null})
        );
    }
}
