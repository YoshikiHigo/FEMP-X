package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair8202NoDifferenceTest {

    private final ClonePair8202 subject = new ClonePair8202();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{"", -1, 1}),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{"", -1, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{null, -1, 1}),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{null, -1, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{"", 1, 1}),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{"", 1, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{"", 2, 1}),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{"", 2, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{"", -1, -1}),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{"", -1, -1})
        );
    }
}
