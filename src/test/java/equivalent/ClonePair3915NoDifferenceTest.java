package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair3915NoDifferenceTest {

    private final ClonePair3915 subject = new ClonePair3915();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((CharSequence) values[0], ((Character) values[1]).charValue(), ((Integer) values[2]).intValue()), new Object[]{"", '\0', -1}),
            capture(values -> subject.method2((CharSequence) values[0], ((Character) values[1]).charValue(), ((Integer) values[2]).intValue()), new Object[]{"", '\0', -1})
        );
        assertEquivalent(
            capture(values -> subject.method1((CharSequence) values[0], ((Character) values[1]).charValue(), ((Integer) values[2]).intValue()), new Object[]{null, '\0', -1}),
            capture(values -> subject.method2((CharSequence) values[0], ((Character) values[1]).charValue(), ((Integer) values[2]).intValue()), new Object[]{null, '\0', -1})
        );
        assertEquivalent(
            capture(values -> subject.method1((CharSequence) values[0], ((Character) values[1]).charValue(), ((Integer) values[2]).intValue()), new Object[]{"", '\0', 0}),
            capture(values -> subject.method2((CharSequence) values[0], ((Character) values[1]).charValue(), ((Integer) values[2]).intValue()), new Object[]{"", '\0', 0})
        );
        assertEquivalent(
            capture(values -> subject.method1((CharSequence) values[0], ((Character) values[1]).charValue(), ((Integer) values[2]).intValue()), new Object[]{"a", 'a', 0}),
            capture(values -> subject.method2((CharSequence) values[0], ((Character) values[1]).charValue(), ((Integer) values[2]).intValue()), new Object[]{"a", 'a', 0})
        );
        assertEquivalent(
            capture(values -> subject.method1((CharSequence) values[0], ((Character) values[1]).charValue(), ((Integer) values[2]).intValue()), new Object[]{"a.b", '.', 0}),
            capture(values -> subject.method2((CharSequence) values[0], ((Character) values[1]).charValue(), ((Integer) values[2]).intValue()), new Object[]{"a.b", '.', 0})
        );
    }
}
