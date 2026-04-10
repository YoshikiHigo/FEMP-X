package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair4050NoDifferenceTest {

    private final ClonePair4050 subject = new ClonePair4050();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((java.util.Map) values[0]), new Object[]{map()}),
            capture(values -> subject.method2((java.util.Map) values[0]), new Object[]{map()})
        );
        assertEquivalent(
            capture(values -> subject.method1((java.util.Map) values[0]), new Object[]{null}),
            capture(values -> subject.method2((java.util.Map) values[0]), new Object[]{null})
        );
        assertEquivalent(
            capture(values -> subject.method1((java.util.Map) values[0]), new Object[]{map("a", "1")}),
            capture(values -> subject.method2((java.util.Map) values[0]), new Object[]{map("a", "1")})
        );
        assertEquivalent(
            capture(values -> subject.method1((java.util.Map) values[0]), new Object[]{map("a", "1", "b", "2")}),
            capture(values -> subject.method2((java.util.Map) values[0]), new Object[]{map("a", "1", "b", "2")})
        );
    }
}
