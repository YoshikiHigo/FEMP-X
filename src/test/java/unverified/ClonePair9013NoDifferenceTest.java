package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair9013NoDifferenceTest {

    private final ClonePair9013 subject = new ClonePair9013();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Boolean) values[2]).booleanValue(), ((Boolean) values[3]).booleanValue()), new Object[]{"", "", false, false}),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Boolean) values[2]).booleanValue(), ((Boolean) values[3]).booleanValue()), new Object[]{"", "", false, false})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Boolean) values[2]).booleanValue(), ((Boolean) values[3]).booleanValue()), new Object[]{null, "", false, false}),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Boolean) values[2]).booleanValue(), ((Boolean) values[3]).booleanValue()), new Object[]{null, "", false, false})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Boolean) values[2]).booleanValue(), ((Boolean) values[3]).booleanValue()), new Object[]{"Key:\"Value\";Other:Two", "", false, false}),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Boolean) values[2]).booleanValue(), ((Boolean) values[3]).booleanValue()), new Object[]{"Key:\"Value\";Other:Two", "", false, false})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Boolean) values[2]).booleanValue(), ((Boolean) values[3]).booleanValue()), new Object[]{"a=1|b=2", "", false, false}),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Boolean) values[2]).booleanValue(), ((Boolean) values[3]).booleanValue()), new Object[]{"a=1|b=2", "", false, false})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Boolean) values[2]).booleanValue(), ((Boolean) values[3]).booleanValue()), new Object[]{"", null, false, false}),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Boolean) values[2]).booleanValue(), ((Boolean) values[3]).booleanValue()), new Object[]{"", null, false, false})
        );
    }
}
