package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair6006NoDifferenceTest {

    private final ClonePair6006 subject = new ClonePair6006();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{list(), list()};
        assertEquivalent(
            capture(values -> subject.method1((java.util.ArrayList) values[0], (java.util.ArrayList) values[1]), caseInputs0),
            capture(values -> subject.method2((java.util.ArrayList) values[0], (java.util.ArrayList) values[1]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, list()};
        assertEquivalent(
            capture(values -> subject.method1((java.util.ArrayList) values[0], (java.util.ArrayList) values[1]), caseInputs1),
            capture(values -> subject.method2((java.util.ArrayList) values[0], (java.util.ArrayList) values[1]), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{list(), list(Double.valueOf(1.0))};
        assertEquivalent(
            capture(values -> subject.method1((java.util.ArrayList) values[0], (java.util.ArrayList) values[1]), caseInputs2),
            capture(values -> subject.method2((java.util.ArrayList) values[0], (java.util.ArrayList) values[1]), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{list(Double.valueOf(1.0), Double.valueOf(2.0)), list(Double.valueOf(1.0), Double.valueOf(2.0))};
        assertEquivalent(
            capture(values -> subject.method1((java.util.ArrayList) values[0], (java.util.ArrayList) values[1]), caseInputs3),
            capture(values -> subject.method2((java.util.ArrayList) values[0], (java.util.ArrayList) values[1]), caseInputs3)
        );
    }
}
