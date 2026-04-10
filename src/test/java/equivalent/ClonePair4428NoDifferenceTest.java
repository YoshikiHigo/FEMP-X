package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair4428NoDifferenceTest {

    private final ClonePair4428 subject = new ClonePair4428();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((short[]) values[0]), new Object[]{new short[]{}}),
            capture(values -> subject.method2((short[]) values[0]), new Object[]{new short[]{}})
        );
        assertEquivalent(
            capture(values -> subject.method1((short[]) values[0]), new Object[]{null}),
            capture(values -> subject.method2((short[]) values[0]), new Object[]{null})
        );
        assertEquivalent(
            capture(values -> subject.method1((short[]) values[0]), new Object[]{new short[]{0}}),
            capture(values -> subject.method2((short[]) values[0]), new Object[]{new short[]{0}})
        );
        assertEquivalent(
            capture(values -> subject.method1((short[]) values[0]), new Object[]{new short[]{1, 2}}),
            capture(values -> subject.method2((short[]) values[0]), new Object[]{new short[]{1, 2}})
        );
        assertEquivalent(
            capture(values -> subject.method1((short[]) values[0]), new Object[]{new short[]{-1, 0, 1}}),
            capture(values -> subject.method2((short[]) values[0]), new Object[]{new short[]{-1, 0, 1}})
        );
    }
}
