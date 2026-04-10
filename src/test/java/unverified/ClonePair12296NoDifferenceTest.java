package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair12296NoDifferenceTest {

    private final ClonePair12296 subject = new ClonePair12296();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1(((Long) values[0]).longValue(), ((Long) values[1]).longValue()), new Object[]{1L, 1L}),
            capture(values -> subject.method2(((Long) values[0]).longValue(), ((Long) values[1]).longValue()), new Object[]{1L, 1L})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Long) values[0]).longValue(), ((Long) values[1]).longValue()), new Object[]{2L, 2L}),
            capture(values -> subject.method2(((Long) values[0]).longValue(), ((Long) values[1]).longValue()), new Object[]{2L, 2L})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Long) values[0]).longValue(), ((Long) values[1]).longValue()), new Object[]{16L, 16L}),
            capture(values -> subject.method2(((Long) values[0]).longValue(), ((Long) values[1]).longValue()), new Object[]{16L, 16L})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Long) values[0]).longValue(), ((Long) values[1]).longValue()), new Object[]{255L, 255L}),
            capture(values -> subject.method2(((Long) values[0]).longValue(), ((Long) values[1]).longValue()), new Object[]{255L, 255L})
        );
    }
}
