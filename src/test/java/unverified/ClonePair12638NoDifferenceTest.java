package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair12638NoDifferenceTest {

    private final ClonePair12638 subject = new ClonePair12638();

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
            capture(values -> subject.method1((String) values[0]), new Object[]{"a"}),
            capture(values -> subject.method2((String) values[0]), new Object[]{"a"})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), new Object[]{"20200506"}),
            capture(values -> subject.method2((String) values[0]), new Object[]{"20200506"})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), new Object[]{"20010101"}),
            capture(values -> subject.method2((String) values[0]), new Object[]{"20010101"})
        );
    }
}
