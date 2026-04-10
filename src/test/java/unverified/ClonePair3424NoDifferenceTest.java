package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair3424NoDifferenceTest {

    private final ClonePair3424 subject = new ClonePair3424();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), new Object[]{" "}),
            capture(values -> subject.method2((String) values[0]), new Object[]{" "})
        );
    }
}
