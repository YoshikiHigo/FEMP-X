package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair12916NoDifferenceTest {

    private final ClonePair12916 subject = new ClonePair12916();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{""};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), caseInputs0),
            capture(values -> subject.method2((String) values[0]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{"a"};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), caseInputs1),
            capture(values -> subject.method2((String) values[0]), caseInputs1)
        );
    }
}
