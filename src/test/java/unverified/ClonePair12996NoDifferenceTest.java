package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair12996NoDifferenceTest {

    private final ClonePair12996 subject = new ClonePair12996();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1(((Long) values[0]).longValue()), new Object[]{-1L}),
            capture(values -> subject.method2(((Long) values[0]).longValue()), new Object[]{-1L})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Long) values[0]).longValue()), new Object[]{0L}),
            capture(values -> subject.method2(((Long) values[0]).longValue()), new Object[]{0L})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Long) values[0]).longValue()), new Object[]{1L}),
            capture(values -> subject.method2(((Long) values[0]).longValue()), new Object[]{1L})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Long) values[0]).longValue()), new Object[]{2L}),
            capture(values -> subject.method2(((Long) values[0]).longValue()), new Object[]{2L})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Long) values[0]).longValue()), new Object[]{16L}),
            capture(values -> subject.method2(((Long) values[0]).longValue()), new Object[]{16L})
        );
    }
}
