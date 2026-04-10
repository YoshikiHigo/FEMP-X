package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair9733NoDifferenceTest {

    private final ClonePair9733 subject = new ClonePair9733();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((char[]) values[0], (char[]) values[1]), new Object[]{new char[]{}, new char[]{}}),
            capture(values -> subject.method2((char[]) values[0], (char[]) values[1]), new Object[]{new char[]{}, new char[]{}})
        );
        assertEquivalent(
            capture(values -> subject.method1((char[]) values[0], (char[]) values[1]), new Object[]{null, new char[]{}}),
            capture(values -> subject.method2((char[]) values[0], (char[]) values[1]), new Object[]{null, new char[]{}})
        );
    }
}
