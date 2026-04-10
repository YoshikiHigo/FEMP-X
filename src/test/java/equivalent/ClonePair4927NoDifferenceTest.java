package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair4927NoDifferenceTest {

    private final ClonePair4927 subject = new ClonePair4927();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((java.util.Collection) values[0]), new Object[]{list()}),
            capture(values -> subject.method2((java.util.Collection) values[0]), new Object[]{list()})
        );
        assertEquivalent(
            capture(values -> subject.method1((java.util.Collection) values[0]), new Object[]{null}),
            capture(values -> subject.method2((java.util.Collection) values[0]), new Object[]{null})
        );
        assertEquivalent(
            capture(values -> subject.method1((java.util.Collection) values[0]), new Object[]{list("alpha")}),
            capture(values -> subject.method2((java.util.Collection) values[0]), new Object[]{list("alpha")})
        );
    }
}
