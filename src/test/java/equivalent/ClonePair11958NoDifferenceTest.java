package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair11958NoDifferenceTest {

    private final ClonePair11958 subject = new ClonePair11958();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{"", -1};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue()), caseInputs0),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, -1};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue()), caseInputs1),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue()), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{"a", -1};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue()), caseInputs2),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue()), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{"A", -1};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue()), caseInputs3),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue()), caseInputs3)
        );
        Object[] caseInputs4 = new Object[]{"abc", -1};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue()), caseInputs4),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue()), caseInputs4)
        );
    }
}
