package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair2520NoDifferenceTest {

    private final ClonePair2520 subject = new ClonePair2520();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1(((Long) values[0]).longValue(), ((Float) values[1]).floatValue(), ((Integer) values[2]).intValue()), new Object[]{1L, -1.0f, -1}),
            capture(values -> subject.method2(((Long) values[0]).longValue(), ((Float) values[1]).floatValue(), ((Integer) values[2]).intValue()), new Object[]{1L, -1.0f, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Long) values[0]).longValue(), ((Float) values[1]).floatValue(), ((Integer) values[2]).intValue()), new Object[]{-1L, -1.0f, -1}),
            capture(values -> subject.method2(((Long) values[0]).longValue(), ((Float) values[1]).floatValue(), ((Integer) values[2]).intValue()), new Object[]{-1L, -1.0f, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Long) values[0]).longValue(), ((Float) values[1]).floatValue(), ((Integer) values[2]).intValue()), new Object[]{0L, -1.0f, -1}),
            capture(values -> subject.method2(((Long) values[0]).longValue(), ((Float) values[1]).floatValue(), ((Integer) values[2]).intValue()), new Object[]{0L, -1.0f, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Long) values[0]).longValue(), ((Float) values[1]).floatValue(), ((Integer) values[2]).intValue()), new Object[]{2L, -1.0f, -1}),
            capture(values -> subject.method2(((Long) values[0]).longValue(), ((Float) values[1]).floatValue(), ((Integer) values[2]).intValue()), new Object[]{2L, -1.0f, -1})
        );
        assertEquivalent(
            capture(values -> subject.method1(((Long) values[0]).longValue(), ((Float) values[1]).floatValue(), ((Integer) values[2]).intValue()), new Object[]{1L, 0.5f, -1}),
            capture(values -> subject.method2(((Long) values[0]).longValue(), ((Float) values[1]).floatValue(), ((Integer) values[2]).intValue()), new Object[]{1L, 0.5f, -1})
        );
    }
}
