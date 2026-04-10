package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair8225NoDifferenceTest {

    private final ClonePair8225 subject = new ClonePair8225();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0]), new Object[]{Integer.valueOf(7)}),
            capture(values -> subject.method2((Object) values[0]), new Object[]{Integer.valueOf(7)})
        );
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0]), new Object[]{null}),
            capture(values -> subject.method2((Object) values[0]), new Object[]{null})
        );
    }
}
