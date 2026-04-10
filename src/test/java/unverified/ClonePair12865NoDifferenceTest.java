package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair12865NoDifferenceTest {

    private final ClonePair12865 subject = new ClonePair12865();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue()), new Object[]{"foo", 1}),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue()), new Object[]{"foo", 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue()), new Object[]{null, 1}),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue()), new Object[]{null, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue()), new Object[]{"", 1}),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue()), new Object[]{"", 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue()), new Object[]{"bar", 1}),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue()), new Object[]{"bar", 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue()), new Object[]{"foo", -1}),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue()), new Object[]{"foo", -1})
        );
    }
}
