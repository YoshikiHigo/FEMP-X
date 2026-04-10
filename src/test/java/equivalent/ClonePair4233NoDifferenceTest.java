package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair4233NoDifferenceTest {

    private final ClonePair4233 subject = new ClonePair4233();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0], (Object[]) values[1]), new Object[]{Integer.valueOf(7), new Object[]{}}),
            capture(values -> subject.method2((Object) values[0], (Object[]) values[1]), new Object[]{Integer.valueOf(7), new Object[]{}})
        );
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0], (Object[]) values[1]), new Object[]{null, new Object[]{null}}),
            capture(values -> subject.method2((Object) values[0], (Object[]) values[1]), new Object[]{null, new Object[]{null}})
        );
    }
}
