package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair8766NoDifferenceTest {

    private final ClonePair8766 subject = new ClonePair8766();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{list(), Integer.valueOf(7)};
        assertEquivalent(
            capture(values -> subject.method1((java.util.List) values[0], (Object) values[1]), caseInputs0),
            capture(values -> subject.method2((java.util.List) values[0], (Object) values[1]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, Integer.valueOf(7)};
        assertEquivalent(
            capture(values -> subject.method1((java.util.List) values[0], (Object) values[1]), caseInputs1),
            capture(values -> subject.method2((java.util.List) values[0], (Object) values[1]), caseInputs1)
        );
    }
}
