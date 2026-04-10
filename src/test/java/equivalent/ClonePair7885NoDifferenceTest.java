package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair7885NoDifferenceTest {

    private final ClonePair7885 subject = new ClonePair7885();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{"a"};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), caseInputs0),
            capture(values -> subject.method2((String) values[0]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), caseInputs1),
            capture(values -> subject.method2((String) values[0]), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{"a.b"};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), caseInputs2),
            capture(values -> subject.method2((String) values[0]), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{"a.b.c"};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), caseInputs3),
            capture(values -> subject.method2((String) values[0]), caseInputs3)
        );
        Object[] caseInputs4 = new Object[]{"ab"};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), caseInputs4),
            capture(values -> subject.method2((String) values[0]), caseInputs4)
        );
    }
}
