package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair6681NoDifferenceTest {

    private final ClonePair6681 subject = new ClonePair6681();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{vector()};
        assertEquivalent(
            capture(values -> subject.method1((java.util.Vector) values[0]), caseInputs0),
            capture(values -> subject.method2((java.util.Vector) values[0]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null};
        assertEquivalent(
            capture(values -> subject.method1((java.util.Vector) values[0]), caseInputs1),
            capture(values -> subject.method2((java.util.Vector) values[0]), caseInputs1)
        );
    }
}
