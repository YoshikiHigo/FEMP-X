package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair11461NoDifferenceTest {

    private final ClonePair11461 subject = new ClonePair11461();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2]), new Object[]{"foo", "foo", null}),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2]), new Object[]{"foo", "foo", null})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2]), new Object[]{"foo", "foo", "foo/bar"}),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2]), new Object[]{"foo", "foo", "foo/bar"})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2]), new Object[]{null, null, null}),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2]), new Object[]{null, null, null})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2]), new Object[]{"foo/bar", "foo", "foo/bar"}),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2]), new Object[]{"foo/bar", "foo", "foo/bar"})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2]), new Object[]{"", "foo", null}),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2]), new Object[]{"", "foo", null})
        );
    }
}
