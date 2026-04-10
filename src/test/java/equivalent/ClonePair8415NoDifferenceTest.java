package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair8415NoDifferenceTest {

    private final ClonePair8415 subject = new ClonePair8415();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{Boolean.FALSE};
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0]), caseInputs0),
            capture(values -> subject.method2((Object) values[0]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null};
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0]), caseInputs1),
            capture(values -> subject.method2((Object) values[0]), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{Boolean.TRUE};
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0]), caseInputs2),
            capture(values -> subject.method2((Object) values[0]), caseInputs2)
        );
    }
}
