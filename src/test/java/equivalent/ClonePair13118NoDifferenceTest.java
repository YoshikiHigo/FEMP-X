package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair13118NoDifferenceTest {

    private final ClonePair13118 subject = new ClonePair13118();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{1, 1, ""};
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue(), (String) values[2]), caseInputs0),
            capture(values -> subject.method2(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue(), (String) values[2]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{-1, 1, ""};
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue(), (String) values[2]), caseInputs1),
            capture(values -> subject.method2(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue(), (String) values[2]), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{0, 1, ""};
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue(), (String) values[2]), caseInputs2),
            capture(values -> subject.method2(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue(), (String) values[2]), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{1, 0, ""};
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue(), (String) values[2]), caseInputs3),
            capture(values -> subject.method2(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue(), (String) values[2]), caseInputs3)
        );
        Object[] caseInputs4 = new Object[]{1, 1, null};
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue(), (String) values[2]), caseInputs4),
            capture(values -> subject.method2(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue(), (String) values[2]), caseInputs4)
        );
    }
}
