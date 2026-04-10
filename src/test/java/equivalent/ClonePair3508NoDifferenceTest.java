package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair3508NoDifferenceTest {

    private final ClonePair3508 subject = new ClonePair3508();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue(), (int[]) values[1], ((Integer) values[2]).intValue()), new Object[]{-1, new int[]{}, 1}),
            capture(values -> subject.method2(((Integer) values[0]).intValue(), (int[]) values[1], ((Integer) values[2]).intValue()), new Object[]{-1, new int[]{}, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue(), (int[]) values[1], ((Integer) values[2]).intValue()), new Object[]{-1, null, 1}),
            capture(values -> subject.method2(((Integer) values[0]).intValue(), (int[]) values[1], ((Integer) values[2]).intValue()), new Object[]{-1, null, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue(), (int[]) values[1], ((Integer) values[2]).intValue()), new Object[]{-1, new int[]{0}, 1}),
            capture(values -> subject.method2(((Integer) values[0]).intValue(), (int[]) values[1], ((Integer) values[2]).intValue()), new Object[]{-1, new int[]{0}, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue(), (int[]) values[1], ((Integer) values[2]).intValue()), new Object[]{-1, new int[]{}, -1}),
            capture(values -> subject.method2(((Integer) values[0]).intValue(), (int[]) values[1], ((Integer) values[2]).intValue()), new Object[]{-1, new int[]{}, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue(), (int[]) values[1], ((Integer) values[2]).intValue()), new Object[]{1, new int[]{0}, 1}),
            capture(values -> subject.method2(((Integer) values[0]).intValue(), (int[]) values[1], ((Integer) values[2]).intValue()), new Object[]{1, new int[]{0}, 1})
        );
    }
}
