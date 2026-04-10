package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair3062NoDifferenceTest {

    private final ClonePair3062 subject = new ClonePair3062();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), new Object[]{" "}),
            capture(values -> subject.method2((String) values[0]), new Object[]{" "})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), new Object[]{null}),
            capture(values -> subject.method2((String) values[0]), new Object[]{null})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), new Object[]{"1"}),
            capture(values -> subject.method2((String) values[0]), new Object[]{"1"})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), new Object[]{"1.5"}),
            capture(values -> subject.method2((String) values[0]), new Object[]{"1.5"})
        );
    }
}
