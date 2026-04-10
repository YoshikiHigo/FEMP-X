package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair10829NoDifferenceTest {

    private final ClonePair10829 subject = new ClonePair10829();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{-1, false};
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue(), ((Boolean) values[1]).booleanValue()), caseInputs0),
            capture(values -> subject.method2(((Integer) values[0]).intValue(), ((Boolean) values[1]).booleanValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{1, false};
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue(), ((Boolean) values[1]).booleanValue()), caseInputs1),
            capture(values -> subject.method2(((Integer) values[0]).intValue(), ((Boolean) values[1]).booleanValue()), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{2, false};
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue(), ((Boolean) values[1]).booleanValue()), caseInputs2),
            capture(values -> subject.method2(((Integer) values[0]).intValue(), ((Boolean) values[1]).booleanValue()), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{3, false};
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue(), ((Boolean) values[1]).booleanValue()), caseInputs3),
            capture(values -> subject.method2(((Integer) values[0]).intValue(), ((Boolean) values[1]).booleanValue()), caseInputs3)
        );
        Object[] caseInputs4 = new Object[]{4, false};
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue(), ((Boolean) values[1]).booleanValue()), caseInputs4),
            capture(values -> subject.method2(((Integer) values[0]).intValue(), ((Boolean) values[1]).booleanValue()), caseInputs4)
        );
    }
}
