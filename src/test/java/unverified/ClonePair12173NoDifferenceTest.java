package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair12173NoDifferenceTest {

    private final ClonePair12173 subject = new ClonePair12173();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue(), ((Character) values[2]).charValue()), new Object[]{"a", -1, '\0'}),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue(), ((Character) values[2]).charValue()), new Object[]{"a", -1, '\0'})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue(), ((Character) values[2]).charValue()), new Object[]{null, -1, '\0'}),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue(), ((Character) values[2]).charValue()), new Object[]{null, -1, '\0'})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue(), ((Character) values[2]).charValue()), new Object[]{"a", 0, '\0'}),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue(), ((Character) values[2]).charValue()), new Object[]{"a", 0, '\0'})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue(), ((Character) values[2]).charValue()), new Object[]{"a", 0, 'a'}),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue(), ((Character) values[2]).charValue()), new Object[]{"a", 0, 'a'})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue(), ((Character) values[2]).charValue()), new Object[]{"a.b", 0, '.'}),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue(), ((Character) values[2]).charValue()), new Object[]{"a.b", 0, '.'})
        );
    }
}
