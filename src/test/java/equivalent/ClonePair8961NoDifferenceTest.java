package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair8961NoDifferenceTest {

    private final ClonePair8961 subject = new ClonePair8961();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{sb("")};
        assertEquivalent(
            capture(values -> subject.method1((StringBuffer) values[0]), caseInputs0),
            capture(values -> subject.method2((StringBuffer) values[0]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null};
        assertEquivalent(
            capture(values -> subject.method1((StringBuffer) values[0]), caseInputs1),
            capture(values -> subject.method2((StringBuffer) values[0]), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{sb("a")};
        assertEquivalent(
            capture(values -> subject.method1((StringBuffer) values[0]), caseInputs2),
            capture(values -> subject.method2((StringBuffer) values[0]), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{sb("abc")};
        assertEquivalent(
            capture(values -> subject.method1((StringBuffer) values[0]), caseInputs3),
            capture(values -> subject.method2((StringBuffer) values[0]), caseInputs3)
        );
    }
}
