package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair11158NoDifferenceTest {

    private final ClonePair11158 subject = new ClonePair11158();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((Class) values[0], (Class) values[1]), new Object[]{String.class, String.class}),
            capture(values -> subject.method2((Class) values[0], (Class) values[1]), new Object[]{String.class, String.class})
        );
        assertEquivalent(
            capture(values -> subject.method1((Class) values[0], (Class) values[1]), new Object[]{null, String.class}),
            capture(values -> subject.method2((Class) values[0], (Class) values[1]), new Object[]{null, String.class})
        );
        assertEquivalent(
            capture(values -> subject.method1((Class) values[0], (Class) values[1]), new Object[]{Integer.class, String.class}),
            capture(values -> subject.method2((Class) values[0], (Class) values[1]), new Object[]{Integer.class, String.class})
        );
    }
}
