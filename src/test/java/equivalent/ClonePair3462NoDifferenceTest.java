package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair3462NoDifferenceTest {

    private final ClonePair3462 subject = new ClonePair3462();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Character) values[1]).charValue(), ((Integer) values[2]).intValue(), ((Boolean) values[3]).booleanValue()), new Object[]{"foo", '\0', -1, false}),
            capture(values -> subject.method2((String) values[0], ((Character) values[1]).charValue(), ((Integer) values[2]).intValue(), ((Boolean) values[3]).booleanValue()), new Object[]{"foo", '\0', -1, false})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Character) values[1]).charValue(), ((Integer) values[2]).intValue(), ((Boolean) values[3]).booleanValue()), new Object[]{null, '\0', -1, false}),
            capture(values -> subject.method2((String) values[0], ((Character) values[1]).charValue(), ((Integer) values[2]).intValue(), ((Boolean) values[3]).booleanValue()), new Object[]{null, '\0', -1, false})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Character) values[1]).charValue(), ((Integer) values[2]).intValue(), ((Boolean) values[3]).booleanValue()), new Object[]{"foo", 'a', -1, false}),
            capture(values -> subject.method2((String) values[0], ((Character) values[1]).charValue(), ((Integer) values[2]).intValue(), ((Boolean) values[3]).booleanValue()), new Object[]{"foo", 'a', -1, false})
        );
    }
}
