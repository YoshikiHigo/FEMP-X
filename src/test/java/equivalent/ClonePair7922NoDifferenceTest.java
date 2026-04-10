package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair7922NoDifferenceTest {

    private final ClonePair7922 subject = new ClonePair7922();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{"", "", 1};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Integer) values[2]).intValue()), caseInputs0),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Integer) values[2]).intValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, "", 1};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Integer) values[2]).intValue()), caseInputs1),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Integer) values[2]).intValue()), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{"Key:\"Value\";Other:Two", "", 1};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Integer) values[2]).intValue()), caseInputs2),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Integer) values[2]).intValue()), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{"a=1|b=2", "", 1};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Integer) values[2]).intValue()), caseInputs3),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Integer) values[2]).intValue()), caseInputs3)
        );
        Object[] caseInputs4 = new Object[]{"Key:\"Value\";Other:Two", "a=1|b=2", -1};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Integer) values[2]).intValue()), caseInputs4),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Integer) values[2]).intValue()), caseInputs4)
        );
    }
}
