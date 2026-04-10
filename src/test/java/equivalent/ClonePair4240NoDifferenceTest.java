package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair4240NoDifferenceTest {

    private final ClonePair4240 subject = new ClonePair4240();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Character) values[1]).charValue(), (byte[]) values[2]), new Object[]{"", '\0', new byte[]{}}),
            capture(values -> subject.method2((String) values[0], ((Character) values[1]).charValue(), (byte[]) values[2]), new Object[]{"", '\0', new byte[]{}})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Character) values[1]).charValue(), (byte[]) values[2]), new Object[]{"", '\0', null}),
            capture(values -> subject.method2((String) values[0], ((Character) values[1]).charValue(), (byte[]) values[2]), new Object[]{"", '\0', null})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Character) values[1]).charValue(), (byte[]) values[2]), new Object[]{"", '\0', new byte[]{0}}),
            capture(values -> subject.method2((String) values[0], ((Character) values[1]).charValue(), (byte[]) values[2]), new Object[]{"", '\0', new byte[]{0}})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Character) values[1]).charValue(), (byte[]) values[2]), new Object[]{"a", '\0', new byte[]{0}}),
            capture(values -> subject.method2((String) values[0], ((Character) values[1]).charValue(), (byte[]) values[2]), new Object[]{"a", '\0', new byte[]{0}})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], ((Character) values[1]).charValue(), (byte[]) values[2]), new Object[]{"a", 'a', new byte[]{0}}),
            capture(values -> subject.method2((String) values[0], ((Character) values[1]).charValue(), (byte[]) values[2]), new Object[]{"a", 'a', new byte[]{0}})
        );
    }
}
