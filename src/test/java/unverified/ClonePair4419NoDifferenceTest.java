package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair4419NoDifferenceTest {

    private final ClonePair4419 subject = new ClonePair4419();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1(((Long) values[0]).longValue()), new Object[]{-1L}),
            capture(values -> subject.method2(((Long) values[0]).longValue()), new Object[]{-1L})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Long) values[0]).longValue()), new Object[]{2L}),
            capture(values -> subject.method2(((Long) values[0]).longValue()), new Object[]{2L})
        );
    }
}
