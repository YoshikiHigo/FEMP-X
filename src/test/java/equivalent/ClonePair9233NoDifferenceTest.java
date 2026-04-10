package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair9233NoDifferenceTest {

    private final ClonePair9233 subject = new ClonePair9233();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{"", -1, ""};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue(), (String) values[2]), caseInputs0),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue(), (String) values[2]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, -1, ""};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue(), (String) values[2]), caseInputs1),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue(), (String) values[2]), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{"a", 1, null};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue(), (String) values[2]), caseInputs2),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue(), (String) values[2]), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{"a.b", 2, null};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue(), (String) values[2]), caseInputs3),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue(), (String) values[2]), caseInputs3)
        );
    }
}
