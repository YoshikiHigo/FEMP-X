package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair5294NoDifferenceTest {

    private final ClonePair5294 subject = new ClonePair5294();

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
            capture(values -> subject.method1((char[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new char[]{'a', '.'}, 1}),
            capture(values -> subject.method2((char[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new char[]{'a', '.'}, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((char[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new char[]{'A', 'B', 'C'}, 1}),
            capture(values -> subject.method2((char[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new char[]{'A', 'B', 'C'}, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((char[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new char[]{}, -1}),
            capture(values -> subject.method2((char[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new char[]{}, -1})
        );
    }
}
