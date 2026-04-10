package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair9086NoDifferenceTest {

    private final ClonePair9086 subject = new ClonePair9086();

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
            capture(values -> subject.method1((String) values[0], (String) values[1]), new Object[]{"a", "a.b"}),
            capture(values -> subject.method2((String) values[0], (String) values[1]), new Object[]{"a", "a.b"})
        );
    }
}
