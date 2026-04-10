package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair10362NoDifferenceTest {

    private final ClonePair10362 subject = new ClonePair10362();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{"", ""};
        assertEquivalent(
            capture(values -> subject.method1((CharSequence) values[0], (CharSequence) values[1]), caseInputs0),
            capture(values -> subject.method2((CharSequence) values[0], (CharSequence) values[1]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, ""};
        assertEquivalent(
            capture(values -> subject.method1((CharSequence) values[0], (CharSequence) values[1]), caseInputs1),
            capture(values -> subject.method2((CharSequence) values[0], (CharSequence) values[1]), caseInputs1)
        );
    }
}
