package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair6813NoDifferenceTest {

    private final ClonePair6813 subject = new ClonePair6813();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{date(0L)};
        assertEquivalent(
            capture(values -> subject.method1((java.util.Date) values[0]), caseInputs0),
            capture(values -> subject.method2((java.util.Date) values[0]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null};
        assertEquivalent(
            capture(values -> subject.method1((java.util.Date) values[0]), caseInputs1),
            capture(values -> subject.method2((java.util.Date) values[0]), caseInputs1)
        );
    }
}
