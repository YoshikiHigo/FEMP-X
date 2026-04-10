package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair7084NoDifferenceTest {

    private final ClonePair7084 subject = new ClonePair7084();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0]), new Object[]{Float.valueOf(-1.0f)}),
            capture(values -> subject.method2((Object) values[0]), new Object[]{Float.valueOf(-1.0f)})
        );
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0]), new Object[]{null}),
            capture(values -> subject.method2((Object) values[0]), new Object[]{null})
        );
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0]), new Object[]{Float.valueOf(0.0f)}),
            capture(values -> subject.method2((Object) values[0]), new Object[]{Float.valueOf(0.0f)})
        );
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0]), new Object[]{Float.valueOf(1.0f)}),
            capture(values -> subject.method2((Object) values[0]), new Object[]{Float.valueOf(1.0f)})
        );
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0]), new Object[]{Float.valueOf(1.5f)}),
            capture(values -> subject.method2((Object) values[0]), new Object[]{Float.valueOf(1.5f)})
        );
    }
}
