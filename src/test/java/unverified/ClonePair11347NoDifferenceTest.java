package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair11347NoDifferenceTest {

    private final ClonePair11347 subject = new ClonePair11347();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((Integer) values[0], (Integer) values[1]), new Object[]{Integer.valueOf(-1), Integer.valueOf(1)}),
            capture(values -> subject.method2((Integer) values[0], (Integer) values[1]), new Object[]{Integer.valueOf(-1), Integer.valueOf(1)})
        );
        assertEquivalent(
            capture(values -> subject.method1((Integer) values[0], (Integer) values[1]), new Object[]{Integer.valueOf(1), Integer.valueOf(1)}),
            capture(values -> subject.method2((Integer) values[0], (Integer) values[1]), new Object[]{Integer.valueOf(1), Integer.valueOf(1)})
        );
        assertEquivalent(
            capture(values -> subject.method1((Integer) values[0], (Integer) values[1]), new Object[]{Integer.valueOf(2), Integer.valueOf(1)}),
            capture(values -> subject.method2((Integer) values[0], (Integer) values[1]), new Object[]{Integer.valueOf(2), Integer.valueOf(1)})
        );
    }
}
