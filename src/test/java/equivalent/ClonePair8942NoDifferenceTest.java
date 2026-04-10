package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair8942NoDifferenceTest {

    private final ClonePair8942 subject = new ClonePair8942();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{1};
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue()), caseInputs0),
            capture(values -> subject.method2(((Integer) values[0]).intValue()), caseInputs0)
        );
    }
}
