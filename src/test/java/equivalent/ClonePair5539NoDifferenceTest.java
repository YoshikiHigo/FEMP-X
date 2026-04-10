package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair5539NoDifferenceTest {

    private final ClonePair5539 subject = new ClonePair5539();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((java.util.List) values[0], (Object) values[1], (java.util.Comparator) values[2]), new Object[]{list(), Integer.valueOf(7), naturalComparator()}),
            capture(values -> subject.method2((java.util.List) values[0], (Object) values[1], (java.util.Comparator) values[2]), new Object[]{list(), Integer.valueOf(7), naturalComparator()})
        );
        assertEquivalent(
            capture(values -> subject.method1((java.util.List) values[0], (Object) values[1], (java.util.Comparator) values[2]), new Object[]{null, Integer.valueOf(7), naturalComparator()}),
            capture(values -> subject.method2((java.util.List) values[0], (Object) values[1], (java.util.Comparator) values[2]), new Object[]{null, Integer.valueOf(7), naturalComparator()})
        );
        assertEquivalent(
            capture(values -> subject.method1((java.util.List) values[0], (Object) values[1], (java.util.Comparator) values[2]), new Object[]{list("alpha"), Integer.valueOf(7), naturalComparator()}),
            capture(values -> subject.method2((java.util.List) values[0], (Object) values[1], (java.util.Comparator) values[2]), new Object[]{list("alpha"), Integer.valueOf(7), naturalComparator()})
        );
        assertEquivalent(
            capture(values -> subject.method1((java.util.List) values[0], (Object) values[1], (java.util.Comparator) values[2]), new Object[]{list("alpha"), "a", reverseComparator()}),
            capture(values -> subject.method2((java.util.List) values[0], (Object) values[1], (java.util.Comparator) values[2]), new Object[]{list("alpha"), "a", reverseComparator()})
        );
        assertEquivalent(
            capture(values -> subject.method1((java.util.List) values[0], (Object) values[1], (java.util.Comparator) values[2]), new Object[]{list("alpha", "beta"), "a", reverseComparator()}),
            capture(values -> subject.method2((java.util.List) values[0], (Object) values[1], (java.util.Comparator) values[2]), new Object[]{list("alpha", "beta"), "a", reverseComparator()})
        );
    }
}
