package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair9193NoDifferenceTest {

    private final ClonePair9193 subject = new ClonePair9193();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{new byte[]{}, 1, (byte) -1};
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Integer) values[1]).intValue(), ((Byte) values[2]).byteValue()), caseInputs0),
            capture(values -> subject.method2((byte[]) values[0], ((Integer) values[1]).intValue(), ((Byte) values[2]).byteValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, 1, (byte) -1};
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Integer) values[1]).intValue(), ((Byte) values[2]).byteValue()), caseInputs1),
            capture(values -> subject.method2((byte[]) values[0], ((Integer) values[1]).intValue(), ((Byte) values[2]).byteValue()), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{new byte[]{0}, 1, (byte) -1};
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Integer) values[1]).intValue(), ((Byte) values[2]).byteValue()), caseInputs2),
            capture(values -> subject.method2((byte[]) values[0], ((Integer) values[1]).intValue(), ((Byte) values[2]).byteValue()), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{new byte[]{0}, 1, (byte) 0};
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Integer) values[1]).intValue(), ((Byte) values[2]).byteValue()), caseInputs3),
            capture(values -> subject.method2((byte[]) values[0], ((Integer) values[1]).intValue(), ((Byte) values[2]).byteValue()), caseInputs3)
        );
        Object[] caseInputs4 = new Object[]{new byte[]{0, 1, 2}, 2, (byte) 1};
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Integer) values[1]).intValue(), ((Byte) values[2]).byteValue()), caseInputs4),
            capture(values -> subject.method2((byte[]) values[0], ((Integer) values[1]).intValue(), ((Byte) values[2]).byteValue()), caseInputs4)
        );
    }
}
