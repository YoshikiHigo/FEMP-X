package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair12542NoDifferenceTest {

    private final ClonePair12542 subject = new ClonePair12542();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), new Object[]{"a"}),
            capture(values -> subject.method2((String) values[0]), new Object[]{"a"})
        );
    }
}
