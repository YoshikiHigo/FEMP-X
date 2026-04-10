package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair6561NoDifferenceTest {

    private final ClonePair6561 subject = new ClonePair6561();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((java.util.Map) values[0], (String) values[1]), new Object[]{map(), ""}),
            capture(values -> subject.method2((java.util.Map) values[0], (String) values[1]), new Object[]{map(), ""})
        );
        assertEquivalent(
            capture(values -> subject.method1((java.util.Map) values[0], (String) values[1]), new Object[]{null, ""}),
            capture(values -> subject.method2((java.util.Map) values[0], (String) values[1]), new Object[]{null, ""})
        );
        assertEquivalent(
            capture(values -> subject.method1((java.util.Map) values[0], (String) values[1]), new Object[]{map("a", "1"), "a"}),
            capture(values -> subject.method2((java.util.Map) values[0], (String) values[1]), new Object[]{map("a", "1"), "a"})
        );
    }
}
