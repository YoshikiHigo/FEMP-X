package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair10271NoDifferenceTest {

    private final ClonePair10271 subject = new ClonePair10271();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), new Object[]{"a"}),
            capture(values -> subject.method2((String) values[0]), new Object[]{"a"})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), new Object[]{null}),
            capture(values -> subject.method2((String) values[0]), new Object[]{null})
        );
    }
}
