package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair3192NoDifferenceTest {

    private final ClonePair3192 subject = new ClonePair3192();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1(((Double) values[0]).doubleValue(), ((Integer) values[1]).intValue()), new Object[]{-1.0, -1}),
            capture(values -> subject.method2(((Double) values[0]).doubleValue(), ((Integer) values[1]).intValue()), new Object[]{-1.0, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Double) values[0]).doubleValue(), ((Integer) values[1]).intValue()), new Object[]{0.0, -1}),
            capture(values -> subject.method2(((Double) values[0]).doubleValue(), ((Integer) values[1]).intValue()), new Object[]{0.0, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Double) values[0]).doubleValue(), ((Integer) values[1]).intValue()), new Object[]{1.0, -1}),
            capture(values -> subject.method2(((Double) values[0]).doubleValue(), ((Integer) values[1]).intValue()), new Object[]{1.0, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Double) values[0]).doubleValue(), ((Integer) values[1]).intValue()), new Object[]{2.0, -1}),
            capture(values -> subject.method2(((Double) values[0]).doubleValue(), ((Integer) values[1]).intValue()), new Object[]{2.0, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Double) values[0]).doubleValue(), ((Integer) values[1]).intValue()), new Object[]{3.5, -1}),
            capture(values -> subject.method2(((Double) values[0]).doubleValue(), ((Integer) values[1]).intValue()), new Object[]{3.5, -1})
        );
    }
}
