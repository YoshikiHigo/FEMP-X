package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair4143NoDifferenceTest {

    private final ClonePair4143 subject = new ClonePair4143();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((java.util.List) values[0]), new Object[]{list()}),
            capture(values -> subject.method2((java.util.List) values[0]), new Object[]{list()})
        );
        assertEquivalent(
            capture(values -> subject.method1((java.util.List) values[0]), new Object[]{null}),
            capture(values -> subject.method2((java.util.List) values[0]), new Object[]{null})
        );
        assertEquivalent(
            capture(values -> subject.method1((java.util.List) values[0]), new Object[]{list("alpha")}),
            capture(values -> subject.method2((java.util.List) values[0]), new Object[]{list("alpha")})
        );
        assertEquivalent(
            capture(values -> subject.method1((java.util.List) values[0]), new Object[]{list("alpha", "beta")}),
            capture(values -> subject.method2((java.util.List) values[0]), new Object[]{list("alpha", "beta")})
        );
        assertEquivalent(
            capture(values -> subject.method1((java.util.List) values[0]), new Object[]{list("beta", "gamma")}),
            capture(values -> subject.method2((java.util.List) values[0]), new Object[]{list("beta", "gamma")})
        );
    }
}
