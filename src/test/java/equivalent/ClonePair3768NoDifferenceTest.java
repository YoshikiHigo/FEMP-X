package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair3768NoDifferenceTest {

    private final ClonePair3768 subject = new ClonePair3768();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Boolean) values[1]).booleanValue()), new Object[]{new byte[]{}, false}),
            capture(values -> subject.method2((byte[]) values[0], ((Boolean) values[1]).booleanValue()), new Object[]{new byte[]{}, false})
        );
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Boolean) values[1]).booleanValue()), new Object[]{null, false}),
            capture(values -> subject.method2((byte[]) values[0], ((Boolean) values[1]).booleanValue()), new Object[]{null, false})
        );
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Boolean) values[1]).booleanValue()), new Object[]{new byte[]{0, 1, 2}, false}),
            capture(values -> subject.method2((byte[]) values[0], ((Boolean) values[1]).booleanValue()), new Object[]{new byte[]{0, 1, 2}, false})
        );
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Boolean) values[1]).booleanValue()), new Object[]{new byte[]{1, 2, 3, 4}, false}),
            capture(values -> subject.method2((byte[]) values[0], ((Boolean) values[1]).booleanValue()), new Object[]{new byte[]{1, 2, 3, 4}, false})
        );
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], ((Boolean) values[1]).booleanValue()), new Object[]{new byte[]{0, 1, 2}, true}),
            capture(values -> subject.method2((byte[]) values[0], ((Boolean) values[1]).booleanValue()), new Object[]{new byte[]{0, 1, 2}, true})
        );
    }
}
