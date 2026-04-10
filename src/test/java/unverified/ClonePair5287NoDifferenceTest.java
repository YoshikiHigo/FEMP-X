package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair5287NoDifferenceTest {

    private final ClonePair5287 subject = new ClonePair5287();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((char[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new char[]{}, 1}),
            capture(values -> subject.method2((char[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new char[]{}, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((char[]) values[0], ((Integer) values[1]).intValue()), new Object[]{null, 1}),
            capture(values -> subject.method2((char[]) values[0], ((Integer) values[1]).intValue()), new Object[]{null, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((char[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new char[]{}, -1}),
            capture(values -> subject.method2((char[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new char[]{}, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1((char[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new char[]{}, 0}),
            capture(values -> subject.method2((char[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new char[]{}, 0})
        );
        assertEquivalent(
            capture(values -> subject.method1((char[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new char[]{}, 2}),
            capture(values -> subject.method2((char[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new char[]{}, 2})
        );
    }
}
