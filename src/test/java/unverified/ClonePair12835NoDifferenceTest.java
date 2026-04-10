package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair12835NoDifferenceTest {

    private final ClonePair12835 subject = new ClonePair12835();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((Class[]) values[0], (Class[]) values[1]), new Object[]{new Class[]{}, new Class[]{}}),
            capture(values -> subject.method2((Class[]) values[0], (Class[]) values[1]), new Object[]{new Class[]{}, new Class[]{}})
        );
        assertEquivalent(
            capture(values -> subject.method1((Class[]) values[0], (Class[]) values[1]), new Object[]{null, null}),
            capture(values -> subject.method2((Class[]) values[0], (Class[]) values[1]), new Object[]{null, null})
        );
    }
}
