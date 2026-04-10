package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair13670NoDifferenceTest {

    private final ClonePair13670 subject = new ClonePair13670();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{"", "", ""};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2]), caseInputs0),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{"a", "", ""};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2]), caseInputs1),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2]), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{"A", "", ""};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2]), caseInputs2),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2]), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{"a", "", "a"};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2]), caseInputs3),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2]), caseInputs3)
        );
        Object[] caseInputs4 = new Object[]{"a", "", "A"};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2]), caseInputs4),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2]), caseInputs4)
        );
    }
}
