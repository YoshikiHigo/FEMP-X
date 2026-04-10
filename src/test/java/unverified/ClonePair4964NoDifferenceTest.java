package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair4964NoDifferenceTest {

    private final ClonePair4964 subject = new ClonePair4964();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue()), new Object[]{-1}),
            capture(values -> subject.method2(((Integer) values[0]).intValue()), new Object[]{-1})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue()), new Object[]{0}),
            capture(values -> subject.method2(((Integer) values[0]).intValue()), new Object[]{0})
        );
    }
}
