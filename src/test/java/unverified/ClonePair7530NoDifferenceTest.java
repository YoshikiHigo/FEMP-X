package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair7530NoDifferenceTest {

    private final ClonePair7530 subject = new ClonePair7530();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (byte[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue()), new Object[]{"a", new byte[]{}, -1, 1, 1}),
            capture(values -> subject.method2((String) values[0], (byte[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue()), new Object[]{"a", new byte[]{}, -1, 1, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (byte[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue()), new Object[]{null, new byte[]{}, -1, 1, 1}),
            capture(values -> subject.method2((String) values[0], (byte[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue()), new Object[]{null, new byte[]{}, -1, 1, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (byte[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue()), new Object[]{"a", new byte[]{0, 1, 2}, -1, 1, 1}),
            capture(values -> subject.method2((String) values[0], (byte[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue()), new Object[]{"a", new byte[]{0, 1, 2}, -1, 1, 1})
        );
    }
}
