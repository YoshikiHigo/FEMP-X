package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair11143NoDifferenceTest {

    private final ClonePair11143 subject = new ClonePair11143();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{String.class, String.class};
        assertEquivalent(
            capture(values -> subject.method1((Class) values[0], (Class) values[1]), caseInputs0),
            capture(values -> subject.method2((Class) values[0], (Class) values[1]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, String.class};
        assertEquivalent(
            capture(values -> subject.method1((Class) values[0], (Class) values[1]), caseInputs1),
            capture(values -> subject.method2((Class) values[0], (Class) values[1]), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{Integer.class, String.class};
        assertEquivalent(
            capture(values -> subject.method1((Class) values[0], (Class) values[1]), caseInputs2),
            capture(values -> subject.method2((Class) values[0], (Class) values[1]), caseInputs2)
        );
    }
}
