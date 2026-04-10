package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair4813NoDifferenceTest {

    private final ClonePair4813 subject = new ClonePair4813();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1(((Character) values[0]).charValue()), new Object[]{'\0'}),
            capture(values -> subject.method2(((Character) values[0]).charValue()), new Object[]{'\0'})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Character) values[0]).charValue()), new Object[]{'a'}),
            capture(values -> subject.method2(((Character) values[0]).charValue()), new Object[]{'a'})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Character) values[0]).charValue()), new Object[]{'A'}),
            capture(values -> subject.method2(((Character) values[0]).charValue()), new Object[]{'A'})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Character) values[0]).charValue()), new Object[]{'.'}),
            capture(values -> subject.method2(((Character) values[0]).charValue()), new Object[]{'.'})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Character) values[0]).charValue()), new Object[]{'/'}),
            capture(values -> subject.method2(((Character) values[0]).charValue()), new Object[]{'/'})
        );
    }
}
