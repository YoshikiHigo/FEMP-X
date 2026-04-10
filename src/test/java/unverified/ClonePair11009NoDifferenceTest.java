package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair11009NoDifferenceTest {

    private final ClonePair11009 subject = new ClonePair11009();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((CharSequence) values[0], (CharSequence) values[1]), new Object[]{"", ""}),
            capture(values -> subject.method2((CharSequence) values[0], (CharSequence) values[1]), new Object[]{"", ""})
        );
        assertEquivalent(
            capture(values -> subject.method1((CharSequence) values[0], (CharSequence) values[1]), new Object[]{null, ""}),
            capture(values -> subject.method2((CharSequence) values[0], (CharSequence) values[1]), new Object[]{null, ""})
        );
        assertEquivalent(
            capture(values -> subject.method1((CharSequence) values[0], (CharSequence) values[1]), new Object[]{"a", "a"}),
            capture(values -> subject.method2((CharSequence) values[0], (CharSequence) values[1]), new Object[]{"a", "a"})
        );
        assertEquivalent(
            capture(values -> subject.method1((CharSequence) values[0], (CharSequence) values[1]), new Object[]{"a.b", "a.b"}),
            capture(values -> subject.method2((CharSequence) values[0], (CharSequence) values[1]), new Object[]{"a.b", "a.b"})
        );
        assertEquivalent(
            capture(values -> subject.method1((CharSequence) values[0], (CharSequence) values[1]), new Object[]{"a.b.c", "a.b.c"}),
            capture(values -> subject.method2((CharSequence) values[0], (CharSequence) values[1]), new Object[]{"a.b.c", "a.b.c"})
        );
    }
}
