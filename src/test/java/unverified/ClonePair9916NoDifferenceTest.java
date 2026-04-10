package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair9916NoDifferenceTest {

    private final ClonePair9916 subject = new ClonePair9916();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1(((Character) values[0]).charValue()), new Object[]{'\0'}),
            capture(values -> subject.method2(((Character) values[0]).charValue()), new Object[]{'\0'})
        );
    }
}
