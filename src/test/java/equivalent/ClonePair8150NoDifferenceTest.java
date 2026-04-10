package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair8150NoDifferenceTest {

    private final ClonePair8150 subject = new ClonePair8150();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{Float.valueOf(-1.0f), Float.valueOf(1.0f)};
        assertEquivalent(
            capture(values -> subject.method1((Float) values[0], (Float) values[1]), caseInputs0),
            capture(values -> subject.method2((Float) values[0], (Float) values[1]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{Float.valueOf(1.0f), Float.valueOf(1.0f)};
        assertEquivalent(
            capture(values -> subject.method1((Float) values[0], (Float) values[1]), caseInputs1),
            capture(values -> subject.method2((Float) values[0], (Float) values[1]), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{Float.valueOf(1.5f), Float.valueOf(1.0f)};
        assertEquivalent(
            capture(values -> subject.method1((Float) values[0], (Float) values[1]), caseInputs2),
            capture(values -> subject.method2((Float) values[0], (Float) values[1]), caseInputs2)
        );
    }
}
