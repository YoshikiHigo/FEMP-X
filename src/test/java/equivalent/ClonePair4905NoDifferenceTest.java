package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair4905NoDifferenceTest {

    private final ClonePair4905 subject = new ClonePair4905();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1]), new Object[]{"", "a"}),
            capture(values -> subject.method2((String) values[0], (String) values[1]), new Object[]{"", "a"})
        );
    }
}
