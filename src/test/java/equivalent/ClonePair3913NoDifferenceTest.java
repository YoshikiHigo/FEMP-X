package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair3913NoDifferenceTest {

    private final ClonePair3913 subject = new ClonePair3913();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((java.util.Properties) values[0], (String) values[1], ((Double) values[2]).doubleValue()), new Object[]{props(), " ", -1.0}),
            capture(values -> subject.method2((java.util.Properties) values[0], (String) values[1], ((Double) values[2]).doubleValue()), new Object[]{props(), " ", -1.0})
        );
        assertEquivalent(
            capture(values -> subject.method1((java.util.Properties) values[0], (String) values[1], ((Double) values[2]).doubleValue()), new Object[]{null, " ", -1.0}),
            capture(values -> subject.method2((java.util.Properties) values[0], (String) values[1], ((Double) values[2]).doubleValue()), new Object[]{null, " ", -1.0})
        );
    }
}
