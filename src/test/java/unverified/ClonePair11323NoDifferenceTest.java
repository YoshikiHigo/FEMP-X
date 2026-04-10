package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair11323NoDifferenceTest {

    private final ClonePair11323 subject = new ClonePair11323();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue()), new Object[]{"a", -1}),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue()), new Object[]{"a", -1})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue()), new Object[]{null, -1}),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue()), new Object[]{null, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue()), new Object[]{"A", -1}),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue()), new Object[]{"A", -1})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue()), new Object[]{"abc", -1}),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue()), new Object[]{"abc", -1})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue()), new Object[]{"ABC", -1}),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue()), new Object[]{"ABC", -1})
        );
    }
}
