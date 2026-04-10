package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair13068NoDifferenceTest {

    private final ClonePair13068 subject = new ClonePair13068();

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
