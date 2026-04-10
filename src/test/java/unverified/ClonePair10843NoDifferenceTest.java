package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair10843NoDifferenceTest {

    private final ClonePair10843 subject = new ClonePair10843();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue(), ((Integer) values[5]).intValue(), ((Integer) values[6]).intValue(), ((Integer) values[7]).intValue()), new Object[]{-1, -1, -1, -1, -1, -1, -1, -1}),
            capture(values -> subject.method2(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue(), ((Integer) values[5]).intValue(), ((Integer) values[6]).intValue(), ((Integer) values[7]).intValue()), new Object[]{-1, -1, -1, -1, -1, -1, -1, -1})
        );
    }
}
