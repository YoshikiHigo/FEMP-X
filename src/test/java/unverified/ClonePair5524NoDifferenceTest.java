package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair5524NoDifferenceTest {

    private final ClonePair5524 subject = new ClonePair5524();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue()), new Object[]{-1, 1}),
            capture(values -> subject.method2(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue()), new Object[]{-1, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue()), new Object[]{0, 1}),
            capture(values -> subject.method2(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue()), new Object[]{0, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue()), new Object[]{-1, -1}),
            capture(values -> subject.method2(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue()), new Object[]{-1, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue()), new Object[]{-1, 0}),
            capture(values -> subject.method2(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue()), new Object[]{-1, 0})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue()), new Object[]{-1, 3}),
            capture(values -> subject.method2(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue()), new Object[]{-1, 3})
        );
    }
}
