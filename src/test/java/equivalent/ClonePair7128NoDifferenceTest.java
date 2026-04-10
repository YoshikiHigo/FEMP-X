package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair7128NoDifferenceTest {

    private final ClonePair7128 subject = new ClonePair7128();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{-1L};
        assertEquivalent(
            capture(values -> subject.method1(((Long) values[0]).longValue()), caseInputs0),
            capture(values -> subject.method2(((Long) values[0]).longValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{0L};
        assertEquivalent(
            capture(values -> subject.method1(((Long) values[0]).longValue()), caseInputs1),
            capture(values -> subject.method2(((Long) values[0]).longValue()), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{1L};
        assertEquivalent(
            capture(values -> subject.method1(((Long) values[0]).longValue()), caseInputs2),
            capture(values -> subject.method2(((Long) values[0]).longValue()), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{2L};
        assertEquivalent(
            capture(values -> subject.method1(((Long) values[0]).longValue()), caseInputs3),
            capture(values -> subject.method2(((Long) values[0]).longValue()), caseInputs3)
        );
        Object[] caseInputs4 = new Object[]{16L};
        assertEquivalent(
            capture(values -> subject.method1(((Long) values[0]).longValue()), caseInputs4),
            capture(values -> subject.method2(((Long) values[0]).longValue()), caseInputs4)
        );
    }
}
