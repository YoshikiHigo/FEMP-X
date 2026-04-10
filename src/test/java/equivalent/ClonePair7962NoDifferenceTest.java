package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair7962NoDifferenceTest {

    private final ClonePair7962 subject = new ClonePair7962();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{"foo", "foo"};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1]), caseInputs0),
            capture(values -> subject.method2((String) values[0], (String) values[1]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, "foo"};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1]), caseInputs1),
            capture(values -> subject.method2((String) values[0], (String) values[1]), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{"foo/bar", "foo"};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1]), caseInputs2),
            capture(values -> subject.method2((String) values[0], (String) values[1]), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{"foo.bar", "foo"};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1]), caseInputs3),
            capture(values -> subject.method2((String) values[0], (String) values[1]), caseInputs3)
        );
        Object[] caseInputs4 = new Object[]{"bar", "foo"};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1]), caseInputs4),
            capture(values -> subject.method2((String) values[0], (String) values[1]), caseInputs4)
        );
    }
}
