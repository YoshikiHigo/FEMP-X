package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair7820NoDifferenceTest {

    private final ClonePair7820 subject = new ClonePair7820();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{new byte[]{}, (byte) -1, -1};
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Byte) values[1]).byteValue(), ((Integer) values[2]).intValue()), caseInputs0),
            capture(values -> subject.method2((byte[]) values[0], ((Byte) values[1]).byteValue(), ((Integer) values[2]).intValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, (byte) -1, -1};
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Byte) values[1]).byteValue(), ((Integer) values[2]).intValue()), caseInputs1),
            capture(values -> subject.method2((byte[]) values[0], ((Byte) values[1]).byteValue(), ((Integer) values[2]).intValue()), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{new byte[]{}, (byte) -1, 0};
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Byte) values[1]).byteValue(), ((Integer) values[2]).intValue()), caseInputs2),
            capture(values -> subject.method2((byte[]) values[0], ((Byte) values[1]).byteValue(), ((Integer) values[2]).intValue()), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{new byte[]{0}, (byte) 0, 0};
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Byte) values[1]).byteValue(), ((Integer) values[2]).intValue()), caseInputs3),
            capture(values -> subject.method2((byte[]) values[0], ((Byte) values[1]).byteValue(), ((Integer) values[2]).intValue()), caseInputs3)
        );
        Object[] caseInputs4 = new Object[]{new byte[]{0, 1, 2}, (byte) 1, 0};
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Byte) values[1]).byteValue(), ((Integer) values[2]).intValue()), caseInputs4),
            capture(values -> subject.method2((byte[]) values[0], ((Byte) values[1]).byteValue(), ((Integer) values[2]).intValue()), caseInputs4)
        );
    }
}
