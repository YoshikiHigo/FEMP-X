package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair6492NoDifferenceTest {

    private final ClonePair6492 subject = new ClonePair6492();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((float[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (byte[]) values[3], ((Integer) values[4]).intValue()), new Object[]{new float[]{}, -1, 1, new byte[]{}, -1}),
            capture(values -> subject.method2((float[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (byte[]) values[3], ((Integer) values[4]).intValue()), new Object[]{new float[]{}, -1, 1, new byte[]{}, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1((float[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (byte[]) values[3], ((Integer) values[4]).intValue()), new Object[]{null, -1, 1, new byte[]{}, -1}),
            capture(values -> subject.method2((float[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (byte[]) values[3], ((Integer) values[4]).intValue()), new Object[]{null, -1, 1, new byte[]{}, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1((float[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (byte[]) values[3], ((Integer) values[4]).intValue()), new Object[]{new float[]{}, -1, -1, new byte[]{}, -1}),
            capture(values -> subject.method2((float[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (byte[]) values[3], ((Integer) values[4]).intValue()), new Object[]{new float[]{}, -1, -1, new byte[]{}, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1((float[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (byte[]) values[3], ((Integer) values[4]).intValue()), new Object[]{new float[]{}, -1, -1, null, -1}),
            capture(values -> subject.method2((float[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (byte[]) values[3], ((Integer) values[4]).intValue()), new Object[]{new float[]{}, -1, -1, null, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1((float[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (byte[]) values[3], ((Integer) values[4]).intValue()), new Object[]{new float[]{}, -1, -1, new byte[]{0}, -1}),
            capture(values -> subject.method2((float[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (byte[]) values[3], ((Integer) values[4]).intValue()), new Object[]{new float[]{}, -1, -1, new byte[]{0}, -1})
        );
    }
}
