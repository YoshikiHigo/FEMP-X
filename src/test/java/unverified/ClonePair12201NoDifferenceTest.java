package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair12201NoDifferenceTest {

    private final ClonePair12201 subject = new ClonePair12201();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2]), new Object[]{"", "foo", ""}),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2]), new Object[]{"", "foo", ""})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2]), new Object[]{null, "foo", ""}),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2]), new Object[]{null, "foo", ""})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2]), new Object[]{"foo/bar", "foo", ""}),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2]), new Object[]{"foo/bar", "foo", ""})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2]), new Object[]{"foo", "foo", "foo"}),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2]), new Object[]{"foo", "foo", "foo"})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2]), new Object[]{"foo", "foo", "foo/bar"}),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2]), new Object[]{"foo", "foo", "foo/bar"})
        );
    }
}
