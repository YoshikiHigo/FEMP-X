package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair3810NoDifferenceTest {

    private final ClonePair3810 subject = new ClonePair3810();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((char[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (char[]) values[3]), new Object[]{new char[]{}, 1, 1, new char[]{}}),
            capture(values -> subject.method2((char[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (char[]) values[3]), new Object[]{new char[]{}, 1, 1, new char[]{}})
        );
        assertEquivalent(
            capture(values -> subject.method1((char[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (char[]) values[3]), new Object[]{null, 1, 1, new char[]{}}),
            capture(values -> subject.method2((char[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (char[]) values[3]), new Object[]{null, 1, 1, new char[]{}})
        );
        assertEquivalent(
            capture(values -> subject.method1((char[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (char[]) values[3]), new Object[]{new char[]{}, 1, -1, new char[]{}}),
            capture(values -> subject.method2((char[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (char[]) values[3]), new Object[]{new char[]{}, 1, -1, new char[]{}})
        );
    }
}
