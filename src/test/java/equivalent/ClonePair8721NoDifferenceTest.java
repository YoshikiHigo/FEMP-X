package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair8721NoDifferenceTest {

    private final ClonePair8721 subject = new ClonePair8721();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{"foo", new String[]{}, 1};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String[]) values[1], ((Integer) values[2]).intValue()), caseInputs0),
            capture(values -> subject.method2((String) values[0], (String[]) values[1], ((Integer) values[2]).intValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, null, 1};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String[]) values[1], ((Integer) values[2]).intValue()), caseInputs1),
            capture(values -> subject.method2((String) values[0], (String[]) values[1], ((Integer) values[2]).intValue()), caseInputs1)
        );
    }
}
