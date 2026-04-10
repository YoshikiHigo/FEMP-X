package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair8937NoDifferenceTest {

    private final ClonePair8937 subject = new ClonePair8937();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{"a", "a", 1, false};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Integer) values[2]).intValue(), ((Boolean) values[3]).booleanValue()), caseInputs0),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Integer) values[2]).intValue(), ((Boolean) values[3]).booleanValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, "a", 1, false};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Integer) values[2]).intValue(), ((Boolean) values[3]).booleanValue()), caseInputs1),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Integer) values[2]).intValue(), ((Boolean) values[3]).booleanValue()), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{"a.b", "a", 1, false};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Integer) values[2]).intValue(), ((Boolean) values[3]).booleanValue()), caseInputs2),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Integer) values[2]).intValue(), ((Boolean) values[3]).booleanValue()), caseInputs2)
        );
    }
}
