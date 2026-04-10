package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair8393NoDifferenceTest {

    private final ClonePair8393 subject = new ClonePair8393();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{"a", -1, "a"};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue(), (String) values[2]), caseInputs0),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue(), (String) values[2]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, -1, "a"};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue(), (String) values[2]), caseInputs1),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue(), (String) values[2]), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{"a.b", -1, "a"};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue(), (String) values[2]), caseInputs2),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue(), (String) values[2]), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{"a", -1, null};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue(), (String) values[2]), caseInputs3),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue(), (String) values[2]), caseInputs3)
        );
        Object[] caseInputs4 = new Object[]{"a", -1, "a.b"};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue(), (String) values[2]), caseInputs4),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue(), (String) values[2]), caseInputs4)
        );
    }
}
