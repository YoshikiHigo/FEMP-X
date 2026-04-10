package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair12531NoDifferenceTest {

    private final ClonePair12531 subject = new ClonePair12531();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Character) values[1]).charValue(), ((Integer) values[2]).intValue()), new Object[]{"a", '\0', -1}),
            capture(values -> subject.method2((String) values[0], ((Character) values[1]).charValue(), ((Integer) values[2]).intValue()), new Object[]{"a", '\0', -1})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Character) values[1]).charValue(), ((Integer) values[2]).intValue()), new Object[]{null, '\0', -1}),
            capture(values -> subject.method2((String) values[0], ((Character) values[1]).charValue(), ((Integer) values[2]).intValue()), new Object[]{null, '\0', -1})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Character) values[1]).charValue(), ((Integer) values[2]).intValue()), new Object[]{"a", '\0', 0}),
            capture(values -> subject.method2((String) values[0], ((Character) values[1]).charValue(), ((Integer) values[2]).intValue()), new Object[]{"a", '\0', 0})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Character) values[1]).charValue(), ((Integer) values[2]).intValue()), new Object[]{"a", 'a', 0}),
            capture(values -> subject.method2((String) values[0], ((Character) values[1]).charValue(), ((Integer) values[2]).intValue()), new Object[]{"a", 'a', 0})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Character) values[1]).charValue(), ((Integer) values[2]).intValue()), new Object[]{"a.b", '.', 0}),
            capture(values -> subject.method2((String) values[0], ((Character) values[1]).charValue(), ((Integer) values[2]).intValue()), new Object[]{"a.b", '.', 0})
        );
    }
}
