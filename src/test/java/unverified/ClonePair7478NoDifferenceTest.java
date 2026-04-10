package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair7478NoDifferenceTest {

    private final ClonePair7478 subject = new ClonePair7478();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0], (Object) values[1]), new Object[]{Integer.valueOf(-1), Integer.valueOf(-1)}),
            capture(values -> subject.method2((Object) values[0], (Object) values[1]), new Object[]{Integer.valueOf(-1), Integer.valueOf(-1)})
        );
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0], (Object) values[1]), new Object[]{null, Integer.valueOf(-1)}),
            capture(values -> subject.method2((Object) values[0], (Object) values[1]), new Object[]{null, Integer.valueOf(-1)})
        );
    }
}
