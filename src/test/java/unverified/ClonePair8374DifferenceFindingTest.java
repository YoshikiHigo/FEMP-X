package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair8374DifferenceFindingTest {

    private final ClonePair8374 subject = new ClonePair8374();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((byte[]) values[0], (byte[]) values[1], ((Integer) values[2]).intValue()), new Object[]{new byte[]{}, new byte[]{}, 1});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((byte[]) values[0], (byte[]) values[1], ((Integer) values[2]).intValue()), new Object[]{new byte[]{}, new byte[]{}, 1});

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
