package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair3667NoDifferenceTest {

    private final ClonePair3667 subject = new ClonePair3667();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue(), ((Character) values[2]).charValue(), ((Boolean) values[3]).booleanValue()), new Object[]{"", 1, '\0', false}),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue(), ((Character) values[2]).charValue(), ((Boolean) values[3]).booleanValue()), new Object[]{"", 1, '\0', false})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue(), ((Character) values[2]).charValue(), ((Boolean) values[3]).booleanValue()), new Object[]{null, 1, '\0', false}),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue(), ((Character) values[2]).charValue(), ((Boolean) values[3]).booleanValue()), new Object[]{null, 1, '\0', false})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue(), ((Character) values[2]).charValue(), ((Boolean) values[3]).booleanValue()), new Object[]{"a", 1, '\0', false}),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue(), ((Character) values[2]).charValue(), ((Boolean) values[3]).booleanValue()), new Object[]{"a", 1, '\0', false})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue(), ((Character) values[2]).charValue(), ((Boolean) values[3]).booleanValue()), new Object[]{"A", 1, '\0', false}),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue(), ((Character) values[2]).charValue(), ((Boolean) values[3]).booleanValue()), new Object[]{"A", 1, '\0', false})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue(), ((Character) values[2]).charValue(), ((Boolean) values[3]).booleanValue()), new Object[]{"", -1, '\0', false}),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue(), ((Character) values[2]).charValue(), ((Boolean) values[3]).booleanValue()), new Object[]{"", -1, '\0', false})
        );
    }
}
