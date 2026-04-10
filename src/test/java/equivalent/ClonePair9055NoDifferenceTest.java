package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair9055NoDifferenceTest {

    private final ClonePair9055 subject = new ClonePair9055();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{vector(), vector()};
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0], (Object) values[1]), caseInputs0),
            capture(values -> subject.method2((Object) values[0], (Object) values[1]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, vector()};
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0], (Object) values[1]), caseInputs1),
            capture(values -> subject.method2((Object) values[0], (Object) values[1]), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{vector("alpha"), vector()};
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0], (Object) values[1]), caseInputs2),
            capture(values -> subject.method2((Object) values[0], (Object) values[1]), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{vector("alpha", "beta"), vector()};
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0], (Object) values[1]), caseInputs3),
            capture(values -> subject.method2((Object) values[0], (Object) values[1]), caseInputs3)
        );
        Object[] caseInputs4 = new Object[]{vector("beta", "gamma"), vector()};
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0], (Object) values[1]), caseInputs4),
            capture(values -> subject.method2((Object) values[0], (Object) values[1]), caseInputs4)
        );
    }
}
