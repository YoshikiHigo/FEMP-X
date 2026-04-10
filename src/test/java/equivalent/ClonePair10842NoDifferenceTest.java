package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair10842NoDifferenceTest {

    private final ClonePair10842 subject = new ClonePair10842();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{1, 1, -1, -1, -1, -1, 1, 1};
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue(), ((Integer) values[5]).intValue(), ((Integer) values[6]).intValue(), ((Integer) values[7]).intValue()), caseInputs0),
            capture(values -> subject.method2(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue(), ((Integer) values[5]).intValue(), ((Integer) values[6]).intValue(), ((Integer) values[7]).intValue()), caseInputs0)
        );
    }
}
