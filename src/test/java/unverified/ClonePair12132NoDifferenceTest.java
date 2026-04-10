package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair12132NoDifferenceTest {

    private final ClonePair12132 subject = new ClonePair12132();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1(((Character) values[0]).charValue()), new Object[]{'\0'}),
            capture(values -> subject.method2(((Character) values[0]).charValue()), new Object[]{'\0'})
        );
    }
}
