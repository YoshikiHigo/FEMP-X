package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair2976NoDifferenceTest {

    private final ClonePair2976 subject = new ClonePair2976();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0], (Object) values[1]), new Object[]{Boolean.FALSE, Boolean.FALSE}),
            capture(values -> subject.method2((Object) values[0], (Object) values[1]), new Object[]{Boolean.FALSE, Boolean.FALSE})
        );
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0], (Object) values[1]), new Object[]{null, Boolean.FALSE}),
            capture(values -> subject.method2((Object) values[0], (Object) values[1]), new Object[]{null, Boolean.FALSE})
        );
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0], (Object) values[1]), new Object[]{Boolean.TRUE, Boolean.FALSE}),
            capture(values -> subject.method2((Object) values[0], (Object) values[1]), new Object[]{Boolean.TRUE, Boolean.FALSE})
        );
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0], (Object) values[1]), new Object[]{Integer.valueOf(7), Boolean.FALSE}),
            capture(values -> subject.method2((Object) values[0], (Object) values[1]), new Object[]{Integer.valueOf(7), Boolean.FALSE})
        );
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0], (Object) values[1]), new Object[]{"a", "A"}),
            capture(values -> subject.method2((Object) values[0], (Object) values[1]), new Object[]{"a", "A"})
        );
    }
}
