package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair7298NoDifferenceTest {

    private final ClonePair7298 subject = new ClonePair7298();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{Integer.valueOf(7), Integer.valueOf(7)};
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0], (Object) values[1]), caseInputs0),
            capture(values -> subject.method2((Object) values[0], (Object) values[1]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, Integer.valueOf(7)};
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0], (Object) values[1]), caseInputs1),
            capture(values -> subject.method2((Object) values[0], (Object) values[1]), caseInputs1)
        );
    }
}
