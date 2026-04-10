package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair12657NoDifferenceTest {

    private final ClonePair12657 subject = new ClonePair12657();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((float[]) values[0], ((Float) values[1]).floatValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), new Object[]{new float[]{}, 0.5f, -1, -1}),
            capture(values -> subject.method2((float[]) values[0], ((Float) values[1]).floatValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), new Object[]{new float[]{}, 0.5f, -1, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1((float[]) values[0], ((Float) values[1]).floatValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), new Object[]{null, 0.5f, -1, -1}),
            capture(values -> subject.method2((float[]) values[0], ((Float) values[1]).floatValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), new Object[]{null, 0.5f, -1, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1((float[]) values[0], ((Float) values[1]).floatValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), new Object[]{new float[]{}, 0.5f, 0, -1}),
            capture(values -> subject.method2((float[]) values[0], ((Float) values[1]).floatValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), new Object[]{new float[]{}, 0.5f, 0, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1((float[]) values[0], ((Float) values[1]).floatValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), new Object[]{new float[]{}, 0.5f, 1, -1}),
            capture(values -> subject.method2((float[]) values[0], ((Float) values[1]).floatValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), new Object[]{new float[]{}, 0.5f, 1, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1((float[]) values[0], ((Float) values[1]).floatValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), new Object[]{new float[]{}, 0.5f, 2, -1}),
            capture(values -> subject.method2((float[]) values[0], ((Float) values[1]).floatValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), new Object[]{new float[]{}, 0.5f, 2, -1})
        );
    }
}
