package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair10743NoDifferenceTest {

    private final ClonePair10743 subject = new ClonePair10743();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{"foo", new int[]{}};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (int[]) values[1]), caseInputs0),
            capture(values -> subject.method2((String) values[0], (int[]) values[1]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, new int[]{}};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (int[]) values[1]), caseInputs1),
            capture(values -> subject.method2((String) values[0], (int[]) values[1]), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{"foo", new int[]{0}};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (int[]) values[1]), caseInputs2),
            capture(values -> subject.method2((String) values[0], (int[]) values[1]), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{"foo.bar", new int[]{1, 2}};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (int[]) values[1]), caseInputs3),
            capture(values -> subject.method2((String) values[0], (int[]) values[1]), caseInputs3)
        );
    }
}
