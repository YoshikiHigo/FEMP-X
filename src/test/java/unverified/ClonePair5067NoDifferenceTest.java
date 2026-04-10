package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair5067NoDifferenceTest {

    private final ClonePair5067 subject = new ClonePair5067();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue()), new Object[]{-1}),
            capture(values -> subject.method2(((Integer) values[0]).intValue()), new Object[]{-1})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue()), new Object[]{2}),
            capture(values -> subject.method2(((Integer) values[0]).intValue()), new Object[]{2})
        );
    }
}
