package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair2723NoDifferenceTest {

    private final ClonePair2723 subject = new ClonePair2723();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Character) values[2]).charValue()), new Object[]{"a", "", '\0'}),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Character) values[2]).charValue()), new Object[]{"a", "", '\0'})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Character) values[2]).charValue()), new Object[]{"a", null, '\0'}),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Character) values[2]).charValue()), new Object[]{"a", null, '\0'})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Character) values[2]).charValue()), new Object[]{"a", "a", '\0'}),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Character) values[2]).charValue()), new Object[]{"a", "a", '\0'})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Character) values[2]).charValue()), new Object[]{"a", "a.b", '\0'}),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Character) values[2]).charValue()), new Object[]{"a", "a.b", '\0'})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Character) values[2]).charValue()), new Object[]{null, "a", '\0'}),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Character) values[2]).charValue()), new Object[]{null, "a", '\0'})
        );
    }
}
