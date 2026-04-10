package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair8049DifferenceFindingTest {

    private final ClonePair8049 subject = new ClonePair8049();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((byte[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{new byte[]{}, 1, 0});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((byte[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{new byte[]{}, 1, 0});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "String()",
            null,
            "java.lang.Object[][byte[][],Integer(1),Integer(0)]",
            "java.lang.Object[][byte[][],Integer(1),Integer(0)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "EX",
            null,
            "java.lang.ArrayIndexOutOfBoundsException",
            "java.lang.Object[][byte[][],Integer(1),Integer(0)]",
            "java.lang.Object[][byte[][],Integer(1),Integer(0)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
