package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair12200NoDifferenceTest {

    private final ClonePair12200 subject = new ClonePair12200();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{list(), list()};
        assertEquivalent(
            capture(values -> subject.method1((java.util.List) values[0], (java.util.List) values[1]), caseInputs0),
            capture(values -> subject.method2((java.util.List) values[0], (java.util.List) values[1]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, list()};
        assertEquivalent(
            capture(values -> subject.method1((java.util.List) values[0], (java.util.List) values[1]), caseInputs1),
            capture(values -> subject.method2((java.util.List) values[0], (java.util.List) values[1]), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{list("alpha"), list()};
        assertEquivalent(
            capture(values -> subject.method1((java.util.List) values[0], (java.util.List) values[1]), caseInputs2),
            capture(values -> subject.method2((java.util.List) values[0], (java.util.List) values[1]), caseInputs2)
        );
    }
}
