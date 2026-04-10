package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair8534NoDifferenceTest {

    private final ClonePair8534 subject = new ClonePair8534();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{sb(""), "a"};
        assertEquivalent(
            capture(values -> subject.method1((StringBuffer) values[0], (String) values[1]), caseInputs0),
            capture(values -> subject.method2((StringBuffer) values[0], (String) values[1]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, "a"};
        assertEquivalent(
            capture(values -> subject.method1((StringBuffer) values[0], (String) values[1]), caseInputs1),
            capture(values -> subject.method2((StringBuffer) values[0], (String) values[1]), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{sb("a"), "a"};
        assertEquivalent(
            capture(values -> subject.method1((StringBuffer) values[0], (String) values[1]), caseInputs2),
            capture(values -> subject.method2((StringBuffer) values[0], (String) values[1]), caseInputs2)
        );
    }
}
