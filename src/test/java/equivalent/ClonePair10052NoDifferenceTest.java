package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair10052NoDifferenceTest {

    private final ClonePair10052 subject = new ClonePair10052();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{"", "foo", ""};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2]), caseInputs0),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2]), caseInputs0)
        );
    }
}
