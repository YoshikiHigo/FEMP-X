package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair3468NoDifferenceTest {

    private final ClonePair3468 subject = new ClonePair3468();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((CharSequence) values[0]), new Object[]{""}),
            capture(values -> subject.method2((CharSequence) values[0]), new Object[]{""})
        );
        assertEquivalent(
            capture(values -> subject.method1((CharSequence) values[0]), new Object[]{null}),
            capture(values -> subject.method2((CharSequence) values[0]), new Object[]{null})
        );
        assertEquivalent(
            capture(values -> subject.method1((CharSequence) values[0]), new Object[]{"a"}),
            capture(values -> subject.method2((CharSequence) values[0]), new Object[]{"a"})
        );
        assertEquivalent(
            capture(values -> subject.method1((CharSequence) values[0]), new Object[]{"a.b"}),
            capture(values -> subject.method2((CharSequence) values[0]), new Object[]{"a.b"})
        );
        assertEquivalent(
            capture(values -> subject.method1((CharSequence) values[0]), new Object[]{"a.b.c"}),
            capture(values -> subject.method2((CharSequence) values[0]), new Object[]{"a.b.c"})
        );
    }
}
