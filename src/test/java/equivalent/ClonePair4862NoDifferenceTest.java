package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair4862NoDifferenceTest {

    private final ClonePair4862 subject = new ClonePair4862();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String[]) values[0], (java.util.Map) values[1]), new Object[]{new String[]{}, map()}),
            capture(values -> subject.method2((String[]) values[0], (java.util.Map) values[1]), new Object[]{new String[]{}, map()})
        );
        assertEquivalent(
            capture(values -> subject.method1((String[]) values[0], (java.util.Map) values[1]), new Object[]{null, map()}),
            capture(values -> subject.method2((String[]) values[0], (java.util.Map) values[1]), new Object[]{null, map()})
        );
    }
}
