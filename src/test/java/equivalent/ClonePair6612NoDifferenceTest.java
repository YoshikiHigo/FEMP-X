package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair6612NoDifferenceTest {

    private final ClonePair6612 subject = new ClonePair6612();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{hashMap(), ""};
        assertEquivalent(
            capture(values -> subject.method1((java.util.HashMap) values[0], (String) values[1]), caseInputs0),
            capture(values -> subject.method2((java.util.HashMap) values[0], (String) values[1]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{hashMap(), "a"};
        assertEquivalent(
            capture(values -> subject.method1((java.util.HashMap) values[0], (String) values[1]), caseInputs1),
            capture(values -> subject.method2((java.util.HashMap) values[0], (String) values[1]), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{null, "a"};
        assertEquivalent(
            capture(values -> subject.method1((java.util.HashMap) values[0], (String) values[1]), caseInputs2),
            capture(values -> subject.method2((java.util.HashMap) values[0], (String) values[1]), caseInputs2)
        );
    }
}
