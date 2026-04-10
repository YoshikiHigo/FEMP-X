package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair8453NoDifferenceTest {

    private final ClonePair8453 subject = new ClonePair8453();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), new Object[]{""}),
            capture(values -> subject.method2((String) values[0]), new Object[]{""})
        );
    }
}
