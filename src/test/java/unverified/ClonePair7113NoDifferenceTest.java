package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair7113NoDifferenceTest {

    private final ClonePair7113 subject = new ClonePair7113();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), new Object[]{-1, -1, -1, -1}),
            capture(values -> subject.method2(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), new Object[]{-1, -1, -1, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), new Object[]{0, -1, -1, -1}),
            capture(values -> subject.method2(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), new Object[]{0, -1, -1, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), new Object[]{-1, 0, -1, -1}),
            capture(values -> subject.method2(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), new Object[]{-1, 0, -1, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), new Object[]{-1, -1, 0, -1}),
            capture(values -> subject.method2(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), new Object[]{-1, -1, 0, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), new Object[]{-1, -1, -1, 0}),
            capture(values -> subject.method2(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), new Object[]{-1, -1, -1, 0})
        );
    }
}
