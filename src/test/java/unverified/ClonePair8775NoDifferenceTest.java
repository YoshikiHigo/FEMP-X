package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair8775NoDifferenceTest {

    private final ClonePair8775 subject = new ClonePair8775();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((java.util.ArrayList) values[0]), new Object[]{list()}),
            capture(values -> subject.method2((java.util.ArrayList) values[0]), new Object[]{list()})
        );
        assertEquivalent(
            capture(values -> subject.method1((java.util.ArrayList) values[0]), new Object[]{null}),
            capture(values -> subject.method2((java.util.ArrayList) values[0]), new Object[]{null})
        );
        assertEquivalent(
            capture(values -> subject.method1((java.util.ArrayList) values[0]), new Object[]{list(Double.valueOf(1.0))}),
            capture(values -> subject.method2((java.util.ArrayList) values[0]), new Object[]{list(Double.valueOf(1.0))})
        );
        assertEquivalent(
            capture(values -> subject.method1((java.util.ArrayList) values[0]), new Object[]{list(Double.valueOf(1.0), Double.valueOf(2.0))}),
            capture(values -> subject.method2((java.util.ArrayList) values[0]), new Object[]{list(Double.valueOf(1.0), Double.valueOf(2.0))})
        );
        assertEquivalent(
            capture(values -> subject.method1((java.util.ArrayList) values[0]), new Object[]{list(Double.valueOf(-1.0), Double.valueOf(0.0), Double.valueOf(1.0))}),
            capture(values -> subject.method2((java.util.ArrayList) values[0]), new Object[]{list(Double.valueOf(-1.0), Double.valueOf(0.0), Double.valueOf(1.0))})
        );
    }
}
