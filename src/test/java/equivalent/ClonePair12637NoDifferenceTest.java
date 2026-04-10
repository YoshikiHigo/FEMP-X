package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair12637NoDifferenceTest {

    private final ClonePair12637 subject = new ClonePair12637();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{'\0', '\0', '\0'};
        assertEquivalent(
            capture(values -> subject.method1(((Character) values[0]).charValue(), ((Character) values[1]).charValue(), ((Character) values[2]).charValue()), caseInputs0),
            capture(values -> subject.method2(((Character) values[0]).charValue(), ((Character) values[1]).charValue(), ((Character) values[2]).charValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{'A', '\0', 'a'};
        assertEquivalent(
            capture(values -> subject.method1(((Character) values[0]).charValue(), ((Character) values[1]).charValue(), ((Character) values[2]).charValue()), caseInputs1),
            capture(values -> subject.method2(((Character) values[0]).charValue(), ((Character) values[1]).charValue(), ((Character) values[2]).charValue()), caseInputs1)
        );
    }
}
