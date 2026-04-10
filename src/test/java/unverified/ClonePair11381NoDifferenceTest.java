package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair11381NoDifferenceTest {

    private final ClonePair11381 subject = new ClonePair11381();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2], ((Integer) values[3]).intValue()), new Object[]{"foo", null, "foo", -1}),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2], ((Integer) values[3]).intValue()), new Object[]{"foo", null, "foo", -1})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2], ((Integer) values[3]).intValue()), new Object[]{null, null, "foo", -1}),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2], ((Integer) values[3]).intValue()), new Object[]{null, null, "foo", -1})
        );
    }
}
