package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair5644NoDifferenceTest {

    private final ClonePair5644 subject = new ClonePair5644();

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
    }
}
