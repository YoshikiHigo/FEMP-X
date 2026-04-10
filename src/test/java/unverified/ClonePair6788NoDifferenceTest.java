package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair6788NoDifferenceTest {

    private final ClonePair6788 subject = new ClonePair6788();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue()), new Object[]{-1}),
            capture(values -> subject.method2(((Integer) values[0]).intValue()), new Object[]{-1})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue()), new Object[]{0}),
            capture(values -> subject.method2(((Integer) values[0]).intValue()), new Object[]{0})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue()), new Object[]{1}),
            capture(values -> subject.method2(((Integer) values[0]).intValue()), new Object[]{1})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue()), new Object[]{2}),
            capture(values -> subject.method2(((Integer) values[0]).intValue()), new Object[]{2})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue()), new Object[]{3}),
            capture(values -> subject.method2(((Integer) values[0]).intValue()), new Object[]{3})
        );
    }
}
