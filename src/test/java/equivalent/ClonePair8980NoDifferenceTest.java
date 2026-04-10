package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair8980NoDifferenceTest {

    private final ClonePair8980 subject = new ClonePair8980();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{1, new int[]{}};
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue(), (int[]) values[1]), caseInputs0),
            capture(values -> subject.method2(((Integer) values[0]).intValue(), (int[]) values[1]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{-1, new int[]{}};
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue(), (int[]) values[1]), caseInputs1),
            capture(values -> subject.method2(((Integer) values[0]).intValue(), (int[]) values[1]), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{0, new int[]{}};
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue(), (int[]) values[1]), caseInputs2),
            capture(values -> subject.method2(((Integer) values[0]).intValue(), (int[]) values[1]), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{1, null};
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue(), (int[]) values[1]), caseInputs3),
            capture(values -> subject.method2(((Integer) values[0]).intValue(), (int[]) values[1]), caseInputs3)
        );
        Object[] caseInputs4 = new Object[]{1, new int[]{0}};
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue(), (int[]) values[1]), caseInputs4),
            capture(values -> subject.method2(((Integer) values[0]).intValue(), (int[]) values[1]), caseInputs4)
        );
    }
}
