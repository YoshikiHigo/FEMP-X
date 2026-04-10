package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair8859NoDifferenceTest {

    private final ClonePair8859 subject = new ClonePair8859();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{"", "a"};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1]), caseInputs0),
            capture(values -> subject.method2((String) values[0], (String) values[1]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, "a"};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1]), caseInputs1),
            capture(values -> subject.method2((String) values[0], (String) values[1]), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{"a", "a"};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1]), caseInputs2),
            capture(values -> subject.method2((String) values[0], (String) values[1]), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{"a.b", "a"};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1]), caseInputs3),
            capture(values -> subject.method2((String) values[0], (String) values[1]), caseInputs3)
        );
        Object[] caseInputs4 = new Object[]{"a.b.c", "a"};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1]), caseInputs4),
            capture(values -> subject.method2((String) values[0], (String) values[1]), caseInputs4)
        );
    }
}
