package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair5309NoDifferenceTest {

    private final ClonePair5309 subject = new ClonePair5309();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1(((Double) values[0]).doubleValue(), ((Double) values[1]).doubleValue(), ((Double) values[2]).doubleValue(), ((Double) values[3]).doubleValue(), ((Double) values[4]).doubleValue(), ((Double) values[5]).doubleValue(), ((Boolean) values[6]).booleanValue(), ((Boolean) values[7]).booleanValue(), ((Double) values[8]).doubleValue()), new Object[]{-1.0, -1.0, -1.0, -1.0, -1.0, -1.0, false, false, 0.5}),
            capture(values -> subject.method2(((Double) values[0]).doubleValue(), ((Double) values[1]).doubleValue(), ((Double) values[2]).doubleValue(), ((Double) values[3]).doubleValue(), ((Double) values[4]).doubleValue(), ((Double) values[5]).doubleValue(), ((Boolean) values[6]).booleanValue(), ((Boolean) values[7]).booleanValue(), ((Double) values[8]).doubleValue()), new Object[]{-1.0, -1.0, -1.0, -1.0, -1.0, -1.0, false, false, 0.5})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Double) values[0]).doubleValue(), ((Double) values[1]).doubleValue(), ((Double) values[2]).doubleValue(), ((Double) values[3]).doubleValue(), ((Double) values[4]).doubleValue(), ((Double) values[5]).doubleValue(), ((Boolean) values[6]).booleanValue(), ((Boolean) values[7]).booleanValue(), ((Double) values[8]).doubleValue()), new Object[]{-1.0, -1.0, 0.0, -1.0, -1.0, -1.0, false, false, 0.5}),
            capture(values -> subject.method2(((Double) values[0]).doubleValue(), ((Double) values[1]).doubleValue(), ((Double) values[2]).doubleValue(), ((Double) values[3]).doubleValue(), ((Double) values[4]).doubleValue(), ((Double) values[5]).doubleValue(), ((Boolean) values[6]).booleanValue(), ((Boolean) values[7]).booleanValue(), ((Double) values[8]).doubleValue()), new Object[]{-1.0, -1.0, 0.0, -1.0, -1.0, -1.0, false, false, 0.5})
        );
    }
}
