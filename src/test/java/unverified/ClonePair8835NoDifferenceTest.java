package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair8835NoDifferenceTest {

    private final ClonePair8835 subject = new ClonePair8835();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((short[]) values[0], ((Short) values[1]).shortValue()), new Object[]{new short[]{}, (short) -1}),
            capture(values -> subject.method2((short[]) values[0], ((Short) values[1]).shortValue()), new Object[]{new short[]{}, (short) -1})
        );
        assertEquivalent(
            capture(values -> subject.method1((short[]) values[0], ((Short) values[1]).shortValue()), new Object[]{null, (short) -1}),
            capture(values -> subject.method2((short[]) values[0], ((Short) values[1]).shortValue()), new Object[]{null, (short) -1})
        );
        assertEquivalent(
            capture(values -> subject.method1((short[]) values[0], ((Short) values[1]).shortValue()), new Object[]{new short[]{-1, 0, 1}, (short) -1}),
            capture(values -> subject.method2((short[]) values[0], ((Short) values[1]).shortValue()), new Object[]{new short[]{-1, 0, 1}, (short) -1})
        );
        assertEquivalent(
            capture(values -> subject.method1((short[]) values[0], ((Short) values[1]).shortValue()), new Object[]{new short[]{0}, (short) 1}),
            capture(values -> subject.method2((short[]) values[0], ((Short) values[1]).shortValue()), new Object[]{new short[]{0}, (short) 1})
        );
        assertEquivalent(
            capture(values -> subject.method1((short[]) values[0], ((Short) values[1]).shortValue()), new Object[]{new short[]{1, 2}, (short) 8}),
            capture(values -> subject.method2((short[]) values[0], ((Short) values[1]).shortValue()), new Object[]{new short[]{1, 2}, (short) 8})
        );
    }
}
