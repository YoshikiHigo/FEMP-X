package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair11326NoDifferenceTest {

    private final ClonePair11326 subject = new ClonePair11326();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{""};
        assertEquivalent(
            capture(values -> subject.method1((CharSequence) values[0]), caseInputs0),
            capture(values -> subject.method2((CharSequence) values[0]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null};
        assertEquivalent(
            capture(values -> subject.method1((CharSequence) values[0]), caseInputs1),
            capture(values -> subject.method2((CharSequence) values[0]), caseInputs1)
        );
    }
}
