package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair3522NoDifferenceTest {

    private final ClonePair3522 subject = new ClonePair3522();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((Short) values[0], (Short) values[1]), new Object[]{Short.valueOf((short) -1), Short.valueOf((short) -1)}),
            capture(values -> subject.method2((Short) values[0], (Short) values[1]), new Object[]{Short.valueOf((short) -1), Short.valueOf((short) -1)})
        );
        assertEquivalent(
            capture(values -> subject.method1((Short) values[0], (Short) values[1]), new Object[]{null, Short.valueOf((short) -1)}),
            capture(values -> subject.method2((Short) values[0], (Short) values[1]), new Object[]{null, Short.valueOf((short) -1)})
        );
        assertEquivalent(
            capture(values -> subject.method1((Short) values[0], (Short) values[1]), new Object[]{Short.valueOf((short) 0), Short.valueOf((short) -1)}),
            capture(values -> subject.method2((Short) values[0], (Short) values[1]), new Object[]{Short.valueOf((short) 0), Short.valueOf((short) -1)})
        );
    }
}
