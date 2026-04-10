package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair12658DifferenceFindingTest {

    private final ClonePair12658 subject = new ClonePair12658();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((float[]) values[0], ((Float) values[1]).floatValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), new Object[]{new float[]{0.0f}, 0.5f, -1, 0});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((float[]) values[0], ((Float) values[1]).floatValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), new Object[]{new float[]{0.0f}, 0.5f, -1, 0});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "Integer(-2)",
            null,
            "java.lang.Object[][float[][0.0],Float(0.5),Integer(-1),Integer(0)]",
            "java.lang.Object[][float[][0.0],Float(0.5),Integer(-1),Integer(0)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "EX",
            null,
            "java.lang.ArrayIndexOutOfBoundsException",
            "java.lang.Object[][float[][0.0],Float(0.5),Integer(-1),Integer(0)]",
            "java.lang.Object[][float[][0.0],Float(0.5),Integer(-1),Integer(0)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
