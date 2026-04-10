package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair3131NoDifferenceTest {

    private final ClonePair3131 subject = new ClonePair3131();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (Integer) values[2]), new Object[]{"", "", Integer.valueOf(1)}),
            capture(values -> subject.method2((String) values[0], (String) values[1], (Integer) values[2]), new Object[]{"", "", Integer.valueOf(1)})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (Integer) values[2]), new Object[]{null, "", Integer.valueOf(1)}),
            capture(values -> subject.method2((String) values[0], (String) values[1], (Integer) values[2]), new Object[]{null, "", Integer.valueOf(1)})
        );
    }
}
