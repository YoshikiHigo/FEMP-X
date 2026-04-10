package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair3866NoDifferenceTest {

    private final ClonePair3866 subject = new ClonePair3866();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Double) values[2]).doubleValue()), new Object[]{"a", "a", -1.0}),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Double) values[2]).doubleValue()), new Object[]{"a", "a", -1.0})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Double) values[2]).doubleValue()), new Object[]{null, "a", -1.0}),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Double) values[2]).doubleValue()), new Object[]{null, "a", -1.0})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Double) values[2]).doubleValue()), new Object[]{"a", "a", 0.0}),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Double) values[2]).doubleValue()), new Object[]{"a", "a", 0.0})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Double) values[2]).doubleValue()), new Object[]{"a", "a", 0.5}),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Double) values[2]).doubleValue()), new Object[]{"a", "a", 0.5})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Double) values[2]).doubleValue()), new Object[]{"a", "a", 1.0}),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Double) values[2]).doubleValue()), new Object[]{"a", "a", 1.0})
        );
    }
}
