package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair13069NoDifferenceTest {

    private final ClonePair13069 subject = new ClonePair13069();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), new Object[]{""}),
            capture(values -> subject.method2((String) values[0]), new Object[]{""})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), new Object[]{null}),
            capture(values -> subject.method2((String) values[0]), new Object[]{null})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), new Object[]{"foo"}),
            capture(values -> subject.method2((String) values[0]), new Object[]{"foo"})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), new Object[]{"foo/bar"}),
            capture(values -> subject.method2((String) values[0]), new Object[]{"foo/bar"})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), new Object[]{"foo.bar"}),
            capture(values -> subject.method2((String) values[0]), new Object[]{"foo.bar"})
        );
    }
}
