package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair7346NoDifferenceTest {

    private final ClonePair7346 subject = new ClonePair7346();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{-1L, 1, -1, ""};
        assertEquivalent(
            capture(values -> subject.method1(((Long) values[0]).longValue(), ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (String) values[3]), caseInputs0),
            capture(values -> subject.method2(((Long) values[0]).longValue(), ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (String) values[3]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{0L, 1, -1, ""};
        assertEquivalent(
            capture(values -> subject.method1(((Long) values[0]).longValue(), ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (String) values[3]), caseInputs1),
            capture(values -> subject.method2(((Long) values[0]).longValue(), ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (String) values[3]), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{-1L, 1, -1, null};
        assertEquivalent(
            capture(values -> subject.method1(((Long) values[0]).longValue(), ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (String) values[3]), caseInputs2),
            capture(values -> subject.method2(((Long) values[0]).longValue(), ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (String) values[3]), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{-1L, 1, 0, "a"};
        assertEquivalent(
            capture(values -> subject.method1(((Long) values[0]).longValue(), ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (String) values[3]), caseInputs3),
            capture(values -> subject.method2(((Long) values[0]).longValue(), ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (String) values[3]), caseInputs3)
        );
    }
}
