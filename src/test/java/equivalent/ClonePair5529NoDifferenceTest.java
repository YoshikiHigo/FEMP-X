package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair5529NoDifferenceTest {

    private final ClonePair5529 subject = new ClonePair5529();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue(), (int[]) values[1]), new Object[]{1, new int[]{}}),
            capture(values -> subject.method2(((Integer) values[0]).intValue(), (int[]) values[1]), new Object[]{1, new int[]{}})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue(), (int[]) values[1]), new Object[]{-1, new int[]{}}),
            capture(values -> subject.method2(((Integer) values[0]).intValue(), (int[]) values[1]), new Object[]{-1, new int[]{}})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue(), (int[]) values[1]), new Object[]{1, null}),
            capture(values -> subject.method2(((Integer) values[0]).intValue(), (int[]) values[1]), new Object[]{1, null})
        );
    }
}
