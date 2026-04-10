package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair8095NoDifferenceTest {

    private final ClonePair8095 subject = new ClonePair8095();

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
    }
}
