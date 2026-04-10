package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair12823NoDifferenceTest {

    private final ClonePair12823 subject = new ClonePair12823();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{"foo", "foo", ""};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2]), caseInputs0),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{"foo", "foo", null};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2]), caseInputs1),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2]), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{"foo", "foo", "foo"};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2]), caseInputs2),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2]), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{"foo", "foo", "foo/bar"};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2]), caseInputs3),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2]), caseInputs3)
        );
    }
}
