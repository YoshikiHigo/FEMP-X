package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair7502NoDifferenceTest {

    private final ClonePair7502 subject = new ClonePair7502();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{'\0'};
        assertEquivalent(
            capture(values -> subject.method1(((Character) values[0]).charValue()), caseInputs0),
            capture(values -> subject.method2(((Character) values[0]).charValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{'a'};
        assertEquivalent(
            capture(values -> subject.method1(((Character) values[0]).charValue()), caseInputs1),
            capture(values -> subject.method2(((Character) values[0]).charValue()), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{'A'};
        assertEquivalent(
            capture(values -> subject.method1(((Character) values[0]).charValue()), caseInputs2),
            capture(values -> subject.method2(((Character) values[0]).charValue()), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{'.'};
        assertEquivalent(
            capture(values -> subject.method1(((Character) values[0]).charValue()), caseInputs3),
            capture(values -> subject.method2(((Character) values[0]).charValue()), caseInputs3)
        );
        Object[] caseInputs4 = new Object[]{'/'};
        assertEquivalent(
            capture(values -> subject.method1(((Character) values[0]).charValue()), caseInputs4),
            capture(values -> subject.method2(((Character) values[0]).charValue()), caseInputs4)
        );
    }
}
