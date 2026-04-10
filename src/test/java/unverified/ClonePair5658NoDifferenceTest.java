package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair5658NoDifferenceTest {

    private final ClonePair5658 subject = new ClonePair5658();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Boolean) values[1]).booleanValue()), new Object[]{"foo", false}),
            capture(values -> subject.method2((String) values[0], ((Boolean) values[1]).booleanValue()), new Object[]{"foo", false})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Boolean) values[1]).booleanValue()), new Object[]{null, false}),
            capture(values -> subject.method2((String) values[0], ((Boolean) values[1]).booleanValue()), new Object[]{null, false})
        );
    }
}
