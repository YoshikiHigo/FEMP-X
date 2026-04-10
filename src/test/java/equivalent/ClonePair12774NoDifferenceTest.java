package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair12774NoDifferenceTest {

    private final ClonePair12774 subject = new ClonePair12774();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{"", null, "foo"};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2]), caseInputs0),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{"", "foo/bar", "foo"};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2]), caseInputs1),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2]), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{"foo", "foo/bar", "foo"};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2]), caseInputs2),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2]), caseInputs2)
        );
    }
}
