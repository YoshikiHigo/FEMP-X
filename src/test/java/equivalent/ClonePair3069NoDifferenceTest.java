package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair3069NoDifferenceTest {

    private final ClonePair3069 subject = new ClonePair3069();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Byte) values[1]).byteValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), new Object[]{new byte[]{}, (byte) -1, 1, -1}),
            capture(values -> subject.method2((byte[]) values[0], ((Byte) values[1]).byteValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), new Object[]{new byte[]{}, (byte) -1, 1, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Byte) values[1]).byteValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), new Object[]{new byte[]{}, (byte) -1, 1, 2}),
            capture(values -> subject.method2((byte[]) values[0], ((Byte) values[1]).byteValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), new Object[]{new byte[]{}, (byte) -1, 1, 2})
        );
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Byte) values[1]).byteValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), new Object[]{null, (byte) -1, -1, 0}),
            capture(values -> subject.method2((byte[]) values[0], ((Byte) values[1]).byteValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), new Object[]{null, (byte) -1, -1, 0})
        );
    }
}
