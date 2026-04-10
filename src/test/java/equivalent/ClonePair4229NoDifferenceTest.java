package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair4229NoDifferenceTest {

    private final ClonePair4229 subject = new ClonePair4229();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2], (String) values[3], (String) values[4], ((Boolean) values[5]).booleanValue(), ((Integer) values[6]).intValue()), new Object[]{"", "", "", "", "", false, 1}),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2], (String) values[3], (String) values[4], ((Boolean) values[5]).booleanValue(), ((Integer) values[6]).intValue()), new Object[]{"", "", "", "", "", false, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2], (String) values[3], (String) values[4], ((Boolean) values[5]).booleanValue(), ((Integer) values[6]).intValue()), new Object[]{null, "", "", "", "", false, 1}),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2], (String) values[3], (String) values[4], ((Boolean) values[5]).booleanValue(), ((Integer) values[6]).intValue()), new Object[]{null, "", "", "", "", false, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2], (String) values[3], (String) values[4], ((Boolean) values[5]).booleanValue(), ((Integer) values[6]).intValue()), new Object[]{"a", "", "", "", "", false, 1}),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2], (String) values[3], (String) values[4], ((Boolean) values[5]).booleanValue(), ((Integer) values[6]).intValue()), new Object[]{"a", "", "", "", "", false, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2], (String) values[3], (String) values[4], ((Boolean) values[5]).booleanValue(), ((Integer) values[6]).intValue()), new Object[]{"", null, "", "", "", false, 1}),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2], (String) values[3], (String) values[4], ((Boolean) values[5]).booleanValue(), ((Integer) values[6]).intValue()), new Object[]{"", null, "", "", "", false, 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2], (String) values[3], (String) values[4], ((Boolean) values[5]).booleanValue(), ((Integer) values[6]).intValue()), new Object[]{"", "", "a", "", "", false, 1}),
            capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2], (String) values[3], (String) values[4], ((Boolean) values[5]).booleanValue(), ((Integer) values[6]).intValue()), new Object[]{"", "", "a", "", "", false, 1})
        );
    }
}
