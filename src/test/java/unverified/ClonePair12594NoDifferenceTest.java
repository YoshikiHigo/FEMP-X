package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair12594NoDifferenceTest {

    private final ClonePair12594 subject = new ClonePair12594();

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
            capture(values -> subject.method1((String) values[0], ((Character) values[1]).charValue()), new Object[]{"a.b", '\0'}),
            capture(values -> subject.method2((String) values[0], ((Character) values[1]).charValue()), new Object[]{"a.b", '\0'})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Character) values[1]).charValue()), new Object[]{"a.b.c", '\0'}),
            capture(values -> subject.method2((String) values[0], ((Character) values[1]).charValue()), new Object[]{"a.b.c", '\0'})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Character) values[1]).charValue()), new Object[]{"ab", '\0'}),
            capture(values -> subject.method2((String) values[0], ((Character) values[1]).charValue()), new Object[]{"ab", '\0'})
        );
    }
}
