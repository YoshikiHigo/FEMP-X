package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair8924DifferenceFindingTest {

    private final ClonePair8924 subject = new ClonePair8924();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((int[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{new int[]{}, 1, 1});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((int[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{new int[]{}, 1, 1});

        assertCoreOutcome(
            method1Outcome,
            "EX",
            null,
            "java.lang.ArrayIndexOutOfBoundsException",
            "java.lang.Object[][int[][],Integer(1),Integer(1)]",
            "java.lang.Object[][int[][],Integer(1),Integer(1)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "Integer(0)",
            null,
            "java.lang.Object[][int[][],Integer(1),Integer(1)]",
            "java.lang.Object[][int[][],Integer(1),Integer(1)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
