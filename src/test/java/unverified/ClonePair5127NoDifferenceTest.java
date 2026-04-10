package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair5127NoDifferenceTest {

    private final ClonePair5127 subject = new ClonePair5127();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((char[]) values[0], ((Integer) values[1]).intValue(), (char[]) values[2]), new Object[]{new char[]{}, 1, new char[]{}}),
            capture(values -> subject.method2((char[]) values[0], ((Integer) values[1]).intValue(), (char[]) values[2]), new Object[]{new char[]{}, 1, new char[]{}})
        );
        assertEquivalent(
            capture(values -> subject.method1((char[]) values[0], ((Integer) values[1]).intValue(), (char[]) values[2]), new Object[]{null, 1, new char[]{}}),
            capture(values -> subject.method2((char[]) values[0], ((Integer) values[1]).intValue(), (char[]) values[2]), new Object[]{null, 1, new char[]{}})
        );
        assertEquivalent(
            capture(values -> subject.method1((char[]) values[0], ((Integer) values[1]).intValue(), (char[]) values[2]), new Object[]{new char[]{'a'}, 1, new char[]{}}),
            capture(values -> subject.method2((char[]) values[0], ((Integer) values[1]).intValue(), (char[]) values[2]), new Object[]{new char[]{'a'}, 1, new char[]{}})
        );
        assertEquivalent(
            capture(values -> subject.method1((char[]) values[0], ((Integer) values[1]).intValue(), (char[]) values[2]), new Object[]{new char[]{}, -1, new char[]{'a'}}),
            capture(values -> subject.method2((char[]) values[0], ((Integer) values[1]).intValue(), (char[]) values[2]), new Object[]{new char[]{}, -1, new char[]{'a'}})
        );
    }
}
