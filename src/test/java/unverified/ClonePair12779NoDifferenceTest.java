package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair12779NoDifferenceTest {

    private final ClonePair12779 subject = new ClonePair12779();

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
    }
}
