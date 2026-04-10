package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair9986NoDifferenceTest {

    private final ClonePair9986 subject = new ClonePair9986();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Character) values[1]).charValue()), new Object[]{"foo", '\0'}),
            capture(values -> subject.method2((String) values[0], ((Character) values[1]).charValue()), new Object[]{"foo", '\0'})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Character) values[1]).charValue()), new Object[]{null, '\0'}),
            capture(values -> subject.method2((String) values[0], ((Character) values[1]).charValue()), new Object[]{null, '\0'})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Character) values[1]).charValue()), new Object[]{"foo/bar", '\0'}),
            capture(values -> subject.method2((String) values[0], ((Character) values[1]).charValue()), new Object[]{"foo/bar", '\0'})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Character) values[1]).charValue()), new Object[]{"foo.bar", '\0'}),
            capture(values -> subject.method2((String) values[0], ((Character) values[1]).charValue()), new Object[]{"foo.bar", '\0'})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Character) values[1]).charValue()), new Object[]{"bar", '\0'}),
            capture(values -> subject.method2((String) values[0], ((Character) values[1]).charValue()), new Object[]{"bar", '\0'})
        );
    }
}
