package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair11281NoDifferenceTest {

    private final ClonePair11281 subject = new ClonePair11281();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1(((Character) values[0]).charValue()), new Object[]{'\0'}),
            capture(values -> subject.method2(((Character) values[0]).charValue()), new Object[]{'\0'})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Character) values[0]).charValue()), new Object[]{'0'}),
            capture(values -> subject.method2(((Character) values[0]).charValue()), new Object[]{'0'})
        );
    }
}
