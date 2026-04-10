package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair12640NoDifferenceTest {

    private final ClonePair12640 subject = new ClonePair12640();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{"foo", null, "foo"};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2]), caseInputs0),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, null, null};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2]), caseInputs1),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2]), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{null, null, "foo"};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2]), caseInputs2),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2]), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{"foo", null, "foo/bar"};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2]), caseInputs3),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2]), caseInputs3)
        );
        Object[] caseInputs4 = new Object[]{"foo/bar", null, "foo"};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2]), caseInputs4),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2]), caseInputs4)
        );
    }
}
