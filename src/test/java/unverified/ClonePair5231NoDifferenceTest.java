package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair5231NoDifferenceTest {

    private final ClonePair5231 subject = new ClonePair5231();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((java.util.Properties) values[0], (String) values[1], (String) values[2]), new Object[]{props(), "", ""}),
            capture(values -> subject.method2((java.util.Properties) values[0], (String) values[1], (String) values[2]), new Object[]{props(), "", ""})
        );
        assertEquivalent(
            capture(values -> subject.method1((java.util.Properties) values[0], (String) values[1], (String) values[2]), new Object[]{null, "", ""}),
            capture(values -> subject.method2((java.util.Properties) values[0], (String) values[1], (String) values[2]), new Object[]{null, "", ""})
        );
    }
}
