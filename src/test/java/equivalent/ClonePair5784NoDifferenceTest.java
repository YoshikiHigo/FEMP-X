package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair5784NoDifferenceTest {

    private final ClonePair5784 subject = new ClonePair5784();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (Object) values[1], (Object) values[2]), new Object[]{"", Integer.valueOf(7), Integer.valueOf(7)}),
            capture(values -> subject.method2((String) values[0], (Object) values[1], (Object) values[2]), new Object[]{"", Integer.valueOf(7), Integer.valueOf(7)})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (Object) values[1], (Object) values[2]), new Object[]{null, Integer.valueOf(7), Integer.valueOf(7)}),
            capture(values -> subject.method2((String) values[0], (Object) values[1], (Object) values[2]), new Object[]{null, Integer.valueOf(7), Integer.valueOf(7)})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (Object) values[1], (Object) values[2]), new Object[]{"foo", Integer.valueOf(7), Integer.valueOf(7)}),
            capture(values -> subject.method2((String) values[0], (Object) values[1], (Object) values[2]), new Object[]{"foo", Integer.valueOf(7), Integer.valueOf(7)})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (Object) values[1], (Object) values[2]), new Object[]{"foo/bar", Integer.valueOf(7), Integer.valueOf(7)}),
            capture(values -> subject.method2((String) values[0], (Object) values[1], (Object) values[2]), new Object[]{"foo/bar", Integer.valueOf(7), Integer.valueOf(7)})
        );
    }
}
