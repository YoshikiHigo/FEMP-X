package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair6010NoDifferenceTest {

    private final ClonePair6010 subject = new ClonePair6010();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{new Object[]{}, new Object[]{}};
        assertEquivalent(
            capture(values -> subject.method1((Object[]) values[0], (Object[]) values[1]), caseInputs0),
            capture(values -> subject.method2((Object[]) values[0], (Object[]) values[1]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, new Object[]{}};
        assertEquivalent(
            capture(values -> subject.method1((Object[]) values[0], (Object[]) values[1]), caseInputs1),
            capture(values -> subject.method2((Object[]) values[0], (Object[]) values[1]), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{new Object[]{"a"}, new Object[]{}};
        assertEquivalent(
            capture(values -> subject.method1((Object[]) values[0], (Object[]) values[1]), caseInputs2),
            capture(values -> subject.method2((Object[]) values[0], (Object[]) values[1]), caseInputs2)
        );
    }
}
