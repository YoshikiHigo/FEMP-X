package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair7291NoDifferenceTest {

    private final ClonePair7291 subject = new ClonePair7291();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{new Object[]{}, 1};
        assertEquivalent(
            capture(values -> subject.method1((Object[]) values[0], ((Integer) values[1]).intValue()), caseInputs0),
            capture(values -> subject.method2((Object[]) values[0], ((Integer) values[1]).intValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{new Object[]{"a", Integer.valueOf(1)}, 1};
        assertEquivalent(
            capture(values -> subject.method1((Object[]) values[0], ((Integer) values[1]).intValue()), caseInputs1),
            capture(values -> subject.method2((Object[]) values[0], ((Integer) values[1]).intValue()), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{new Object[]{}, -1};
        assertEquivalent(
            capture(values -> subject.method1((Object[]) values[0], ((Integer) values[1]).intValue()), caseInputs2),
            capture(values -> subject.method2((Object[]) values[0], ((Integer) values[1]).intValue()), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{new Object[]{"a"}, 0};
        assertEquivalent(
            capture(values -> subject.method1((Object[]) values[0], ((Integer) values[1]).intValue()), caseInputs3),
            capture(values -> subject.method2((Object[]) values[0], ((Integer) values[1]).intValue()), caseInputs3)
        );
    }
}
