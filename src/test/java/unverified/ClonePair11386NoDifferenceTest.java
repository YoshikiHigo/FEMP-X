package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair11386NoDifferenceTest {

    private final ClonePair11386 subject = new ClonePair11386();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2], ((Integer) values[3]).intValue()), new Object[]{"foo", "foo", null, -1}),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2], ((Integer) values[3]).intValue()), new Object[]{"foo", "foo", null, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2], ((Integer) values[3]).intValue()), new Object[]{null, "foo", null, -1}),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2], ((Integer) values[3]).intValue()), new Object[]{null, "foo", null, -1})
        );
    }
}
