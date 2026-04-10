package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair8769NoDifferenceTest {

    private final ClonePair8769 subject = new ClonePair8769();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{list(), -1};
        assertEquivalent(
            capture(values -> subject.method1((java.util.ArrayList) values[0], ((Integer) values[1]).intValue()), caseInputs0),
            capture(values -> subject.method2((java.util.ArrayList) values[0], ((Integer) values[1]).intValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, -1};
        assertEquivalent(
            capture(values -> subject.method1((java.util.ArrayList) values[0], ((Integer) values[1]).intValue()), caseInputs1),
            capture(values -> subject.method2((java.util.ArrayList) values[0], ((Integer) values[1]).intValue()), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{list("alpha"), -1};
        assertEquivalent(
            capture(values -> subject.method1((java.util.ArrayList) values[0], ((Integer) values[1]).intValue()), caseInputs2),
            capture(values -> subject.method2((java.util.ArrayList) values[0], ((Integer) values[1]).intValue()), caseInputs2)
        );
    }
}
