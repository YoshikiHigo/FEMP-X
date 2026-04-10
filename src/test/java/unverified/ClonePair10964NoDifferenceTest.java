package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair10964NoDifferenceTest {

    private final ClonePair10964 subject = new ClonePair10964();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((java.util.Properties) values[0], (String) values[1], (Double) values[2]), new Object[]{props(), " ", Double.valueOf(-1.0)}),
            capture(values -> subject.method2((java.util.Properties) values[0], (String) values[1], (Double) values[2]), new Object[]{props(), " ", Double.valueOf(-1.0)})
        );
        assertEquivalent(
            capture(values -> subject.method1((java.util.Properties) values[0], (String) values[1], (Double) values[2]), new Object[]{null, " ", Double.valueOf(-1.0)}),
            capture(values -> subject.method2((java.util.Properties) values[0], (String) values[1], (Double) values[2]), new Object[]{null, " ", Double.valueOf(-1.0)})
        );
    }
}
