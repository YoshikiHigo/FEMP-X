package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair7250NoDifferenceTest {

    private final ClonePair7250 subject = new ClonePair7250();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{1, 1, new byte[]{}, false};
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue(), (byte[]) values[2], ((Boolean) values[3]).booleanValue()), caseInputs0),
            capture(values -> subject.method2(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue(), (byte[]) values[2], ((Boolean) values[3]).booleanValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{-1, 1, new byte[]{}, false};
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue(), (byte[]) values[2], ((Boolean) values[3]).booleanValue()), caseInputs1),
            capture(values -> subject.method2(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue(), (byte[]) values[2], ((Boolean) values[3]).booleanValue()), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{-1, 1, null, false};
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue(), (byte[]) values[2], ((Boolean) values[3]).booleanValue()), caseInputs2),
            capture(values -> subject.method2(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue(), (byte[]) values[2], ((Boolean) values[3]).booleanValue()), caseInputs2)
        );
    }
}
