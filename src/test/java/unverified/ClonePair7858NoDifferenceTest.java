package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair7858NoDifferenceTest {

    private final ClonePair7858 subject = new ClonePair7858();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((char[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), ((Character) values[3]).charValue()), new Object[]{new char[]{}, 1, 1, '\0'}),
            capture(values -> subject.method2((char[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), ((Character) values[3]).charValue()), new Object[]{new char[]{}, 1, 1, '\0'})
        );
        assertEquivalent(
            capture(values -> subject.method1((char[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), ((Character) values[3]).charValue()), new Object[]{new char[]{}, -1, 1, '\0'}),
            capture(values -> subject.method2((char[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), ((Character) values[3]).charValue()), new Object[]{new char[]{}, -1, 1, '\0'})
        );
        assertEquivalent(
            capture(values -> subject.method1((char[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), ((Character) values[3]).charValue()), new Object[]{null, -1, 1, '\0'}),
            capture(values -> subject.method2((char[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), ((Character) values[3]).charValue()), new Object[]{null, -1, 1, '\0'})
        );
    }
}
