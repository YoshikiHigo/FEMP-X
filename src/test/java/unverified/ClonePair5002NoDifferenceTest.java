package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair5002NoDifferenceTest {

    private final ClonePair5002 subject = new ClonePair5002();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalentForYear(Integer.MIN_VALUE);
        assertEquivalentForYear(-400);
        assertEquivalentForYear(-100);
        assertEquivalentForYear(-4);
        assertEquivalentForYear(-1);
        assertEquivalentForYear(0);
        assertEquivalentForYear(1);
        assertEquivalentForYear(4);
        assertEquivalentForYear(100);
        assertEquivalentForYear(400);
        assertEquivalentForYear(Integer.MAX_VALUE);
    }

    private void assertEquivalentForYear(int year) {
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue()), new Object[]{year}),
            capture(values -> subject.method2(((Integer) values[0]).intValue()), new Object[]{year})
        );
    }
}
