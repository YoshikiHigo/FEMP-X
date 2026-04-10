package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair8852DifferenceFindingTest {

    private final ClonePair8852 subject = new ClonePair8852();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        Object[] inputs = new Object[]{null, -1, 0};
        InvocationOutcome method1Outcome = capture(values -> subject.method1((byte[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), inputs);
        InvocationOutcome method2Outcome = capture(values -> subject.method2((byte[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), inputs);

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "byte[][]",
            null,
            "java.lang.Object[][null,Integer(-1),Integer(0)]",
            "java.lang.Object[][null,Integer(-1),Integer(0)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "EX",
            null,
            "java.lang.NullPointerException",
            "java.lang.Object[][null,Integer(-1),Integer(0)]",
            "java.lang.Object[][null,Integer(-1),Integer(0)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
