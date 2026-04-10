package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair3804NoDifferenceTest {

    private final ClonePair3804 subject = new ClonePair3804();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((java.util.Locale) values[0]), new Object[]{locale("en", "US", "")}),
            capture(values -> subject.method2((java.util.Locale) values[0]), new Object[]{locale("en", "US", "")})
        );
        assertEquivalent(
            capture(values -> subject.method1((java.util.Locale) values[0]), new Object[]{null}),
            capture(values -> subject.method2((java.util.Locale) values[0]), new Object[]{null})
        );
        assertEquivalent(
            capture(values -> subject.method1((java.util.Locale) values[0]), new Object[]{locale("ja", "JP", "")}),
            capture(values -> subject.method2((java.util.Locale) values[0]), new Object[]{locale("ja", "JP", "")})
        );
        assertEquivalent(
            capture(values -> subject.method1((java.util.Locale) values[0]), new Object[]{locale("fr", "CA", "POSIX")}),
            capture(values -> subject.method2((java.util.Locale) values[0]), new Object[]{locale("fr", "CA", "POSIX")})
        );
    }
}
