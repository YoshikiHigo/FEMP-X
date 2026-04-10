package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair12483NoDifferenceTest {

    private final ClonePair12483 subject = new ClonePair12483();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0], (Object[]) values[1]), new Object[]{Integer.valueOf(7), new Object[]{}}),
            capture(values -> subject.method2((Object) values[0], (Object[]) values[1]), new Object[]{Integer.valueOf(7), new Object[]{}})
        );
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0], (Object[]) values[1]), new Object[]{"a", new Object[]{"a"}}),
            capture(values -> subject.method2((Object) values[0], (Object[]) values[1]), new Object[]{"a", new Object[]{"a"}})
        );
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0], (Object[]) values[1]), new Object[]{Integer.valueOf(1), new Object[]{"a", Integer.valueOf(1)}}),
            capture(values -> subject.method2((Object) values[0], (Object[]) values[1]), new Object[]{Integer.valueOf(1), new Object[]{"a", Integer.valueOf(1)}})
        );
    }
}
