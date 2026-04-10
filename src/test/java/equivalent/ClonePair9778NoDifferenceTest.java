package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair9778NoDifferenceTest {

    private final ClonePair9778 subject = new ClonePair9778();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{-1, -1, -1.0};
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue(), ((Double) values[2]).doubleValue()), caseInputs0),
            capture(values -> subject.method2(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue(), ((Double) values[2]).doubleValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{0, -1, -1.0};
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue(), ((Double) values[2]).doubleValue()), caseInputs1),
            capture(values -> subject.method2(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue(), ((Double) values[2]).doubleValue()), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{2, -1, -1.0};
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue(), ((Double) values[2]).doubleValue()), caseInputs2),
            capture(values -> subject.method2(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue(), ((Double) values[2]).doubleValue()), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{-1, 0, -1.0};
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue(), ((Double) values[2]).doubleValue()), caseInputs3),
            capture(values -> subject.method2(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue(), ((Double) values[2]).doubleValue()), caseInputs3)
        );
        Object[] caseInputs4 = new Object[]{-1, 2, -1.0};
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue(), ((Double) values[2]).doubleValue()), caseInputs4),
            capture(values -> subject.method2(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue(), ((Double) values[2]).doubleValue()), caseInputs4)
        );
    }
}
