package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair9252NoDifferenceTest {

    private final ClonePair9252 subject = new ClonePair9252();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue(), (String) values[2]), new Object[]{"a", -1, ""}),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue(), (String) values[2]), new Object[]{"a", -1, ""})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue(), (String) values[2]), new Object[]{null, -1, ""}),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue(), (String) values[2]), new Object[]{null, -1, ""})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue(), (String) values[2]), new Object[]{"a", 0, ""}),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue(), (String) values[2]), new Object[]{"a", 0, ""})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue(), (String) values[2]), new Object[]{"a.b", 0, "a.b"}),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue(), (String) values[2]), new Object[]{"a.b", 0, "a.b"})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue(), (String) values[2]), new Object[]{"a.b", 1, null}),
            capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue(), (String) values[2]), new Object[]{"a.b", 1, null})
        );
    }
}
