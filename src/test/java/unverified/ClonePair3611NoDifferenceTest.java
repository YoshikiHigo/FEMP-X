package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair3611NoDifferenceTest {

    private final ClonePair3611 subject = new ClonePair3611();

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
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String[]) values[1]), new Object[]{null, null}),
            capture(values -> subject.method2((String) values[0], (String[]) values[1]), new Object[]{null, null})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String[]) values[1]), new Object[]{"foo", null}),
            capture(values -> subject.method2((String) values[0], (String[]) values[1]), new Object[]{"foo", null})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String[]) values[1]), new Object[]{"foo/bar", null}),
            capture(values -> subject.method2((String) values[0], (String[]) values[1]), new Object[]{"foo/bar", null})
        );
    }
}
