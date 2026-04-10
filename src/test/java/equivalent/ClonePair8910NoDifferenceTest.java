package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair8910NoDifferenceTest {

    private final ClonePair8910 subject = new ClonePair8910();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{Boolean.FALSE, false};
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0], ((Boolean) values[1]).booleanValue()), caseInputs0),
            capture(values -> subject.method2((Object) values[0], ((Boolean) values[1]).booleanValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{Boolean.TRUE, false};
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0], ((Boolean) values[1]).booleanValue()), caseInputs1),
            capture(values -> subject.method2((Object) values[0], ((Boolean) values[1]).booleanValue()), caseInputs1)
        );
    }
}
