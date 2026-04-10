package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair7348NoDifferenceTest {

    private final ClonePair7348 subject = new ClonePair7348();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1(((Long) values[0]).longValue(), ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (String) values[3]), new Object[]{-1L, 1, -1, ""}),
            capture(values -> subject.method2(((Long) values[0]).longValue(), ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (String) values[3]), new Object[]{-1L, 1, -1, ""})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Long) values[0]).longValue(), ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (String) values[3]), new Object[]{0L, 1, -1, ""}),
            capture(values -> subject.method2(((Long) values[0]).longValue(), ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (String) values[3]), new Object[]{0L, 1, -1, ""})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Long) values[0]).longValue(), ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (String) values[3]), new Object[]{-1L, 1, -1, null}),
            capture(values -> subject.method2(((Long) values[0]).longValue(), ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (String) values[3]), new Object[]{-1L, 1, -1, null})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Long) values[0]).longValue(), ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (String) values[3]), new Object[]{-1L, 1, 0, "a"}),
            capture(values -> subject.method2(((Long) values[0]).longValue(), ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (String) values[3]), new Object[]{-1L, 1, 0, "a"})
        );
    }
}
