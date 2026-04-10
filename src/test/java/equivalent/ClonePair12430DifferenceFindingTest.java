package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair12430DifferenceFindingTest {

    private final ClonePair12430 subject = new ClonePair12430();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        Object[] inputs = new Object[]{new byte[]{}, new byte[]{}, -1, 2};
        InvocationOutcome method1Outcome = capture(values -> subject.method1((byte[]) values[0], (byte[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), inputs);
        InvocationOutcome method2Outcome = capture(values -> subject.method2((byte[]) values[0], (byte[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), inputs);

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "Boolean(false)",
            null,
            "java.lang.Object[][byte[][],byte[][],Integer(-1),Integer(2)]",
            "java.lang.Object[][byte[][],byte[][],Integer(-1),Integer(2)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "EX",
            null,
            "java.lang.ArrayIndexOutOfBoundsException",
            "java.lang.Object[][byte[][],byte[][],Integer(-1),Integer(2)]",
            "java.lang.Object[][byte[][],byte[][],Integer(-1),Integer(2)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
