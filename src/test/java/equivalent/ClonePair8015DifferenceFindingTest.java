package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair8015DifferenceFindingTest {

    private final ClonePair8015 subject = new ClonePair8015();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        Object[] inputs = new Object[]{" ", '\0'};
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0], ((Character) values[1]).charValue()), inputs);
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0], ((Character) values[1]).charValue()), inputs);

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "null",
            null,
            "java.lang.Object[][String(IA==),Character(0)]",
            "java.lang.Object[][String(IA==),Character(0)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "null",
            null,
            "java.lang.Object[][String(IA==),Character(0)]",
            "java.lang.Object[][String(IA==),Character(0)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertNotEquals(method1Outcome.stderr, method2Outcome.stderr);
        assertTrue(!method1Outcome.stderr.isEmpty());
        assertTrue(!method2Outcome.stderr.isEmpty());
    }
}
