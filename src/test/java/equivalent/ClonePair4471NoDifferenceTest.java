package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair4471NoDifferenceTest {

    private final ClonePair4471 subject = new ClonePair4471();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0], (java.util.Map) values[1]), new Object[]{Integer.valueOf(7), map()}),
            capture(values -> subject.method2((Object) values[0], (java.util.Map) values[1]), new Object[]{Integer.valueOf(7), map()})
        );
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0], (java.util.Map) values[1]), new Object[]{Integer.valueOf(7), null}),
            capture(values -> subject.method2((Object) values[0], (java.util.Map) values[1]), new Object[]{Integer.valueOf(7), null})
        );
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0], (java.util.Map) values[1]), new Object[]{"a", map("a", "1")}),
            capture(values -> subject.method2((Object) values[0], (java.util.Map) values[1]), new Object[]{"a", map("a", "1")})
        );
    }
}
