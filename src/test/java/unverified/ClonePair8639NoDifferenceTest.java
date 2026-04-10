package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair8639NoDifferenceTest {

    private final ClonePair8639 subject = new ClonePair8639();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((char[]) values[0], ((Integer) values[1]).intValue(), ((Character) values[2]).charValue()), new Object[]{new char[]{}, -1, '\0'}),
            capture(values -> subject.method2((char[]) values[0], ((Integer) values[1]).intValue(), ((Character) values[2]).charValue()), new Object[]{new char[]{}, -1, '\0'})
        );
        assertEquivalent(
            capture(values -> subject.method1((char[]) values[0], ((Integer) values[1]).intValue(), ((Character) values[2]).charValue()), new Object[]{null, -1, '\0'}),
            capture(values -> subject.method2((char[]) values[0], ((Integer) values[1]).intValue(), ((Character) values[2]).charValue()), new Object[]{null, -1, '\0'})
        );
        assertEquivalent(
            capture(values -> subject.method1((char[]) values[0], ((Integer) values[1]).intValue(), ((Character) values[2]).charValue()), new Object[]{new char[]{}, 0, '\0'}),
            capture(values -> subject.method2((char[]) values[0], ((Integer) values[1]).intValue(), ((Character) values[2]).charValue()), new Object[]{new char[]{}, 0, '\0'})
        );
        assertEquivalent(
            capture(values -> subject.method1((char[]) values[0], ((Integer) values[1]).intValue(), ((Character) values[2]).charValue()), new Object[]{new char[]{'a'}, 0, 'a'}),
            capture(values -> subject.method2((char[]) values[0], ((Integer) values[1]).intValue(), ((Character) values[2]).charValue()), new Object[]{new char[]{'a'}, 0, 'a'})
        );
        assertEquivalent(
            capture(values -> subject.method1((char[]) values[0], ((Integer) values[1]).intValue(), ((Character) values[2]).charValue()), new Object[]{new char[]{'a', '.'}, 0, '.'}),
            capture(values -> subject.method2((char[]) values[0], ((Integer) values[1]).intValue(), ((Character) values[2]).charValue()), new Object[]{new char[]{'a', '.'}, 0, '.'})
        );
    }
}
