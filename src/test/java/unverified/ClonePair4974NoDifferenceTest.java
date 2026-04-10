package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair4974NoDifferenceTest {

    private final ClonePair4974 subject = new ClonePair4974();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((java.util.Properties) values[0], (String) values[1], ((Integer) values[2]).intValue()), new Object[]{props(), "", -1}),
            capture(values -> subject.method2((java.util.Properties) values[0], (String) values[1], ((Integer) values[2]).intValue()), new Object[]{props(), "", -1})
        );
        assertEquivalent(
            capture(values -> subject.method1((java.util.Properties) values[0], (String) values[1], ((Integer) values[2]).intValue()), new Object[]{null, "", -1}),
            capture(values -> subject.method2((java.util.Properties) values[0], (String) values[1], ((Integer) values[2]).intValue()), new Object[]{null, "", -1})
        );
    }
}
