package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair3402NoDifferenceTest {

    private final ClonePair3402 subject = new ClonePair3402();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1(((Long) values[0]).longValue(), ((Integer) values[1]).intValue()), new Object[]{-1L, -1}),
            capture(values -> subject.method2(((Long) values[0]).longValue(), ((Integer) values[1]).intValue()), new Object[]{-1L, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Long) values[0]).longValue(), ((Integer) values[1]).intValue()), new Object[]{0L, -1}),
            capture(values -> subject.method2(((Long) values[0]).longValue(), ((Integer) values[1]).intValue()), new Object[]{0L, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Long) values[0]).longValue(), ((Integer) values[1]).intValue()), new Object[]{1L, -1}),
            capture(values -> subject.method2(((Long) values[0]).longValue(), ((Integer) values[1]).intValue()), new Object[]{1L, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Long) values[0]).longValue(), ((Integer) values[1]).intValue()), new Object[]{2L, -1}),
            capture(values -> subject.method2(((Long) values[0]).longValue(), ((Integer) values[1]).intValue()), new Object[]{2L, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Long) values[0]).longValue(), ((Integer) values[1]).intValue()), new Object[]{16L, -1}),
            capture(values -> subject.method2(((Long) values[0]).longValue(), ((Integer) values[1]).intValue()), new Object[]{16L, -1})
        );
    }
}
