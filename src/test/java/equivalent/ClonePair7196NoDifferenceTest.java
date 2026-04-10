package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair7196NoDifferenceTest {

    private final ClonePair7196 subject = new ClonePair7196();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{"a", "a", false};
        assertEquivalent(
            capture(values -> subject.method1((Comparable) values[0], (Comparable) values[1], ((Boolean) values[2]).booleanValue()), caseInputs0),
            capture(values -> subject.method2((Comparable) values[0], (Comparable) values[1], ((Boolean) values[2]).booleanValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, "a", false};
        assertEquivalent(
            capture(values -> subject.method1((Comparable) values[0], (Comparable) values[1], ((Boolean) values[2]).booleanValue()), caseInputs1),
            capture(values -> subject.method2((Comparable) values[0], (Comparable) values[1], ((Boolean) values[2]).booleanValue()), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{"A", "a", false};
        assertEquivalent(
            capture(values -> subject.method1((Comparable) values[0], (Comparable) values[1], ((Boolean) values[2]).booleanValue()), caseInputs2),
            capture(values -> subject.method2((Comparable) values[0], (Comparable) values[1], ((Boolean) values[2]).booleanValue()), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{Integer.valueOf(1), "a", false};
        assertEquivalent(
            capture(values -> subject.method1((Comparable) values[0], (Comparable) values[1], ((Boolean) values[2]).booleanValue()), caseInputs3),
            capture(values -> subject.method2((Comparable) values[0], (Comparable) values[1], ((Boolean) values[2]).booleanValue()), caseInputs3)
        );
        Object[] caseInputs4 = new Object[]{"a", null, false};
        assertEquivalent(
            capture(values -> subject.method1((Comparable) values[0], (Comparable) values[1], ((Boolean) values[2]).booleanValue()), caseInputs4),
            capture(values -> subject.method2((Comparable) values[0], (Comparable) values[1], ((Boolean) values[2]).booleanValue()), caseInputs4)
        );
    }
}
