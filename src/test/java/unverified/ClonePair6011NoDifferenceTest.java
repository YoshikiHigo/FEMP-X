package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair6011NoDifferenceTest {

    private final ClonePair6011 subject = new ClonePair6011();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((Object[]) values[0], (Object[]) values[1]), new Object[]{new Object[]{}, new Object[]{}}),
            capture(values -> subject.method2((Object[]) values[0], (Object[]) values[1]), new Object[]{new Object[]{}, new Object[]{}})
        );
        assertEquivalent(
            capture(values -> subject.method1((Object[]) values[0], (Object[]) values[1]), new Object[]{null, new Object[]{}}),
            capture(values -> subject.method2((Object[]) values[0], (Object[]) values[1]), new Object[]{null, new Object[]{}})
        );
        assertEquivalent(
            capture(values -> subject.method1((Object[]) values[0], (Object[]) values[1]), new Object[]{new Object[]{"a"}, new Object[]{}}),
            capture(values -> subject.method2((Object[]) values[0], (Object[]) values[1]), new Object[]{new Object[]{"a"}, new Object[]{}})
        );
    }
}
