package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair8009NoDifferenceTest {

    private final ClonePair8009 subject = new ClonePair8009();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((Class[]) values[0], (Object[]) values[1]), new Object[]{new Class[]{}, new Object[]{}}),
            capture(values -> subject.method2((Class[]) values[0], (Object[]) values[1]), new Object[]{new Class[]{}, new Object[]{}})
        );
        assertEquivalent(
            capture(values -> subject.method1((Class[]) values[0], (Object[]) values[1]), new Object[]{null, new Object[]{}}),
            capture(values -> subject.method2((Class[]) values[0], (Object[]) values[1]), new Object[]{null, new Object[]{}})
        );
    }
}
