package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair7341NoDifferenceTest {

    private final ClonePair7341 subject = new ClonePair7341();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0], (Object) values[1]), new Object[]{Integer.valueOf(7), Integer.valueOf(7)}),
            capture(values -> subject.method2((Object) values[0], (Object) values[1]), new Object[]{Integer.valueOf(7), Integer.valueOf(7)})
        );
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0], (Object) values[1]), new Object[]{null, Integer.valueOf(7)}),
            capture(values -> subject.method2((Object) values[0], (Object) values[1]), new Object[]{null, Integer.valueOf(7)})
        );
    }
}
