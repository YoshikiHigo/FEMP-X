package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair3111NoDifferenceTest {

    private final ClonePair3111 subject = new ClonePair3111();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0], (Object) values[1]), new Object[]{Double.valueOf(-1.0), Double.valueOf(-1.0)}),
            capture(values -> subject.method2((Object) values[0], (Object) values[1]), new Object[]{Double.valueOf(-1.0), Double.valueOf(-1.0)})
        );
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0], (Object) values[1]), new Object[]{null, Double.valueOf(-1.0)}),
            capture(values -> subject.method2((Object) values[0], (Object) values[1]), new Object[]{null, Double.valueOf(-1.0)})
        );
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0], (Object) values[1]), new Object[]{Double.valueOf(0.0), Double.valueOf(-1.0)}),
            capture(values -> subject.method2((Object) values[0], (Object) values[1]), new Object[]{Double.valueOf(0.0), Double.valueOf(-1.0)})
        );
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0], (Object) values[1]), new Object[]{Double.valueOf(-1.0), Double.valueOf(0.0)}),
            capture(values -> subject.method2((Object) values[0], (Object) values[1]), new Object[]{Double.valueOf(-1.0), Double.valueOf(0.0)})
        );
    }
}
