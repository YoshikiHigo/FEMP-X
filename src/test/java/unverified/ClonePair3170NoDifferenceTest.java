package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair3170NoDifferenceTest {

    private final ClonePair3170 subject = new ClonePair3170();

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
