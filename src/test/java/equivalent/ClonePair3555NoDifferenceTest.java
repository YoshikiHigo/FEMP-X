package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair3555NoDifferenceTest {

    private final ClonePair3555 subject = new ClonePair3555();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((double[][]) values[0], (double[][]) values[1]), new Object[]{d2(), d2()}),
            capture(values -> subject.method2((double[][]) values[0], (double[][]) values[1]), new Object[]{d2(), d2()})
        );
        assertEquivalent(
            capture(values -> subject.method1((double[][]) values[0], (double[][]) values[1]), new Object[]{null, null}),
            capture(values -> subject.method2((double[][]) values[0], (double[][]) values[1]), new Object[]{null, null})
        );
    }
}
