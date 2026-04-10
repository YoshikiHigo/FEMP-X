package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair10825NoDifferenceTest {

    private final ClonePair10825 subject = new ClonePair10825();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue()), new Object[]{-1}),
            capture(values -> subject.method2(((Integer) values[0]).intValue()), new Object[]{-1})
        );
    }
}
