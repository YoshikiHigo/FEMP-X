package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair12527NoDifferenceTest {

    private final ClonePair12527 subject = new ClonePair12527();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{"", new byte[]{}};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (byte[]) values[1]), caseInputs0),
            capture(values -> subject.method2((String) values[0], (byte[]) values[1]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{"", null};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (byte[]) values[1]), caseInputs1),
            capture(values -> subject.method2((String) values[0], (byte[]) values[1]), caseInputs1)
        );
    }
}
