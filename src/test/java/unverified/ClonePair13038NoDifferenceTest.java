package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair13038NoDifferenceTest {

    private final ClonePair13038 subject = new ClonePair13038();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), new Object[]{"a"}),
            capture(values -> subject.method2((String) values[0]), new Object[]{"a"})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), new Object[]{null}),
            capture(values -> subject.method2((String) values[0]), new Object[]{null})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), new Object[]{"a.b"}),
            capture(values -> subject.method2((String) values[0]), new Object[]{"a.b"})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), new Object[]{"a.b.c"}),
            capture(values -> subject.method2((String) values[0]), new Object[]{"a.b.c"})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), new Object[]{"ab"}),
            capture(values -> subject.method2((String) values[0]), new Object[]{"ab"})
        );
    }
}
