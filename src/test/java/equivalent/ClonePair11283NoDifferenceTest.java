package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair11283NoDifferenceTest {

    private final ClonePair11283 subject = new ClonePair11283();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{new byte[]{}, new short[]{}, 1, -1, 1, (short) -1};
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], (short[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue(), ((Short) values[5]).shortValue()), caseInputs0),
            capture(values -> subject.method2((byte[]) values[0], (short[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue(), ((Short) values[5]).shortValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{new byte[]{}, new short[]{}, 2, -1, 1, (short) -1};
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], (short[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue(), ((Short) values[5]).shortValue()), caseInputs1),
            capture(values -> subject.method2((byte[]) values[0], (short[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue(), ((Short) values[5]).shortValue()), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{new byte[]{}, new short[]{}, 1, -1, -1, (short) -1};
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], (short[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue(), ((Short) values[5]).shortValue()), caseInputs2),
            capture(values -> subject.method2((byte[]) values[0], (short[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue(), ((Short) values[5]).shortValue()), caseInputs2)
        );
    }
}
