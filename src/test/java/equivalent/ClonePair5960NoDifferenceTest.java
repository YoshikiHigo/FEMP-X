package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair5960NoDifferenceTest {

    private final ClonePair5960 subject = new ClonePair5960();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((long[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (long[]) values[3], ((Integer) values[4]).intValue(), ((Integer) values[5]).intValue()), new Object[]{new long[]{}, 1, 1, new long[]{}, 1, 1}),
            capture(values -> subject.method2((long[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (long[]) values[3], ((Integer) values[4]).intValue(), ((Integer) values[5]).intValue()), new Object[]{new long[]{}, 1, 1, new long[]{}, 1, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((long[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (long[]) values[3], ((Integer) values[4]).intValue(), ((Integer) values[5]).intValue()), new Object[]{null, 1, 1, new long[]{}, 1, 1}),
            capture(values -> subject.method2((long[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (long[]) values[3], ((Integer) values[4]).intValue(), ((Integer) values[5]).intValue()), new Object[]{null, 1, 1, new long[]{}, 1, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((long[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (long[]) values[3], ((Integer) values[4]).intValue(), ((Integer) values[5]).intValue()), new Object[]{new long[]{}, 1, -1, new long[]{}, 1, 1}),
            capture(values -> subject.method2((long[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (long[]) values[3], ((Integer) values[4]).intValue(), ((Integer) values[5]).intValue()), new Object[]{new long[]{}, 1, -1, new long[]{}, 1, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((long[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (long[]) values[3], ((Integer) values[4]).intValue(), ((Integer) values[5]).intValue()), new Object[]{new long[]{}, 1, -1, new long[]{}, 1, -1}),
            capture(values -> subject.method2((long[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), (long[]) values[3], ((Integer) values[4]).intValue(), ((Integer) values[5]).intValue()), new Object[]{new long[]{}, 1, -1, new long[]{}, 1, -1})
        );
    }
}
