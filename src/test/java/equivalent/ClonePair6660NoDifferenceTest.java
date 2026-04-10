package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair6660NoDifferenceTest {

    private final ClonePair6660 subject = new ClonePair6660();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{-1L, new byte[]{}, 1, 1};
        assertEquivalent(
            capture(values -> subject.method1(((Long) values[0]).longValue(), (byte[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), caseInputs0),
            capture(values -> subject.method2(((Long) values[0]).longValue(), (byte[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{-1L, null, 1, 1};
        assertEquivalent(
            capture(values -> subject.method1(((Long) values[0]).longValue(), (byte[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), caseInputs1),
            capture(values -> subject.method2(((Long) values[0]).longValue(), (byte[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{-1L, new byte[]{0, 1, 2}, 1, 1};
        assertEquivalent(
            capture(values -> subject.method1(((Long) values[0]).longValue(), (byte[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), caseInputs2),
            capture(values -> subject.method2(((Long) values[0]).longValue(), (byte[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), caseInputs2)
        );
    }
}
