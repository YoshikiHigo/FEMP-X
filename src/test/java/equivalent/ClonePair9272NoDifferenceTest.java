package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair9272NoDifferenceTest {

    private final ClonePair9272 subject = new ClonePair9272();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{Integer.valueOf(-1)};
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0]), caseInputs0),
            capture(values -> subject.method2((Object) values[0]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null};
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0]), caseInputs1),
            capture(values -> subject.method2((Object) values[0]), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{Integer.valueOf(0)};
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0]), caseInputs2),
            capture(values -> subject.method2((Object) values[0]), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{Integer.valueOf(1)};
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0]), caseInputs3),
            capture(values -> subject.method2((Object) values[0]), caseInputs3)
        );
        Object[] caseInputs4 = new Object[]{Double.valueOf(-2.0)};
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0]), caseInputs4),
            capture(values -> subject.method2((Object) values[0]), caseInputs4)
        );
    }
}
