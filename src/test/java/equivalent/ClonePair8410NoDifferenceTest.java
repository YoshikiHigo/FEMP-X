package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair8410NoDifferenceTest {

    private final ClonePair8410 subject = new ClonePair8410();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{"a", new int[]{}};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (int[]) values[1]), caseInputs0),
            capture(values -> subject.method2((String) values[0], (int[]) values[1]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{"a", null};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (int[]) values[1]), caseInputs1),
            capture(values -> subject.method2((String) values[0], (int[]) values[1]), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{"a", new int[]{0}};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (int[]) values[1]), caseInputs2),
            capture(values -> subject.method2((String) values[0], (int[]) values[1]), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{"a", new int[]{1}};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (int[]) values[1]), caseInputs3),
            capture(values -> subject.method2((String) values[0], (int[]) values[1]), caseInputs3)
        );
        Object[] caseInputs4 = new Object[]{"a.b", new int[]{1}};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (int[]) values[1]), caseInputs4),
            capture(values -> subject.method2((String) values[0], (int[]) values[1]), caseInputs4)
        );
    }
}
