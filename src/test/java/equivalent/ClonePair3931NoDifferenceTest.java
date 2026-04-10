package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair3931NoDifferenceTest {

    private final ClonePair3931 subject = new ClonePair3931();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((Long) values[0]), new Object[]{Long.valueOf(-1L)}),
            capture(values -> subject.method2((Long) values[0]), new Object[]{Long.valueOf(-1L)})
        );
        assertEquivalent(
            capture(values -> subject.method1((Long) values[0]), new Object[]{null}),
            capture(values -> subject.method2((Long) values[0]), new Object[]{null})
        );
        assertEquivalent(
            capture(values -> subject.method1((Long) values[0]), new Object[]{Long.valueOf(0L)}),
            capture(values -> subject.method2((Long) values[0]), new Object[]{Long.valueOf(0L)})
        );
        assertEquivalent(
            capture(values -> subject.method1((Long) values[0]), new Object[]{Long.valueOf(1L)}),
            capture(values -> subject.method2((Long) values[0]), new Object[]{Long.valueOf(1L)})
        );
        assertEquivalent(
            capture(values -> subject.method1((Long) values[0]), new Object[]{Long.valueOf(255L)}),
            capture(values -> subject.method2((Long) values[0]), new Object[]{Long.valueOf(255L)})
        );
    }
}
