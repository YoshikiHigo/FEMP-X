package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair5917NoDifferenceTest {

    private final ClonePair5917 subject = new ClonePair5917();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue(), (long[][]) values[1]), new Object[]{-1, new long[][]{}}),
            capture(values -> subject.method2(((Integer) values[0]).intValue(), (long[][]) values[1]), new Object[]{-1, new long[][]{}})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue(), (long[][]) values[1]), new Object[]{-1, null}),
            capture(values -> subject.method2(((Integer) values[0]).intValue(), (long[][]) values[1]), new Object[]{-1, null})
        );
    }
}
