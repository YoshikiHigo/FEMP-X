package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair8068DifferenceFindingTest {

    private final ClonePair8068 subject = new ClonePair8068();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((byte[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{new byte[]{0, 1, 2}, 0, 2});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((byte[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{new byte[]{0, 1, 2}, 0, 2});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "String(MDAwMQ==)",
            null,
            "java.lang.Object[][byte[][0, 1, 2],Integer(0),Integer(2)]",
            "java.lang.Object[][byte[][0, 1, 2],Integer(0),Integer(2)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "String(MDAgMDE=)",
            null,
            "java.lang.Object[][byte[][0, 1, 2],Integer(0),Integer(2)]",
            "java.lang.Object[][byte[][0, 1, 2],Integer(0),Integer(2)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
