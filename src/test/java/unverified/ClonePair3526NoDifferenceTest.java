package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair3526NoDifferenceTest {

    private final ClonePair3526 subject = new ClonePair3526();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0], (Object) values[1]), new Object[]{Integer.valueOf(7), Integer.valueOf(7)}),
            capture(values -> subject.method2((Object) values[0], (Object) values[1]), new Object[]{Integer.valueOf(7), Integer.valueOf(7)})
        );
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0], (Object) values[1]), new Object[]{null, null}),
            capture(values -> subject.method2((Object) values[0], (Object) values[1]), new Object[]{null, null})
        );
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0], (Object) values[1]), new Object[]{null, ""}),
            capture(values -> subject.method2((Object) values[0], (Object) values[1]), new Object[]{null, ""})
        );
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0], (Object) values[1]), new Object[]{"", null}),
            capture(values -> subject.method2((Object) values[0], (Object) values[1]), new Object[]{"", null})
        );
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0], (Object) values[1]), new Object[]{"", "abc"}),
            capture(values -> subject.method2((Object) values[0], (Object) values[1]), new Object[]{"", "abc"})
        );
    }
}
