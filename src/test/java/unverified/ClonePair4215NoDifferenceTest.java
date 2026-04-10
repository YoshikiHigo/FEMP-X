package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair4215NoDifferenceTest {

    private final ClonePair4215 subject = new ClonePair4215();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((java.util.List) values[0], (String) values[1]), new Object[]{list(), ""}),
            capture(values -> subject.method2((java.util.List) values[0], (String) values[1]), new Object[]{list(), ""})
        );
        assertEquivalent(
            capture(values -> subject.method1((java.util.List) values[0], (String) values[1]), new Object[]{null, ""}),
            capture(values -> subject.method2((java.util.List) values[0], (String) values[1]), new Object[]{null, ""})
        );
    }
}
