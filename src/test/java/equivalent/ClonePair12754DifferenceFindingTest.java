package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair12754DifferenceFindingTest {

    private final ClonePair12754 subject = new ClonePair12754();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        Object[] inputs = new Object[]{new byte[]{}, -1};
        InvocationOutcome method1Outcome = capture(values -> subject.method1((byte[]) values[0], ((Integer) values[1]).intValue()), inputs);
        InvocationOutcome method2Outcome = capture(values -> subject.method2((byte[]) values[0], ((Integer) values[1]).intValue()), inputs);

        assertCoreOutcome(
            method1Outcome,
            "EX",
            null,
            "java.lang.ArrayIndexOutOfBoundsException",
            "java.lang.Object[][byte[][],Integer(-1)]",
            "java.lang.Object[][byte[][],Integer(-1)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "Short(0)",
            null,
            "java.lang.Object[][byte[][],Integer(-1)]",
            "java.lang.Object[][byte[][],Integer(-1)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
