package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair6613NoDifferenceTest {

    private final ClonePair6613 subject = new ClonePair6613();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{"foo", list(), map()};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (java.util.List) values[1], (java.util.Map) values[2]), caseInputs0),
            capture(values -> subject.method2((String) values[0], (java.util.List) values[1], (java.util.Map) values[2]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, list(), map()};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (java.util.List) values[1], (java.util.Map) values[2]), caseInputs1),
            capture(values -> subject.method2((String) values[0], (java.util.List) values[1], (java.util.Map) values[2]), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{"foo", list("alpha"), map()};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (java.util.List) values[1], (java.util.Map) values[2]), caseInputs2),
            capture(values -> subject.method2((String) values[0], (java.util.List) values[1], (java.util.Map) values[2]), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{"foo", list("alpha", "beta"), map()};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (java.util.List) values[1], (java.util.Map) values[2]), caseInputs3),
            capture(values -> subject.method2((String) values[0], (java.util.List) values[1], (java.util.Map) values[2]), caseInputs3)
        );
    }
}
