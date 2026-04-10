package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair8218NoDifferenceTest {

    private final ClonePair8218 subject = new ClonePair8218();

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
