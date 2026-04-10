package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair4920NoDifferenceTest {

    private final ClonePair4920 subject = new ClonePair4920();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((Object[]) values[0], (Class) values[1]), new Object[]{new Object[]{}, String.class}),
            capture(values -> subject.method2((Object[]) values[0], (Class) values[1]), new Object[]{new Object[]{}, String.class})
        );
        assertEquivalent(
            capture(values -> subject.method1((Object[]) values[0], (Class) values[1]), new Object[]{null, String.class}),
            capture(values -> subject.method2((Object[]) values[0], (Class) values[1]), new Object[]{null, String.class})
        );
        assertEquivalent(
            capture(values -> subject.method1((Object[]) values[0], (Class) values[1]), new Object[]{new Object[]{null}, null}),
            capture(values -> subject.method2((Object[]) values[0], (Class) values[1]), new Object[]{new Object[]{null}, null})
        );
    }
}
