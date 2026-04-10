package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair8416NoDifferenceTest {

    private final ClonePair8416 subject = new ClonePair8416();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0]), new Object[]{Boolean.FALSE}),
            capture(values -> subject.method2((Object) values[0]), new Object[]{Boolean.FALSE})
        );
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0]), new Object[]{null}),
            capture(values -> subject.method2((Object) values[0]), new Object[]{null})
        );
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0]), new Object[]{Boolean.TRUE}),
            capture(values -> subject.method2((Object) values[0]), new Object[]{Boolean.TRUE})
        );
    }
}
