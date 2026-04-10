package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair9468NoDifferenceTest {

    private final ClonePair9468 subject = new ClonePair9468();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{calendar(0L)};
        assertEquivalent(
            capture(values -> subject.method1((java.util.Calendar) values[0]), caseInputs0),
            capture(values -> subject.method2((java.util.Calendar) values[0]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null};
        assertEquivalent(
            capture(values -> subject.method1((java.util.Calendar) values[0]), caseInputs1),
            capture(values -> subject.method2((java.util.Calendar) values[0]), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{calendar(86_400_000L)};
        assertEquivalent(
            capture(values -> subject.method1((java.util.Calendar) values[0]), caseInputs2),
            capture(values -> subject.method2((java.util.Calendar) values[0]), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{calendar(1_000_000_000L)};
        assertEquivalent(
            capture(values -> subject.method1((java.util.Calendar) values[0]), caseInputs3),
            capture(values -> subject.method2((java.util.Calendar) values[0]), caseInputs3)
        );
    }
}
