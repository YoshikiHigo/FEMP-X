package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair10910NoDifferenceTest {

    private final ClonePair10910 subject = new ClonePair10910();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue(), (String) values[2]), new Object[]{"a", 1, "a"}),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue(), (String) values[2]), new Object[]{"a", 1, "a"})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue(), (String) values[2]), new Object[]{null, 1, "a"}),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue(), (String) values[2]), new Object[]{null, 1, "a"})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue(), (String) values[2]), new Object[]{"A", 1, "a"}),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue(), (String) values[2]), new Object[]{"A", 1, "a"})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue(), (String) values[2]), new Object[]{"a", 2, "a"}),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue(), (String) values[2]), new Object[]{"a", 2, "a"})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue(), (String) values[2]), new Object[]{"a", 2, "A"}),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue(), (String) values[2]), new Object[]{"a", 2, "A"})
        );
    }
}
