package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair7908NoDifferenceTest {

    private final ClonePair7908 subject = new ClonePair7908();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{-1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, false, false, false, false};
        assertEquivalent(
            capture(values -> subject.method1(((Double) values[0]).doubleValue(), ((Double) values[1]).doubleValue(), ((Double) values[2]).doubleValue(), ((Double) values[3]).doubleValue(), ((Double) values[4]).doubleValue(), ((Double) values[5]).doubleValue(), ((Double) values[6]).doubleValue(), ((Double) values[7]).doubleValue(), ((Boolean) values[8]).booleanValue(), ((Boolean) values[9]).booleanValue(), ((Boolean) values[10]).booleanValue(), ((Boolean) values[11]).booleanValue()), caseInputs0),
            capture(values -> subject.method2(((Double) values[0]).doubleValue(), ((Double) values[1]).doubleValue(), ((Double) values[2]).doubleValue(), ((Double) values[3]).doubleValue(), ((Double) values[4]).doubleValue(), ((Double) values[5]).doubleValue(), ((Double) values[6]).doubleValue(), ((Double) values[7]).doubleValue(), ((Boolean) values[8]).booleanValue(), ((Boolean) values[9]).booleanValue(), ((Boolean) values[10]).booleanValue(), ((Boolean) values[11]).booleanValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{0.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, false, false, false, false};
        assertEquivalent(
            capture(values -> subject.method1(((Double) values[0]).doubleValue(), ((Double) values[1]).doubleValue(), ((Double) values[2]).doubleValue(), ((Double) values[3]).doubleValue(), ((Double) values[4]).doubleValue(), ((Double) values[5]).doubleValue(), ((Double) values[6]).doubleValue(), ((Double) values[7]).doubleValue(), ((Boolean) values[8]).booleanValue(), ((Boolean) values[9]).booleanValue(), ((Boolean) values[10]).booleanValue(), ((Boolean) values[11]).booleanValue()), caseInputs1),
            capture(values -> subject.method2(((Double) values[0]).doubleValue(), ((Double) values[1]).doubleValue(), ((Double) values[2]).doubleValue(), ((Double) values[3]).doubleValue(), ((Double) values[4]).doubleValue(), ((Double) values[5]).doubleValue(), ((Double) values[6]).doubleValue(), ((Double) values[7]).doubleValue(), ((Boolean) values[8]).booleanValue(), ((Boolean) values[9]).booleanValue(), ((Boolean) values[10]).booleanValue(), ((Boolean) values[11]).booleanValue()), caseInputs1)
        );
    }
}
