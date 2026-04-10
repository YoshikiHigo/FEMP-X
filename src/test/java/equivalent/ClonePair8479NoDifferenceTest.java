package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair8479NoDifferenceTest {

    private final ClonePair8479 subject = new ClonePair8479();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{" "};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), caseInputs0),
            capture(values -> subject.method2((String) values[0]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{"1"};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), caseInputs1),
            capture(values -> subject.method2((String) values[0]), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{"1.5"};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), caseInputs2),
            capture(values -> subject.method2((String) values[0]), caseInputs2)
        );
    }
}
