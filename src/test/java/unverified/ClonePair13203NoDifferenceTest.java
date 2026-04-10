package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair13203NoDifferenceTest {

    private final ClonePair13203 subject = new ClonePair13203();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2]), new Object[]{"foo", null, "foo"}),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2]), new Object[]{"foo", null, "foo"})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2]), new Object[]{"foo", "foo/bar", "foo"}),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2]), new Object[]{"foo", "foo/bar", "foo"})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2]), new Object[]{"a", "a.b", "a"}),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2]), new Object[]{"a", "a.b", "a"})
        );
    }
}
