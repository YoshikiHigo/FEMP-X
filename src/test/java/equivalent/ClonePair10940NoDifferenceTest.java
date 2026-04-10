package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair10940NoDifferenceTest {

    private final ClonePair10940 subject = new ClonePair10940();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{'\0'};
        assertEquivalent(
            capture(values -> subject.method1(((Character) values[0]).charValue()), caseInputs0),
            capture(values -> subject.method2(((Character) values[0]).charValue()), caseInputs0)
        );
    }
}
