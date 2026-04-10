package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair4750NoDifferenceTest {

    private final ClonePair4750 subject = new ClonePair4750();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Character) values[1]).charValue(), ((Integer) values[2]).intValue()), new Object[]{"a", '\0', 1}),
            capture(values -> subject.method2((String) values[0], ((Character) values[1]).charValue(), ((Integer) values[2]).intValue()), new Object[]{"a", '\0', 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Character) values[1]).charValue(), ((Integer) values[2]).intValue()), new Object[]{null, '\0', 1}),
            capture(values -> subject.method2((String) values[0], ((Character) values[1]).charValue(), ((Integer) values[2]).intValue()), new Object[]{null, '\0', 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Character) values[1]).charValue(), ((Integer) values[2]).intValue()), new Object[]{"A", '\0', 1}),
            capture(values -> subject.method2((String) values[0], ((Character) values[1]).charValue(), ((Integer) values[2]).intValue()), new Object[]{"A", '\0', 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Character) values[1]).charValue(), ((Integer) values[2]).intValue()), new Object[]{"a", '\0', 2}),
            capture(values -> subject.method2((String) values[0], ((Character) values[1]).charValue(), ((Integer) values[2]).intValue()), new Object[]{"a", '\0', 2})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Character) values[1]).charValue(), ((Integer) values[2]).intValue()), new Object[]{"a", 'a', 2}),
            capture(values -> subject.method2((String) values[0], ((Character) values[1]).charValue(), ((Integer) values[2]).intValue()), new Object[]{"a", 'a', 2})
        );
    }
}
