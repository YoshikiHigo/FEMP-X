package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair9887NoDifferenceTest {

    private final ClonePair9887 subject = new ClonePair9887();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new String[]{}, -1}),
            capture(values -> subject.method2((String[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new String[]{}, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1((String[]) values[0], ((Integer) values[1]).intValue()), new Object[]{null, -1}),
            capture(values -> subject.method2((String[]) values[0], ((Integer) values[1]).intValue()), new Object[]{null, -1})
        );
    }
}
