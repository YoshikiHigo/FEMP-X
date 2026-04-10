package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair10425NoDifferenceTest {

    private final ClonePair10425 subject = new ClonePair10425();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), new Object[]{null}),
            capture(values -> subject.method2((String) values[0]), new Object[]{null})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), new Object[]{""}),
            capture(values -> subject.method2((String) values[0]), new Object[]{""})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), new Object[]{" "}),
            capture(values -> subject.method2((String) values[0]), new Object[]{" "})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), new Object[]{"42"}),
            capture(values -> subject.method2((String) values[0]), new Object[]{"42"})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), new Object[]{"-1"}),
            capture(values -> subject.method2((String) values[0]), new Object[]{"-1"})
        );
    }
}
