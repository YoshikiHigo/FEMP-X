package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair7090NoDifferenceTest {

    private final ClonePair7090 subject = new ClonePair7090();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{list(), ""};
        assertEquivalent(
            capture(values -> subject.method1((java.util.List) values[0], (String) values[1]), caseInputs0),
            capture(values -> subject.method2((java.util.List) values[0], (String) values[1]), caseInputs0)
        );
    }
}
