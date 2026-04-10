package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair9199NoDifferenceTest {

    private final ClonePair9199 subject = new ClonePair9199();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{"", list()};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (java.util.ArrayList) values[1]), caseInputs0),
            capture(values -> subject.method2((String) values[0], (java.util.ArrayList) values[1]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, list()};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (java.util.ArrayList) values[1]), caseInputs1),
            capture(values -> subject.method2((String) values[0], (java.util.ArrayList) values[1]), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{"a", list()};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (java.util.ArrayList) values[1]), caseInputs2),
            capture(values -> subject.method2((String) values[0], (java.util.ArrayList) values[1]), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{"A", list()};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (java.util.ArrayList) values[1]), caseInputs3),
            capture(values -> subject.method2((String) values[0], (java.util.ArrayList) values[1]), caseInputs3)
        );
        Object[] caseInputs4 = new Object[]{"abc", list()};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (java.util.ArrayList) values[1]), caseInputs4),
            capture(values -> subject.method2((String) values[0], (java.util.ArrayList) values[1]), caseInputs4)
        );
    }
}
