package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair5909NoDifferenceTest {

    private final ClonePair5909 subject = new ClonePair5909();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((Comparable) values[0], (Comparable) values[1]), new Object[]{"a", "a"}),
            capture(values -> subject.method2((Comparable) values[0], (Comparable) values[1]), new Object[]{"a", "a"})
        );
        assertEquivalent(
            capture(values -> subject.method1((Comparable) values[0], (Comparable) values[1]), new Object[]{null, "a"}),
            capture(values -> subject.method2((Comparable) values[0], (Comparable) values[1]), new Object[]{null, "a"})
        );
        assertEquivalent(
            capture(values -> subject.method1((Comparable) values[0], (Comparable) values[1]), new Object[]{"A", "a"}),
            capture(values -> subject.method2((Comparable) values[0], (Comparable) values[1]), new Object[]{"A", "a"})
        );
        assertEquivalent(
            capture(values -> subject.method1((Comparable) values[0], (Comparable) values[1]), new Object[]{Integer.valueOf(1), "a"}),
            capture(values -> subject.method2((Comparable) values[0], (Comparable) values[1]), new Object[]{Integer.valueOf(1), "a"})
        );
        assertEquivalent(
            capture(values -> subject.method1((Comparable) values[0], (Comparable) values[1]), new Object[]{"a", null}),
            capture(values -> subject.method2((Comparable) values[0], (Comparable) values[1]), new Object[]{"a", null})
        );
    }
}
