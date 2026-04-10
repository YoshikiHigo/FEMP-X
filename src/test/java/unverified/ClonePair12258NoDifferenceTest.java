package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair12258NoDifferenceTest {

    private final ClonePair12258 subject = new ClonePair12258();

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
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue()), new Object[]{"a.b", -1}),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue()), new Object[]{"a.b", -1})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue()), new Object[]{"a.b.c", -1}),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue()), new Object[]{"a.b.c", -1})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue()), new Object[]{"ab", -1}),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue()), new Object[]{"ab", -1})
        );
    }
}
