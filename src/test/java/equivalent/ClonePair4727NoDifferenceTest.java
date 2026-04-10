package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair4727NoDifferenceTest {

    private final ClonePair4727 subject = new ClonePair4727();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (char[]) values[3], ((Integer) values[4]).intValue()), new Object[]{new int[]{}, -1, 1, new char[]{}, 1}),
            capture(values -> subject.method2((int[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (char[]) values[3], ((Integer) values[4]).intValue()), new Object[]{new int[]{}, -1, 1, new char[]{}, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (char[]) values[3], ((Integer) values[4]).intValue()), new Object[]{new int[]{}, 2, 1, new char[]{}, 1}),
            capture(values -> subject.method2((int[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (char[]) values[3], ((Integer) values[4]).intValue()), new Object[]{new int[]{}, 2, 1, new char[]{}, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (char[]) values[3], ((Integer) values[4]).intValue()), new Object[]{new int[]{}, -1, 1, null, 1}),
            capture(values -> subject.method2((int[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (char[]) values[3], ((Integer) values[4]).intValue()), new Object[]{new int[]{}, -1, 1, null, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (char[]) values[3], ((Integer) values[4]).intValue()), new Object[]{new int[]{}, 0, 1, new char[]{}, -1}),
            capture(values -> subject.method2((int[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (char[]) values[3], ((Integer) values[4]).intValue()), new Object[]{new int[]{}, 0, 1, new char[]{}, -1})
        );
    }
}
