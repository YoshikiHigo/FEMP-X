package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair8080NoDifferenceTest {

    private final ClonePair8080 subject = new ClonePair8080();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{"", "foo", "", new int[]{}};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2], (int[]) values[3]), caseInputs0),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2], (int[]) values[3]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, "foo", "", new int[]{}};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2], (int[]) values[3]), caseInputs1),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2], (int[]) values[3]), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{"foo", "foo", "", new int[]{}};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2], (int[]) values[3]), caseInputs2),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2], (int[]) values[3]), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{"", null, "", new int[]{}};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2], (int[]) values[3]), caseInputs3),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2], (int[]) values[3]), caseInputs3)
        );
    }
}
