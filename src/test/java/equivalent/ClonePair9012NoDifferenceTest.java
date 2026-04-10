package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair9012NoDifferenceTest {

    private final ClonePair9012 subject = new ClonePair9012();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{"", "", false, false};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Boolean) values[2]).booleanValue(), ((Boolean) values[3]).booleanValue()), caseInputs0),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Boolean) values[2]).booleanValue(), ((Boolean) values[3]).booleanValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, "", false, false};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Boolean) values[2]).booleanValue(), ((Boolean) values[3]).booleanValue()), caseInputs1),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Boolean) values[2]).booleanValue(), ((Boolean) values[3]).booleanValue()), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{"Key:\"Value\";Other:Two", "", false, false};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Boolean) values[2]).booleanValue(), ((Boolean) values[3]).booleanValue()), caseInputs2),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Boolean) values[2]).booleanValue(), ((Boolean) values[3]).booleanValue()), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{"a=1|b=2", "", false, false};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Boolean) values[2]).booleanValue(), ((Boolean) values[3]).booleanValue()), caseInputs3),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Boolean) values[2]).booleanValue(), ((Boolean) values[3]).booleanValue()), caseInputs3)
        );
        Object[] caseInputs4 = new Object[]{"", null, false, false};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Boolean) values[2]).booleanValue(), ((Boolean) values[3]).booleanValue()), caseInputs4),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Boolean) values[2]).booleanValue(), ((Boolean) values[3]).booleanValue()), caseInputs4)
        );
    }
}
