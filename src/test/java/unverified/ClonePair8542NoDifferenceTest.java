package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair8542NoDifferenceTest {

    private final ClonePair8542 subject = new ClonePair8542();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), new Object[]{" "}),
            capture(values -> subject.method2((String) values[0]), new Object[]{" "})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), new Object[]{"1"}),
            capture(values -> subject.method2((String) values[0]), new Object[]{"1"})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), new Object[]{"1.5"}),
            capture(values -> subject.method2((String) values[0]), new Object[]{"1.5"})
        );
    }
}
