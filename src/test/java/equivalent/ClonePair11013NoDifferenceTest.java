package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair11013NoDifferenceTest {

    private final ClonePair11013 subject = new ClonePair11013();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{"a", new byte[]{}};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (byte[]) values[1]), caseInputs0),
            capture(values -> subject.method2((String) values[0], (byte[]) values[1]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, new byte[]{}};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (byte[]) values[1]), caseInputs1),
            capture(values -> subject.method2((String) values[0], (byte[]) values[1]), caseInputs1)
        );
    }
}
