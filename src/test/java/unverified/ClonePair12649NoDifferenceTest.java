package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair12649NoDifferenceTest {

    private final ClonePair12649 subject = new ClonePair12649();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String[]) values[1]), new Object[]{"", new String[]{}}),
            capture(values -> subject.method2((String) values[0], (String[]) values[1]), new Object[]{"", new String[]{}})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String[]) values[1]), new Object[]{"", null}),
            capture(values -> subject.method2((String) values[0], (String[]) values[1]), new Object[]{"", null})
        );
    }
}
