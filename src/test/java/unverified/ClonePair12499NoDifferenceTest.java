package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair12499NoDifferenceTest {

    private final ClonePair12499 subject = new ClonePair12499();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), new Object[]{"a"}),
            capture(values -> subject.method2((String) values[0]), new Object[]{"a"})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), new Object[]{"0"}),
            capture(values -> subject.method2((String) values[0]), new Object[]{"0"})
        );
    }
}
