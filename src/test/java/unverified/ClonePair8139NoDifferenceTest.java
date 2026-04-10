package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair8139NoDifferenceTest {

    private final ClonePair8139 subject = new ClonePair8139();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((long[]) values[0]), new Object[]{new long[]{}}),
            capture(values -> subject.method2((long[]) values[0]), new Object[]{new long[]{}})
        );
        assertEquivalent(
            capture(values -> subject.method1((long[]) values[0]), new Object[]{null}),
            capture(values -> subject.method2((long[]) values[0]), new Object[]{null})
        );
        assertEquivalent(
            capture(values -> subject.method1((long[]) values[0]), new Object[]{new long[]{0L}}),
            capture(values -> subject.method2((long[]) values[0]), new Object[]{new long[]{0L}})
        );
        assertEquivalent(
            capture(values -> subject.method1((long[]) values[0]), new Object[]{new long[]{1L, 2L}}),
            capture(values -> subject.method2((long[]) values[0]), new Object[]{new long[]{1L, 2L}})
        );
    }
}
