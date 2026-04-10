package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair10371NoDifferenceTest {

    private final ClonePair10371 subject = new ClonePair10371();

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
        Object[] caseInputs2 = new Object[]{"a", ""};
        assertEquivalent(
            capture(values -> subject.method1((CharSequence) values[0], (CharSequence) values[1]), caseInputs2),
            capture(values -> subject.method2((CharSequence) values[0], (CharSequence) values[1]), caseInputs2)
        );
    }
}
