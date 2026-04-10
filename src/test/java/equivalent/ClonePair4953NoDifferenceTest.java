package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair4953NoDifferenceTest {

    private final ClonePair4953 subject = new ClonePair4953();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((java.util.Hashtable) values[0]), new Object[]{hashtable()}),
            capture(values -> subject.method2((java.util.Hashtable) values[0]), new Object[]{hashtable()})
        );
        assertEquivalent(
            capture(values -> subject.method1((java.util.Hashtable) values[0]), new Object[]{null}),
            capture(values -> subject.method2((java.util.Hashtable) values[0]), new Object[]{null})
        );
    }
}
