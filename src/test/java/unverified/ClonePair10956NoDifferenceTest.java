package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair10956NoDifferenceTest {

    private final ClonePair10956 subject = new ClonePair10956();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((char[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{new char[]{}, -1, 1}),
            capture(values -> subject.method2((char[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{new char[]{}, -1, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((char[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{null, -1, 1}),
            capture(values -> subject.method2((char[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{null, -1, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((char[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{new char[]{}, -1, -1}),
            capture(values -> subject.method2((char[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{new char[]{}, -1, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1((char[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{new char[]{'a'}, 0, 1}),
            capture(values -> subject.method2((char[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{new char[]{'a'}, 0, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((char[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{new char[]{'a', '.'}, 0, 2}),
            capture(values -> subject.method2((char[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{new char[]{'a', '.'}, 0, 2})
        );
    }
}
