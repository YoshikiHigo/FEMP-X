package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair7661NoDifferenceTest {

    private final ClonePair7661 subject = new ClonePair7661();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{""};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), caseInputs0),
            capture(values -> subject.method2((String) values[0]), caseInputs0)
        );
    }
}
