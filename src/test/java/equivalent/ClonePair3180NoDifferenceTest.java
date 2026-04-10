package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair3180NoDifferenceTest {

    private final ClonePair3180 subject = new ClonePair3180();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((java.util.Map) values[0]), new Object[]{map()}),
            capture(values -> subject.method2((java.util.Map) values[0]), new Object[]{map()})
        );
        assertEquivalent(
            capture(values -> subject.method1((java.util.Map) values[0]), new Object[]{null}),
            capture(values -> subject.method2((java.util.Map) values[0]), new Object[]{null})
        );
    }
}
