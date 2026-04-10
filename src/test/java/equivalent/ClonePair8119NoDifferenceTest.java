package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair8119NoDifferenceTest {

    private final ClonePair8119 subject = new ClonePair8119();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{i2(), i2()};
        assertEquivalent(
            capture(values -> subject.method1((int[][]) values[0], (int[][]) values[1]), caseInputs0),
            capture(values -> subject.method2((int[][]) values[0], (int[][]) values[1]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, null};
        assertEquivalent(
            capture(values -> subject.method1((int[][]) values[0], (int[][]) values[1]), caseInputs1),
            capture(values -> subject.method2((int[][]) values[0], (int[][]) values[1]), caseInputs1)
        );
    }
}
