package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair7959NoDifferenceTest {

    private final ClonePair7959 subject = new ClonePair7959();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Integer) values[2]).intValue()), new Object[]{"a", null, 1}),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Integer) values[2]).intValue()), new Object[]{"a", null, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Integer) values[2]).intValue()), new Object[]{null, null, -1}),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Integer) values[2]).intValue()), new Object[]{null, null, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Integer) values[2]).intValue()), new Object[]{"a", null, 2}),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Integer) values[2]).intValue()), new Object[]{"a", null, 2})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Integer) values[2]).intValue()), new Object[]{"a", "a", 2}),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Integer) values[2]).intValue()), new Object[]{"a", "a", 2})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Integer) values[2]).intValue()), new Object[]{"a", "A", 2}),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Integer) values[2]).intValue()), new Object[]{"a", "A", 2})
        );
    }
}
