package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair6811NoDifferenceTest {

    private final ClonePair6811 subject = new ClonePair6811();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{1, -1, -1}),
            capture(values -> subject.method2(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{1, -1, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{-1, -1, -1}),
            capture(values -> subject.method2(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{-1, -1, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{0, -1, -1}),
            capture(values -> subject.method2(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{0, -1, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{2, -1, -1}),
            capture(values -> subject.method2(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{2, -1, -1})
        );
    }
}
