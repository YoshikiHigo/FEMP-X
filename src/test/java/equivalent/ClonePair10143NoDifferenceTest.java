package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair10143NoDifferenceTest {

    private final ClonePair10143 subject = new ClonePair10143();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{list(), '\0'};
        assertEquivalent(
            capture(values -> subject.method1((java.util.List) values[0], ((Character) values[1]).charValue()), caseInputs0),
            capture(values -> subject.method2((java.util.List) values[0], ((Character) values[1]).charValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, '\0'};
        assertEquivalent(
            capture(values -> subject.method1((java.util.List) values[0], ((Character) values[1]).charValue()), caseInputs1),
            capture(values -> subject.method2((java.util.List) values[0], ((Character) values[1]).charValue()), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{list("alpha"), '\0'};
        assertEquivalent(
            capture(values -> subject.method1((java.util.List) values[0], ((Character) values[1]).charValue()), caseInputs2),
            capture(values -> subject.method2((java.util.List) values[0], ((Character) values[1]).charValue()), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{list("alpha", "beta"), '\0'};
        assertEquivalent(
            capture(values -> subject.method1((java.util.List) values[0], ((Character) values[1]).charValue()), caseInputs3),
            capture(values -> subject.method2((java.util.List) values[0], ((Character) values[1]).charValue()), caseInputs3)
        );
        Object[] caseInputs4 = new Object[]{list("beta", "gamma"), '\0'};
        assertEquivalent(
            capture(values -> subject.method1((java.util.List) values[0], ((Character) values[1]).charValue()), caseInputs4),
            capture(values -> subject.method2((java.util.List) values[0], ((Character) values[1]).charValue()), caseInputs4)
        );
    }
}
