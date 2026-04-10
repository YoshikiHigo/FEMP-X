package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair10026NoDifferenceTest {

    private final ClonePair10026 subject = new ClonePair10026();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{Long.valueOf(-1L), Long.valueOf(1L)};
        assertEquivalent(
            capture(values -> subject.method1((Long) values[0], (Long) values[1]), caseInputs0),
            capture(values -> subject.method2((Long) values[0], (Long) values[1]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{Long.valueOf(1L), Long.valueOf(1L)};
        assertEquivalent(
            capture(values -> subject.method1((Long) values[0], (Long) values[1]), caseInputs1),
            capture(values -> subject.method2((Long) values[0], (Long) values[1]), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{Long.valueOf(255L), Long.valueOf(1L)};
        assertEquivalent(
            capture(values -> subject.method1((Long) values[0], (Long) values[1]), caseInputs2),
            capture(values -> subject.method2((Long) values[0], (Long) values[1]), caseInputs2)
        );
    }
}
