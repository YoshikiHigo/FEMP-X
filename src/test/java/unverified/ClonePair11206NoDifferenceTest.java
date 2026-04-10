package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair11206NoDifferenceTest {

    private final ClonePair11206 subject = new ClonePair11206();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1]), new Object[]{"a", "a"}),
            capture(values -> subject.method2((String) values[0], (String) values[1]), new Object[]{"a", "a"})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1]), new Object[]{null, "a"}),
            capture(values -> subject.method2((String) values[0], (String) values[1]), new Object[]{null, "a"})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1]), new Object[]{"a.b", "a"}),
            capture(values -> subject.method2((String) values[0], (String) values[1]), new Object[]{"a.b", "a"})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1]), new Object[]{"a.b", "a.b"}),
            capture(values -> subject.method2((String) values[0], (String) values[1]), new Object[]{"a.b", "a.b"})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1]), new Object[]{"a.b.c", "a.b.c"}),
            capture(values -> subject.method2((String) values[0], (String) values[1]), new Object[]{"a.b.c", "a.b.c"})
        );
    }
}
