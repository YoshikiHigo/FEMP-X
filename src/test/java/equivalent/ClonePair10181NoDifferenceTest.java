package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair10181NoDifferenceTest {

    private final ClonePair10181 subject = new ClonePair10181();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{"a", "a", 1};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Integer) values[2]).intValue()), caseInputs0),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Integer) values[2]).intValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, "a", 1};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Integer) values[2]).intValue()), caseInputs1),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Integer) values[2]).intValue()), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{"", "a", 1};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Integer) values[2]).intValue()), caseInputs2),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Integer) values[2]).intValue()), caseInputs2)
        );
    }
}
