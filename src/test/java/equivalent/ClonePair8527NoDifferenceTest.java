package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair8527NoDifferenceTest {

    private final ClonePair8527 subject = new ClonePair8527();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{hashtable(), "", ""};
        assertEquivalent(
            capture(values -> subject.method1((java.util.Hashtable) values[0], (String) values[1], (String) values[2]), caseInputs0),
            capture(values -> subject.method2((java.util.Hashtable) values[0], (String) values[1], (String) values[2]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, "", ""};
        assertEquivalent(
            capture(values -> subject.method1((java.util.Hashtable) values[0], (String) values[1], (String) values[2]), caseInputs1),
            capture(values -> subject.method2((java.util.Hashtable) values[0], (String) values[1], (String) values[2]), caseInputs1)
        );
    }
}
