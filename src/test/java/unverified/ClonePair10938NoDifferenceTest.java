package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair10938NoDifferenceTest {

    private final ClonePair10938 subject = new ClonePair10938();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1(((Character) values[0]).charValue(), ((Character) values[1]).charValue(), ((Boolean) values[2]).booleanValue()), new Object[]{'\0', '\0', false}),
            capture(values -> subject.method2(((Character) values[0]).charValue(), ((Character) values[1]).charValue(), ((Boolean) values[2]).booleanValue()), new Object[]{'\0', '\0', false})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Character) values[0]).charValue(), ((Character) values[1]).charValue(), ((Boolean) values[2]).booleanValue()), new Object[]{'a', '\0', false}),
            capture(values -> subject.method2(((Character) values[0]).charValue(), ((Character) values[1]).charValue(), ((Boolean) values[2]).booleanValue()), new Object[]{'a', '\0', false})
        );
    }
}
