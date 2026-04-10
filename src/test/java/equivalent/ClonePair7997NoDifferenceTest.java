package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair7997NoDifferenceTest {

    private final ClonePair7997 subject = new ClonePair7997();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{-1.0, -1.0, -1.0, -1.0, -1.0, -1.0};
        assertEquivalent(
            capture(values -> subject.method1(((Double) values[0]).doubleValue(), ((Double) values[1]).doubleValue(), ((Double) values[2]).doubleValue(), ((Double) values[3]).doubleValue(), ((Double) values[4]).doubleValue(), ((Double) values[5]).doubleValue()), caseInputs0),
            capture(values -> subject.method2(((Double) values[0]).doubleValue(), ((Double) values[1]).doubleValue(), ((Double) values[2]).doubleValue(), ((Double) values[3]).doubleValue(), ((Double) values[4]).doubleValue(), ((Double) values[5]).doubleValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{0.0, -1.0, 0.5, -1.0, -1.0, -1.0};
        assertEquivalent(
            capture(values -> subject.method1(((Double) values[0]).doubleValue(), ((Double) values[1]).doubleValue(), ((Double) values[2]).doubleValue(), ((Double) values[3]).doubleValue(), ((Double) values[4]).doubleValue(), ((Double) values[5]).doubleValue()), caseInputs1),
            capture(values -> subject.method2(((Double) values[0]).doubleValue(), ((Double) values[1]).doubleValue(), ((Double) values[2]).doubleValue(), ((Double) values[3]).doubleValue(), ((Double) values[4]).doubleValue(), ((Double) values[5]).doubleValue()), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{0.5, -1.0, 0.0, -1.0, -1.0, -1.0};
        assertEquivalent(
            capture(values -> subject.method1(((Double) values[0]).doubleValue(), ((Double) values[1]).doubleValue(), ((Double) values[2]).doubleValue(), ((Double) values[3]).doubleValue(), ((Double) values[4]).doubleValue(), ((Double) values[5]).doubleValue()), caseInputs2),
            capture(values -> subject.method2(((Double) values[0]).doubleValue(), ((Double) values[1]).doubleValue(), ((Double) values[2]).doubleValue(), ((Double) values[3]).doubleValue(), ((Double) values[4]).doubleValue(), ((Double) values[5]).doubleValue()), caseInputs2)
        );
    }
}
