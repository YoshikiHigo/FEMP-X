package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair13388NoDifferenceTest {

    private final ClonePair13388 subject = new ClonePair13388();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Integer) values[2]).intValue(), (int[]) values[3]), new Object[]{"a", "a", 1, new int[]{}}),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Integer) values[2]).intValue(), (int[]) values[3]), new Object[]{"a", "a", 1, new int[]{}})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Integer) values[2]).intValue(), (int[]) values[3]), new Object[]{null, "a", 1, new int[]{}}),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Integer) values[2]).intValue(), (int[]) values[3]), new Object[]{null, "a", 1, new int[]{}})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], ((Integer) values[2]).intValue(), (int[]) values[3]), new Object[]{"a.b", "a", 1, new int[]{}}),
            capture(values -> subject.method2((String) values[0], (String) values[1], ((Integer) values[2]).intValue(), (int[]) values[3]), new Object[]{"a.b", "a", 1, new int[]{}})
        );
    }
}
