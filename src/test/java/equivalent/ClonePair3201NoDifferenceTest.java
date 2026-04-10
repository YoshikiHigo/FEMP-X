package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair3201NoDifferenceTest {

    private final ClonePair3201 subject = new ClonePair3201();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], (String) values[1]), new Object[]{new byte[]{}, ""}),
            capture(values -> subject.method2((byte[]) values[0], (String) values[1]), new Object[]{new byte[]{}, ""})
        );
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], (String) values[1]), new Object[]{null, ""}),
            capture(values -> subject.method2((byte[]) values[0], (String) values[1]), new Object[]{null, ""})
        );
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], (String) values[1]), new Object[]{new byte[]{0}, ""}),
            capture(values -> subject.method2((byte[]) values[0], (String) values[1]), new Object[]{new byte[]{0}, ""})
        );
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], (String) values[1]), new Object[]{new byte[]{0, 1, 2}, ""}),
            capture(values -> subject.method2((byte[]) values[0], (String) values[1]), new Object[]{new byte[]{0, 1, 2}, ""})
        );
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0], (String) values[1]), new Object[]{new byte[]{1, 2, 3, 4}, ""}),
            capture(values -> subject.method2((byte[]) values[0], (String) values[1]), new Object[]{new byte[]{1, 2, 3, 4}, ""})
        );
    }
}
