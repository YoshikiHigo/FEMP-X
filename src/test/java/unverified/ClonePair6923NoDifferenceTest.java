package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair6923NoDifferenceTest {

    private final ClonePair6923 subject = new ClonePair6923();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue(), (String) values[1]), new Object[]{-1, "a"}),
            capture(values -> subject.method2(((Integer) values[0]).intValue(), (String) values[1]), new Object[]{-1, "a"})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue(), (String) values[1]), new Object[]{0, "a"}),
            capture(values -> subject.method2(((Integer) values[0]).intValue(), (String) values[1]), new Object[]{0, "a"})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue(), (String) values[1]), new Object[]{1, "a"}),
            capture(values -> subject.method2(((Integer) values[0]).intValue(), (String) values[1]), new Object[]{1, "a"})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue(), (String) values[1]), new Object[]{2, "a"}),
            capture(values -> subject.method2(((Integer) values[0]).intValue(), (String) values[1]), new Object[]{2, "a"})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue(), (String) values[1]), new Object[]{3, "a"}),
            capture(values -> subject.method2(((Integer) values[0]).intValue(), (String) values[1]), new Object[]{3, "a"})
        );
    }
}
