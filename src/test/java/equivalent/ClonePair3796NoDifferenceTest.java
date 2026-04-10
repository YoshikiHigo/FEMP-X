package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair3796NoDifferenceTest {

    private final ClonePair3796 subject = new ClonePair3796();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((Double) values[0], (Double) values[1]), new Object[]{Double.valueOf(-1.0), Double.valueOf(1.0)}),
            capture(values -> subject.method2((Double) values[0], (Double) values[1]), new Object[]{Double.valueOf(-1.0), Double.valueOf(1.0)})
        );
        assertEquivalent(
            capture(values -> subject.method1((Double) values[0], (Double) values[1]), new Object[]{Double.valueOf(1.0), Double.valueOf(1.0)}),
            capture(values -> subject.method2((Double) values[0], (Double) values[1]), new Object[]{Double.valueOf(1.0), Double.valueOf(1.0)})
        );
        assertEquivalent(
            capture(values -> subject.method1((Double) values[0], (Double) values[1]), new Object[]{Double.valueOf(1.5), Double.valueOf(1.0)}),
            capture(values -> subject.method2((Double) values[0], (Double) values[1]), new Object[]{Double.valueOf(1.5), Double.valueOf(1.0)})
        );
    }
}
