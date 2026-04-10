package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair7970NoDifferenceTest {

    private final ClonePair7970 subject = new ClonePair7970();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1]), new Object[]{"", "foo"}),
            capture(values -> subject.method2((String) values[0], (String) values[1]), new Object[]{"", "foo"})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1]), new Object[]{"foo", "foo"}),
            capture(values -> subject.method2((String) values[0], (String) values[1]), new Object[]{"foo", "foo"})
        );
    }
}
