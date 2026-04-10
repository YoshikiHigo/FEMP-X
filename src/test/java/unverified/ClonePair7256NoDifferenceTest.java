package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair7256NoDifferenceTest {

    private final ClonePair7256 subject = new ClonePair7256();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((CharSequence) values[0], ((Character) values[1]).charValue()), new Object[]{"", '\0'}),
            capture(values -> subject.method2((CharSequence) values[0], ((Character) values[1]).charValue()), new Object[]{"", '\0'})
        );
        assertEquivalent(
            capture(values -> subject.method1((CharSequence) values[0], ((Character) values[1]).charValue()), new Object[]{null, '\0'}),
            capture(values -> subject.method2((CharSequence) values[0], ((Character) values[1]).charValue()), new Object[]{null, '\0'})
        );
        assertEquivalent(
            capture(values -> subject.method1((CharSequence) values[0], ((Character) values[1]).charValue()), new Object[]{"a", 'a'}),
            capture(values -> subject.method2((CharSequence) values[0], ((Character) values[1]).charValue()), new Object[]{"a", 'a'})
        );
        assertEquivalent(
            capture(values -> subject.method1((CharSequence) values[0], ((Character) values[1]).charValue()), new Object[]{"a.b.c", '.'}),
            capture(values -> subject.method2((CharSequence) values[0], ((Character) values[1]).charValue()), new Object[]{"a.b.c", '.'})
        );
    }
}
