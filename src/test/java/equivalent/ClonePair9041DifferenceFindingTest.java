package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair9041DifferenceFindingTest {

    private final ClonePair9041 subject = new ClonePair9041();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        Object[] inputs = new Object[]{-1};
        InvocationOutcome method1Outcome = capture(values -> subject.method1(((Integer) values[0]).intValue()), inputs);
        InvocationOutcome method2Outcome = capture(values -> subject.method2(((Integer) values[0]).intValue()), inputs);

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "Integer(1)",
            null,
            "java.lang.Object[][Integer(-1)]",
            "java.lang.Object[][Integer(-1)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "EX",
            null,
            "java.lang.AssertionError",
            "java.lang.Object[][Integer(-1)]",
            "java.lang.Object[][Integer(-1)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
