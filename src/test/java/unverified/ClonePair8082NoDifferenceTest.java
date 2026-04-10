package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair8082NoDifferenceTest {

    private final ClonePair8082 subject = new ClonePair8082();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2], (int[]) values[3]), new Object[]{"", "foo", "", new int[]{}}),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2], (int[]) values[3]), new Object[]{"", "foo", "", new int[]{}})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2], (int[]) values[3]), new Object[]{null, "foo", "", new int[]{}}),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2], (int[]) values[3]), new Object[]{null, "foo", "", new int[]{}})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2], (int[]) values[3]), new Object[]{"foo", "foo", "", new int[]{}}),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2], (int[]) values[3]), new Object[]{"foo", "foo", "", new int[]{}})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2], (int[]) values[3]), new Object[]{"", null, "", new int[]{}}),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2], (int[]) values[3]), new Object[]{"", null, "", new int[]{}})
        );
    }
}
