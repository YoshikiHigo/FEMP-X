package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair8372DifferenceFindingTest {

    private final ClonePair8372 subject = new ClonePair8372();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        Object[] inputs = new Object[]{new byte[]{}, new byte[]{}, 1};
        InvocationOutcome method1Outcome = capture(values -> subject.method1((byte[]) values[0], (byte[]) values[1], ((Integer) values[2]).intValue()), inputs);
        InvocationOutcome method2Outcome = capture(values -> subject.method2((byte[]) values[0], (byte[]) values[1], ((Integer) values[2]).intValue()), inputs);

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "Boolean(true)",
            null,
            "java.lang.Object[][byte[][],byte[][],Integer(1)]",
            "java.lang.Object[][byte[][],byte[][],Integer(1)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "Boolean(false)",
            null,
            "java.lang.Object[][byte[][],byte[][],Integer(1)]",
            "java.lang.Object[][byte[][],byte[][],Integer(1)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
