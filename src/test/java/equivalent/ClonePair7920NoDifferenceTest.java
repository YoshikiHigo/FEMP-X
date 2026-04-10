package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair7920NoDifferenceTest {

    private final ClonePair7920 subject = new ClonePair7920();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{"", 1, -1, false, false, "", list()};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), ((Boolean) values[3]).booleanValue(), ((Boolean) values[4]).booleanValue(), (String) values[5], (java.util.ArrayList) values[6]), caseInputs0),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), ((Boolean) values[3]).booleanValue(), ((Boolean) values[4]).booleanValue(), (String) values[5], (java.util.ArrayList) values[6]), caseInputs0)
        );
    }
}
