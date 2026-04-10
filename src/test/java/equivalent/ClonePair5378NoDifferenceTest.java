package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair5378NoDifferenceTest {

    private final ClonePair5378 subject = new ClonePair5378();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Integer) values[2]).intValue()), new Object[]{"a", "", 1}),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Integer) values[2]).intValue()), new Object[]{"a", "", 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Integer) values[2]).intValue()), new Object[]{null, "", 1}),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Integer) values[2]).intValue()), new Object[]{null, "", 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Integer) values[2]).intValue()), new Object[]{"a", "", -1}),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Integer) values[2]).intValue()), new Object[]{"a", "", -1})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Integer) values[2]).intValue()), new Object[]{"a", "a", 0}),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Integer) values[2]).intValue()), new Object[]{"a", "a", 0})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Integer) values[2]).intValue()), new Object[]{"a.b", "a.b", 1}),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Integer) values[2]).intValue()), new Object[]{"a.b", "a.b", 1})
        );
    }
}
