package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair6560NoDifferenceTest {

    private final ClonePair6560 subject = new ClonePair6560();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{map(), ""};
        assertEquivalent(
            capture(values -> subject.method1((java.util.Map) values[0], (String) values[1]), caseInputs0),
            capture(values -> subject.method2((java.util.Map) values[0], (String) values[1]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, ""};
        assertEquivalent(
            capture(values -> subject.method1((java.util.Map) values[0], (String) values[1]), caseInputs1),
            capture(values -> subject.method2((java.util.Map) values[0], (String) values[1]), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{map("a", "1"), "a"};
        assertEquivalent(
            capture(values -> subject.method1((java.util.Map) values[0], (String) values[1]), caseInputs2),
            capture(values -> subject.method2((java.util.Map) values[0], (String) values[1]), caseInputs2)
        );
    }
}
