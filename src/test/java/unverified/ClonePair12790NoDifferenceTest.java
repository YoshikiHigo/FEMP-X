package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair12790NoDifferenceTest {

    private final ClonePair12790 subject = new ClonePair12790();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Boolean) values[1]).booleanValue()), new Object[]{"a", false}),
            capture(values -> subject.method2((String) values[0], ((Boolean) values[1]).booleanValue()), new Object[]{"a", false})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Boolean) values[1]).booleanValue()), new Object[]{null, false}),
            capture(values -> subject.method2((String) values[0], ((Boolean) values[1]).booleanValue()), new Object[]{null, false})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Boolean) values[1]).booleanValue()), new Object[]{"a.b", false}),
            capture(values -> subject.method2((String) values[0], ((Boolean) values[1]).booleanValue()), new Object[]{"a.b", false})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Boolean) values[1]).booleanValue()), new Object[]{"a.b.c", false}),
            capture(values -> subject.method2((String) values[0], ((Boolean) values[1]).booleanValue()), new Object[]{"a.b.c", false})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Boolean) values[1]).booleanValue()), new Object[]{"ab", false}),
            capture(values -> subject.method2((String) values[0], ((Boolean) values[1]).booleanValue()), new Object[]{"ab", false})
        );
    }
}
