package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair8211NoDifferenceTest {

    private final ClonePair8211 subject = new ClonePair8211();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0]), new Object[]{Boolean.FALSE}),
            capture(values -> subject.method2((Object) values[0]), new Object[]{Boolean.FALSE})
        );
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0]), new Object[]{Boolean.TRUE}),
            capture(values -> subject.method2((Object) values[0]), new Object[]{Boolean.TRUE})
        );
    }
}
