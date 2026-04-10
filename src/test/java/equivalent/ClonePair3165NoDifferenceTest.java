package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair3165NoDifferenceTest {

    private final ClonePair3165 subject = new ClonePair3165();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (Integer) values[1]), new Object[]{"", Integer.valueOf(-1)}),
            capture(values -> subject.method2((String) values[0], (Integer) values[1]), new Object[]{"", Integer.valueOf(-1)})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (Integer) values[1]), new Object[]{null, Integer.valueOf(-1)}),
            capture(values -> subject.method2((String) values[0], (Integer) values[1]), new Object[]{null, Integer.valueOf(-1)})
        );
    }
}
