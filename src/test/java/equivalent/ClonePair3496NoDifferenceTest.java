package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair3496NoDifferenceTest {

    private final ClonePair3496 subject = new ClonePair3496();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String[]) values[0], (String) values[1], ((Boolean) values[2]).booleanValue()), new Object[]{new String[]{}, "", false}),
            capture(values -> subject.method2((String[]) values[0], (String) values[1], ((Boolean) values[2]).booleanValue()), new Object[]{new String[]{}, "", false})
        );
        assertEquivalent(
            capture(values -> subject.method1((String[]) values[0], (String) values[1], ((Boolean) values[2]).booleanValue()), new Object[]{null, "", false}),
            capture(values -> subject.method2((String[]) values[0], (String) values[1], ((Boolean) values[2]).booleanValue()), new Object[]{null, "", false})
        );
    }
}
