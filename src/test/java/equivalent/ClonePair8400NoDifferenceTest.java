package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair8400NoDifferenceTest {

    private final ClonePair8400 subject = new ClonePair8400();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{-1};
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue()), caseInputs0),
            capture(values -> subject.method2(((Integer) values[0]).intValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{0};
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue()), caseInputs1),
            capture(values -> subject.method2(((Integer) values[0]).intValue()), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{1};
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue()), caseInputs2),
            capture(values -> subject.method2(((Integer) values[0]).intValue()), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{2};
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue()), caseInputs3),
            capture(values -> subject.method2(((Integer) values[0]).intValue()), caseInputs3)
        );
        Object[] caseInputs4 = new Object[]{3};
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue()), caseInputs4),
            capture(values -> subject.method2(((Integer) values[0]).intValue()), caseInputs4)
        );
    }
}
