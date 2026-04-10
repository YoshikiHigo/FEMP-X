package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair5931NoDifferenceTest {

    private final ClonePair5931 subject = new ClonePair5931();

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
            capture(values -> subject.method1(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue()), new Object[]{1, 1}),
            capture(values -> subject.method2(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue()), new Object[]{1, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue()), new Object[]{2, 1}),
            capture(values -> subject.method2(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue()), new Object[]{2, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue()), new Object[]{3, 1}),
            capture(values -> subject.method2(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue()), new Object[]{3, 1})
        );
    }
}
