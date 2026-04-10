package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair5380NoDifferenceTest {

    private final ClonePair5380 subject = new ClonePair5380();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Integer) values[2]).intValue()), new Object[]{"a", "UTF-8", 1}),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Integer) values[2]).intValue()), new Object[]{"a", "UTF-8", 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Integer) values[2]).intValue()), new Object[]{null, "UTF-8", 1}),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Integer) values[2]).intValue()), new Object[]{null, "UTF-8", 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Integer) values[2]).intValue()), new Object[]{"a", "UTF-8", -1}),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Integer) values[2]).intValue()), new Object[]{"a", "UTF-8", -1})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Integer) values[2]).intValue()), new Object[]{"a", "a", 0}),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Integer) values[2]).intValue()), new Object[]{"a", "a", 0})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Integer) values[2]).intValue()), new Object[]{"a.b", "a.b", 1}),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Integer) values[2]).intValue()), new Object[]{"a.b", "a.b", 1})
        );
    }
}
