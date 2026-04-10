package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair3760NoDifferenceTest {

    private final ClonePair3760 subject = new ClonePair3760();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((java.util.Map) values[0], (String) values[1]), new Object[]{map(), ""}),
            capture(values -> subject.method2((java.util.Map) values[0], (String) values[1]), new Object[]{map(), ""})
        );
        assertEquivalent(
            capture(values -> subject.method1((java.util.Map) values[0], (String) values[1]), new Object[]{null, ""}),
            capture(values -> subject.method2((java.util.Map) values[0], (String) values[1]), new Object[]{null, ""})
        );
    }
}
