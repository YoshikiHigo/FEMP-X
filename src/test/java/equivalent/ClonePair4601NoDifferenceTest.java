package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair4601NoDifferenceTest {

    private final ClonePair4601 subject = new ClonePair4601();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0], (Object[]) values[1], ((Boolean) values[2]).booleanValue()), new Object[]{Integer.valueOf(7), new Object[]{}, false}),
            capture(values -> subject.method2((Object) values[0], (Object[]) values[1], ((Boolean) values[2]).booleanValue()), new Object[]{Integer.valueOf(7), new Object[]{}, false})
        );
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0], (Object[]) values[1], ((Boolean) values[2]).booleanValue()), new Object[]{Integer.valueOf(7), null, false}),
            capture(values -> subject.method2((Object) values[0], (Object[]) values[1], ((Boolean) values[2]).booleanValue()), new Object[]{Integer.valueOf(7), null, false})
        );
    }
}
