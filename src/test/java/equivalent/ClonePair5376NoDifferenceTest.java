package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair5376NoDifferenceTest {

    private final ClonePair5376 subject = new ClonePair5376();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Integer) values[2]).intValue()), new Object[]{"a", "a", 1}),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Integer) values[2]).intValue()), new Object[]{"a", "a", 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Integer) values[2]).intValue()), new Object[]{null, "a", 1}),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Integer) values[2]).intValue()), new Object[]{null, "a", 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Integer) values[2]).intValue()), new Object[]{"a.b", "a", 1}),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Integer) values[2]).intValue()), new Object[]{"a.b", "a", 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Integer) values[2]).intValue()), new Object[]{"a", "a.b", 0}),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Integer) values[2]).intValue()), new Object[]{"a", "a.b", 0})
        );
    }
}
