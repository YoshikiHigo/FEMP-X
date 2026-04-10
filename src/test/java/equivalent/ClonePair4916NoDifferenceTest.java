package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair4916NoDifferenceTest {

    private final ClonePair4916 subject = new ClonePair4916();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1(((Double) values[0]).doubleValue(), ((Double) values[1]).doubleValue(), ((Double) values[2]).doubleValue(), ((Double) values[3]).doubleValue(), ((Double) values[4]).doubleValue(), ((Double) values[5]).doubleValue(), ((Double) values[6]).doubleValue(), ((Double) values[7]).doubleValue(), ((Double) values[8]).doubleValue(), ((Double) values[9]).doubleValue()), new Object[]{-1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0}),
            capture(values -> subject.method2(((Double) values[0]).doubleValue(), ((Double) values[1]).doubleValue(), ((Double) values[2]).doubleValue(), ((Double) values[3]).doubleValue(), ((Double) values[4]).doubleValue(), ((Double) values[5]).doubleValue(), ((Double) values[6]).doubleValue(), ((Double) values[7]).doubleValue(), ((Double) values[8]).doubleValue(), ((Double) values[9]).doubleValue()), new Object[]{-1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Double) values[0]).doubleValue(), ((Double) values[1]).doubleValue(), ((Double) values[2]).doubleValue(), ((Double) values[3]).doubleValue(), ((Double) values[4]).doubleValue(), ((Double) values[5]).doubleValue(), ((Double) values[6]).doubleValue(), ((Double) values[7]).doubleValue(), ((Double) values[8]).doubleValue(), ((Double) values[9]).doubleValue()), new Object[]{-1.0, -1.0, -1.0, -1.0, -1.0, -1.0, 0.0, -1.0, -1.0, -1.0}),
            capture(values -> subject.method2(((Double) values[0]).doubleValue(), ((Double) values[1]).doubleValue(), ((Double) values[2]).doubleValue(), ((Double) values[3]).doubleValue(), ((Double) values[4]).doubleValue(), ((Double) values[5]).doubleValue(), ((Double) values[6]).doubleValue(), ((Double) values[7]).doubleValue(), ((Double) values[8]).doubleValue(), ((Double) values[9]).doubleValue()), new Object[]{-1.0, -1.0, -1.0, -1.0, -1.0, -1.0, 0.0, -1.0, -1.0, -1.0})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Double) values[0]).doubleValue(), ((Double) values[1]).doubleValue(), ((Double) values[2]).doubleValue(), ((Double) values[3]).doubleValue(), ((Double) values[4]).doubleValue(), ((Double) values[5]).doubleValue(), ((Double) values[6]).doubleValue(), ((Double) values[7]).doubleValue(), ((Double) values[8]).doubleValue(), ((Double) values[9]).doubleValue()), new Object[]{-1.0, -1.0, -1.0, -1.0, -1.0, -1.0, 0.5, -1.0, -1.0, -1.0}),
            capture(values -> subject.method2(((Double) values[0]).doubleValue(), ((Double) values[1]).doubleValue(), ((Double) values[2]).doubleValue(), ((Double) values[3]).doubleValue(), ((Double) values[4]).doubleValue(), ((Double) values[5]).doubleValue(), ((Double) values[6]).doubleValue(), ((Double) values[7]).doubleValue(), ((Double) values[8]).doubleValue(), ((Double) values[9]).doubleValue()), new Object[]{-1.0, -1.0, -1.0, -1.0, -1.0, -1.0, 0.5, -1.0, -1.0, -1.0})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Double) values[0]).doubleValue(), ((Double) values[1]).doubleValue(), ((Double) values[2]).doubleValue(), ((Double) values[3]).doubleValue(), ((Double) values[4]).doubleValue(), ((Double) values[5]).doubleValue(), ((Double) values[6]).doubleValue(), ((Double) values[7]).doubleValue(), ((Double) values[8]).doubleValue(), ((Double) values[9]).doubleValue()), new Object[]{-1.0, -1.0, -1.0, -1.0, -1.0, -1.0, 1.0, -1.0, -1.0, -1.0}),
            capture(values -> subject.method2(((Double) values[0]).doubleValue(), ((Double) values[1]).doubleValue(), ((Double) values[2]).doubleValue(), ((Double) values[3]).doubleValue(), ((Double) values[4]).doubleValue(), ((Double) values[5]).doubleValue(), ((Double) values[6]).doubleValue(), ((Double) values[7]).doubleValue(), ((Double) values[8]).doubleValue(), ((Double) values[9]).doubleValue()), new Object[]{-1.0, -1.0, -1.0, -1.0, -1.0, -1.0, 1.0, -1.0, -1.0, -1.0})
        );
    }
}
