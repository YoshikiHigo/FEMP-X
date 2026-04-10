package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair5813DifferenceFindingTest {

    private final ClonePair5813 subject = new ClonePair5813();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((byte[]) values[0], ((Integer) values[1]).intValue(), (byte[]) values[2], ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue()), new Object[]{null, 1, new byte[]{}, 1, 1});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((byte[]) values[0], ((Integer) values[1]).intValue(), (byte[]) values[2], ((Integer) values[3]).intValue(), ((Integer) values[4]).intValue()), new Object[]{null, 1, new byte[]{}, 1, 1});

        assertCoreOutcome(
            method1Outcome,
            "EX",
            null,
            "java.lang.NullPointerException",
            "java.lang.Object[][null,Integer(1),byte[][],Integer(1),Integer(1)]",
            "java.lang.Object[][null,Integer(1),byte[][],Integer(1),Integer(1)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "EX",
            null,
            "java.lang.ArrayIndexOutOfBoundsException",
            "java.lang.Object[][null,Integer(1),byte[][],Integer(1),Integer(1)]",
            "java.lang.Object[][null,Integer(1),byte[][],Integer(1),Integer(1)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
