package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair4830NoDifferenceTest {

    private final ClonePair4830 subject = new ClonePair4830();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0], (Object) values[1], ((Boolean) values[2]).booleanValue()), new Object[]{Integer.valueOf(7), Integer.valueOf(7), false}),
            capture(values -> subject.method2((Object) values[0], (Object) values[1], ((Boolean) values[2]).booleanValue()), new Object[]{Integer.valueOf(7), Integer.valueOf(7), false})
        );
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0], (Object) values[1], ((Boolean) values[2]).booleanValue()), new Object[]{null, Integer.valueOf(7), false}),
            capture(values -> subject.method2((Object) values[0], (Object) values[1], ((Boolean) values[2]).booleanValue()), new Object[]{null, Integer.valueOf(7), false})
        );
    }
}
