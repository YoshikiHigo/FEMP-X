package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair7667NoDifferenceTest {

    private final ClonePair7667 subject = new ClonePair7667();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{'\0', new char[]{}, 1, 1};
        assertEquivalent(
            capture(values -> subject.method1(((Character) values[0]).charValue(), (char[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), caseInputs0),
            capture(values -> subject.method2(((Character) values[0]).charValue(), (char[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{'\0', new char[]{}, -1, 1};
        assertEquivalent(
            capture(values -> subject.method1(((Character) values[0]).charValue(), (char[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), caseInputs1),
            capture(values -> subject.method2(((Character) values[0]).charValue(), (char[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{'\0', null, -1, 1};
        assertEquivalent(
            capture(values -> subject.method1(((Character) values[0]).charValue(), (char[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), caseInputs2),
            capture(values -> subject.method2(((Character) values[0]).charValue(), (char[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), caseInputs2)
        );
    }
}
