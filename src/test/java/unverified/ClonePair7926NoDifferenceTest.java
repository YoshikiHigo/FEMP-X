package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair7926NoDifferenceTest {

    private final ClonePair7926 subject = new ClonePair7926();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2], ((Boolean) values[3]).booleanValue()), new Object[]{"foo", "foo", "", false}),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2], ((Boolean) values[3]).booleanValue()), new Object[]{"foo", "foo", "", false})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2], ((Boolean) values[3]).booleanValue()), new Object[]{null, "foo", "", false}),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2], ((Boolean) values[3]).booleanValue()), new Object[]{null, "foo", "", false})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2], ((Boolean) values[3]).booleanValue()), new Object[]{"foo/bar", "foo", "", false}),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2], ((Boolean) values[3]).booleanValue()), new Object[]{"foo/bar", "foo", "", false})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2], ((Boolean) values[3]).booleanValue()), new Object[]{"foo", "foo/bar", "", false}),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2], ((Boolean) values[3]).booleanValue()), new Object[]{"foo", "foo/bar", "", false})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2], ((Boolean) values[3]).booleanValue()), new Object[]{"foo", "foo", null, false}),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2], ((Boolean) values[3]).booleanValue()), new Object[]{"foo", "foo", null, false})
        );
    }
}
