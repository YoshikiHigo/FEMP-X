package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair8812NoDifferenceTest {

    private final ClonePair8812 subject = new ClonePair8812();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{"a", 1};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue()), caseInputs0),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, 1};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue()), caseInputs1),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue()), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{"a", -1};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue()), caseInputs2),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue()), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{"a", 0};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue()), caseInputs3),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue()), caseInputs3)
        );
        Object[] caseInputs4 = new Object[]{"a", 2};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue()), caseInputs4),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue()), caseInputs4)
        );
    }
}
