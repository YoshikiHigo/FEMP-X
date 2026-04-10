package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair6812NoDifferenceTest {

    private final ClonePair6812 subject = new ClonePair6812();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{new Object[]{}, -1, -1, Integer.valueOf(7)};
        assertEquivalent(
            capture(values -> subject.method1((Object[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (Object) values[3]), caseInputs0),
            capture(values -> subject.method2((Object[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (Object) values[3]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{new Object[]{}, 0, -1, Integer.valueOf(7)};
        assertEquivalent(
            capture(values -> subject.method1((Object[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (Object) values[3]), caseInputs1),
            capture(values -> subject.method2((Object[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (Object) values[3]), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{new Object[]{}, 1, -1, Integer.valueOf(7)};
        assertEquivalent(
            capture(values -> subject.method1((Object[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (Object) values[3]), caseInputs2),
            capture(values -> subject.method2((Object[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (Object) values[3]), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{new Object[]{}, 2, -1, Integer.valueOf(7)};
        assertEquivalent(
            capture(values -> subject.method1((Object[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (Object) values[3]), caseInputs3),
            capture(values -> subject.method2((Object[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (Object) values[3]), caseInputs3)
        );
        Object[] caseInputs4 = new Object[]{new Object[]{}, -1, 0, Integer.valueOf(7)};
        assertEquivalent(
            capture(values -> subject.method1((Object[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (Object) values[3]), caseInputs4),
            capture(values -> subject.method2((Object[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (Object) values[3]), caseInputs4)
        );
    }
}
