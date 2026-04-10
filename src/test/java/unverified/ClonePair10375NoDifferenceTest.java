package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair10375NoDifferenceTest {

    private final ClonePair10375 subject = new ClonePair10375();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((CharSequence) values[0], (CharSequence) values[1]), new Object[]{"", ""}),
            capture(values -> subject.method2((CharSequence) values[0], (CharSequence) values[1]), new Object[]{"", ""})
        );
        assertEquivalent(
            capture(values -> subject.method1((CharSequence) values[0], (CharSequence) values[1]), new Object[]{null, ""}),
            capture(values -> subject.method2((CharSequence) values[0], (CharSequence) values[1]), new Object[]{null, ""})
        );
    }
}
