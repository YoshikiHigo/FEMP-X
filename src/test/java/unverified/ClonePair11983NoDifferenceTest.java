package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair11983NoDifferenceTest {

    private final ClonePair11983 subject = new ClonePair11983();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2]), new Object[]{"", "foo", null}),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2]), new Object[]{"", "foo", null})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2]), new Object[]{null, null, null}),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2]), new Object[]{null, null, null})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2]), new Object[]{"foo", null, null}),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2]), new Object[]{"foo", null, null})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2]), new Object[]{"foo/bar", null, null}),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2]), new Object[]{"foo/bar", null, null})
        );
    }
}
