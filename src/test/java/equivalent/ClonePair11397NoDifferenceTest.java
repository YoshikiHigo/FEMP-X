package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair11397NoDifferenceTest {

    private final ClonePair11397 subject = new ClonePair11397();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{"foo", "foo", null, -1};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2], ((Integer) values[3]).intValue()), caseInputs0),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2], ((Integer) values[3]).intValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, "foo", null, -1};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2], ((Integer) values[3]).intValue()), caseInputs1),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2], ((Integer) values[3]).intValue()), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{"foo", null, null, -1};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2], ((Integer) values[3]).intValue()), caseInputs2),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2], ((Integer) values[3]).intValue()), caseInputs2)
        );
    }
}
