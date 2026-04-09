package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair4084NoDifferenceTest {

    private final ClonePair4084 subject = new ClonePair4084();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String[]) values[0], (String[]) values[1]), new Object[]{new String[]{}, new String[]{}}),
            capture(values -> subject.method2((String[]) values[0], (String[]) values[1]), new Object[]{new String[]{}, new String[]{}})
        );
        assertEquivalent(
            capture(values -> subject.method1((String[]) values[0], (String[]) values[1]), new Object[]{null, null}),
            capture(values -> subject.method2((String[]) values[0], (String[]) values[1]), new Object[]{null, null})
        );
    }
}
