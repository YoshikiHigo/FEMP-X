package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair9005NoDifferenceTest {

    private final ClonePair9005 subject = new ClonePair9005();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{enumeration(), hashtable(), hashtable()};
        assertEquivalent(
            capture(values -> subject.method1((java.util.Enumeration) values[0], (java.util.Hashtable) values[1], (java.util.Hashtable) values[2]), caseInputs0),
            capture(values -> subject.method2((java.util.Enumeration) values[0], (java.util.Hashtable) values[1], (java.util.Hashtable) values[2]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, null, null};
        assertEquivalent(
            capture(values -> subject.method1((java.util.Enumeration) values[0], (java.util.Hashtable) values[1], (java.util.Hashtable) values[2]), caseInputs1),
            capture(values -> subject.method2((java.util.Enumeration) values[0], (java.util.Hashtable) values[1], (java.util.Hashtable) values[2]), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{enumeration(), null, null};
        assertEquivalent(
            capture(values -> subject.method1((java.util.Enumeration) values[0], (java.util.Hashtable) values[1], (java.util.Hashtable) values[2]), caseInputs2),
            capture(values -> subject.method2((java.util.Enumeration) values[0], (java.util.Hashtable) values[1], (java.util.Hashtable) values[2]), caseInputs2)
        );
    }
}
