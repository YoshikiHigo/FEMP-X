package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair7732NoDifferenceTest {

    private final ClonePair7732 subject = new ClonePair7732();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0], (Object) values[1]), new Object[]{date(0L), date(0L)}),
            capture(values -> subject.method2((Object) values[0], (Object) values[1]), new Object[]{date(0L), date(0L)})
        );
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0], (Object) values[1]), new Object[]{null, date(0L)}),
            capture(values -> subject.method2((Object) values[0], (Object) values[1]), new Object[]{null, date(0L)})
        );
    }
}
