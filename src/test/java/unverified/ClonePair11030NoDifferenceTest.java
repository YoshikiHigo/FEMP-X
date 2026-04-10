package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair11030NoDifferenceTest {

    private final ClonePair11030 subject = new ClonePair11030();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String[]) values[0], (String) values[1]), new Object[]{new String[]{}, ""}),
            capture(values -> subject.method2((String[]) values[0], (String) values[1]), new Object[]{new String[]{}, ""})
        );
        assertEquivalent(
            capture(values -> subject.method1((String[]) values[0], (String) values[1]), new Object[]{null, ""}),
            capture(values -> subject.method2((String[]) values[0], (String) values[1]), new Object[]{null, ""})
        );
    }
}
