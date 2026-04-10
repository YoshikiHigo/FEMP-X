package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair6658NoDifferenceTest {

    private final ClonePair6658 subject = new ClonePair6658();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((java.util.Map) values[0], (String) values[1], (String) values[2]), new Object[]{map(), "", ""}),
            capture(values -> subject.method2((java.util.Map) values[0], (String) values[1], (String) values[2]), new Object[]{map(), "", ""})
        );
        assertEquivalent(
            capture(values -> subject.method1((java.util.Map) values[0], (String) values[1], (String) values[2]), new Object[]{null, "", ""}),
            capture(values -> subject.method2((java.util.Map) values[0], (String) values[1], (String) values[2]), new Object[]{null, "", ""})
        );
        assertEquivalent(
            capture(values -> subject.method1((java.util.Map) values[0], (String) values[1], (String) values[2]), new Object[]{map(), "", null}),
            capture(values -> subject.method2((java.util.Map) values[0], (String) values[1], (String) values[2]), new Object[]{map(), "", null})
        );
        assertEquivalent(
            capture(values -> subject.method1((java.util.Map) values[0], (String) values[1], (String) values[2]), new Object[]{map(), "", "a"}),
            capture(values -> subject.method2((java.util.Map) values[0], (String) values[1], (String) values[2]), new Object[]{map(), "", "a"})
        );
        assertEquivalent(
            capture(values -> subject.method1((java.util.Map) values[0], (String) values[1], (String) values[2]), new Object[]{map(), "", "A"}),
            capture(values -> subject.method2((java.util.Map) values[0], (String) values[1], (String) values[2]), new Object[]{map(), "", "A"})
        );
    }
}
