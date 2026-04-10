package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair5194NoDifferenceTest {

    private final ClonePair5194 subject = new ClonePair5194();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Character) values[1]).charValue()), new Object[]{"a", '\0'}),
            capture(values -> subject.method2((String) values[0], ((Character) values[1]).charValue()), new Object[]{"a", '\0'})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Character) values[1]).charValue()), new Object[]{null, '\0'}),
            capture(values -> subject.method2((String) values[0], ((Character) values[1]).charValue()), new Object[]{null, '\0'})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Character) values[1]).charValue()), new Object[]{"a", 'a'}),
            capture(values -> subject.method2((String) values[0], ((Character) values[1]).charValue()), new Object[]{"a", 'a'})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Character) values[1]).charValue()), new Object[]{"a.b", '.'}),
            capture(values -> subject.method2((String) values[0], ((Character) values[1]).charValue()), new Object[]{"a.b", '.'})
        );
    }
}
