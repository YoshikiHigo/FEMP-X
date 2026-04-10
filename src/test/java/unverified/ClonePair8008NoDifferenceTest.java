package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair8008NoDifferenceTest {

    private final ClonePair8008 subject = new ClonePair8008();

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
