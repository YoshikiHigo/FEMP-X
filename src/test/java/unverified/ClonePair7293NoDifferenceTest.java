package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair7293NoDifferenceTest {

    private final ClonePair7293 subject = new ClonePair7293();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((Object[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new Object[]{}, 1}),
            capture(values -> subject.method2((Object[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new Object[]{}, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((Object[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new Object[]{"a", Integer.valueOf(1)}, 1}),
            capture(values -> subject.method2((Object[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new Object[]{"a", Integer.valueOf(1)}, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((Object[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new Object[]{}, -1}),
            capture(values -> subject.method2((Object[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new Object[]{}, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1((Object[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new Object[]{"a"}, 0}),
            capture(values -> subject.method2((Object[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new Object[]{"a"}, 0})
        );
    }
}
