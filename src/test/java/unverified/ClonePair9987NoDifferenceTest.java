package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair9987NoDifferenceTest {

    private final ClonePair9987 subject = new ClonePair9987();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Character) values[1]).charValue()), new Object[]{"", '\0'}),
            capture(values -> subject.method2((String) values[0], ((Character) values[1]).charValue()), new Object[]{"", '\0'})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Character) values[1]).charValue()), new Object[]{null, '\0'}),
            capture(values -> subject.method2((String) values[0], ((Character) values[1]).charValue()), new Object[]{null, '\0'})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Character) values[1]).charValue()), new Object[]{"a", '\0'}),
            capture(values -> subject.method2((String) values[0], ((Character) values[1]).charValue()), new Object[]{"a", '\0'})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Character) values[1]).charValue()), new Object[]{"A", '\0'}),
            capture(values -> subject.method2((String) values[0], ((Character) values[1]).charValue()), new Object[]{"A", '\0'})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Character) values[1]).charValue()), new Object[]{"abc", '\0'}),
            capture(values -> subject.method2((String) values[0], ((Character) values[1]).charValue()), new Object[]{"abc", '\0'})
        );
    }
}
