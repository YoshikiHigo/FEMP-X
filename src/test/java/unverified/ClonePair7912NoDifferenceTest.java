package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair7912NoDifferenceTest {

    private final ClonePair7912 subject = new ClonePair7912();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Boolean) values[2]).booleanValue()), new Object[]{"", "", false}),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Boolean) values[2]).booleanValue()), new Object[]{"", "", false})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Boolean) values[2]).booleanValue()), new Object[]{null, "", false}),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Boolean) values[2]).booleanValue()), new Object[]{null, "", false})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Boolean) values[2]).booleanValue()), new Object[]{"Alpha", "", false}),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Boolean) values[2]).booleanValue()), new Object[]{"Alpha", "", false})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Boolean) values[2]).booleanValue()), new Object[]{"", "Alpha", false}),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Boolean) values[2]).booleanValue()), new Object[]{"", "Alpha", false})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Boolean) values[2]).booleanValue()), new Object[]{"Alpha", "alpha", false}),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Boolean) values[2]).booleanValue()), new Object[]{"Alpha", "alpha", false})
        );
    }
}
