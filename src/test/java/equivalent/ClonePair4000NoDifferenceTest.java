package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair4000NoDifferenceTest {

    private final ClonePair4000 subject = new ClonePair4000();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2], (String) values[3]), new Object[]{"", "", "", ""}),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2], (String) values[3]), new Object[]{"", "", "", ""})
        );
    }
}
