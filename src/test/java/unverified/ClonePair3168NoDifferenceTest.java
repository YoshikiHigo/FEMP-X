package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair3168NoDifferenceTest {

    private final ClonePair3168 subject = new ClonePair3168();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0]), new Object[]{Integer.valueOf(-1)}),
            capture(values -> subject.method2((Object) values[0]), new Object[]{Integer.valueOf(-1)})
        );
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0]), new Object[]{null}),
            capture(values -> subject.method2((Object) values[0]), new Object[]{null})
        );
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0]), new Object[]{Integer.valueOf(0)}),
            capture(values -> subject.method2((Object) values[0]), new Object[]{Integer.valueOf(0)})
        );
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0]), new Object[]{Integer.valueOf(1)}),
            capture(values -> subject.method2((Object) values[0]), new Object[]{Integer.valueOf(1)})
        );
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0]), new Object[]{Double.valueOf(-2.0)}),
            capture(values -> subject.method2((Object) values[0]), new Object[]{Double.valueOf(-2.0)})
        );
    }
}
