package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair3073NoDifferenceTest {

    private final ClonePair3073 subject = new ClonePair3073();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Character) values[1]).charValue(), ((Character) values[2]).charValue()), new Object[]{"a", '\0', '\0'}),
            capture(values -> subject.method2((String) values[0], ((Character) values[1]).charValue(), ((Character) values[2]).charValue()), new Object[]{"a", '\0', '\0'})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Character) values[1]).charValue(), ((Character) values[2]).charValue()), new Object[]{"a", 'a', '\0'}),
            capture(values -> subject.method2((String) values[0], ((Character) values[1]).charValue(), ((Character) values[2]).charValue()), new Object[]{"a", 'a', '\0'})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Character) values[1]).charValue(), ((Character) values[2]).charValue()), new Object[]{"a.b", '\0', '.'}),
            capture(values -> subject.method2((String) values[0], ((Character) values[1]).charValue(), ((Character) values[2]).charValue()), new Object[]{"a.b", '\0', '.'})
        );
    }
}
