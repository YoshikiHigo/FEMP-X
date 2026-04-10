package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair13652NoDifferenceTest {

    private final ClonePair13652 subject = new ClonePair13652();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{1, new String[]{}, ""};
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue(), (String[]) values[1], (String) values[2]), caseInputs0),
            capture(values -> subject.method2(((Integer) values[0]).intValue(), (String[]) values[1], (String) values[2]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{1, null, ""};
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue(), (String[]) values[1], (String) values[2]), caseInputs1),
            capture(values -> subject.method2(((Integer) values[0]).intValue(), (String[]) values[1], (String) values[2]), caseInputs1)
        );
    }
}
