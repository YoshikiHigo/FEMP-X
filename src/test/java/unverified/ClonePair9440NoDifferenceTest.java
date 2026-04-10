package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair9440NoDifferenceTest {

    private final ClonePair9440 subject = new ClonePair9440();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2]), new Object[]{null, null, null}),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2]), new Object[]{null, null, null})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2]), new Object[]{"foo", "foo/bar", null}),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2]), new Object[]{"foo", "foo/bar", null})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2]), new Object[]{"foo", "foo", ""}),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2]), new Object[]{"foo", "foo", ""})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2]), new Object[]{"foo/bar", "foo", ""}),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2]), new Object[]{"foo/bar", "foo", ""})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2]), new Object[]{"foo", "foo", null}),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2]), new Object[]{"foo", "foo", null})
        );
    }
}
