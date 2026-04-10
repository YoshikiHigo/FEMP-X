package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair9011NoDifferenceTest {

    private final ClonePair9011 subject = new ClonePair9011();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{-1L, 1L};
        assertEquivalent(
            capture(values -> subject.method1(((Long) values[0]).longValue(), ((Long) values[1]).longValue()), caseInputs0),
            capture(values -> subject.method2(((Long) values[0]).longValue(), ((Long) values[1]).longValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{0L, 1L};
        assertEquivalent(
            capture(values -> subject.method1(((Long) values[0]).longValue(), ((Long) values[1]).longValue()), caseInputs1),
            capture(values -> subject.method2(((Long) values[0]).longValue(), ((Long) values[1]).longValue()), caseInputs1)
        );
    }
}
