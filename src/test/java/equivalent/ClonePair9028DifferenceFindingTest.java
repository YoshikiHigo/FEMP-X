package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair9028DifferenceFindingTest {

    private final ClonePair9028 subject = new ClonePair9028();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        Object[] inputs = new Object[]{-1};
        InvocationOutcome method1Outcome = capture(values -> subject.method1(((Integer) values[0]).intValue()), inputs);
        InvocationOutcome method2Outcome = capture(values -> subject.method2(((Integer) values[0]).intValue()), inputs);

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "String(LTE=)",
            null,
            "java.lang.Object[][Integer(-1)]",
            "java.lang.Object[][Integer(-1)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "null",
            null,
            "java.lang.Object[][Integer(-1)]",
            "java.lang.Object[][Integer(-1)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
