package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair5729NoDifferenceTest {

    private final ClonePair5729 subject = new ClonePair5729();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Boolean) values[2]).booleanValue()), new Object[]{"", "", false}),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Boolean) values[2]).booleanValue()), new Object[]{"", "", false})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Boolean) values[2]).booleanValue()), new Object[]{null, "", false}),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Boolean) values[2]).booleanValue()), new Object[]{null, "", false})
        );
    }
}
