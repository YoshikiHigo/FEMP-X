package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair10939NoDifferenceTest {

    private final ClonePair10939 subject = new ClonePair10939();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue(), (String) values[2]), new Object[]{"foo", -1, ""}),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue(), (String) values[2]), new Object[]{"foo", -1, ""})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue(), (String) values[2]), new Object[]{null, -1, ""}),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue(), (String) values[2]), new Object[]{null, -1, ""})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue(), (String) values[2]), new Object[]{"foo", 0, ""}),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue(), (String) values[2]), new Object[]{"foo", 0, ""})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue(), (String) values[2]), new Object[]{"foo", 1, ""}),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue(), (String) values[2]), new Object[]{"foo", 1, ""})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue(), (String) values[2]), new Object[]{"foo", 2, ""}),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue(), (String) values[2]), new Object[]{"foo", 2, ""})
        );
    }
}
