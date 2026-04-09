package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair4865DifferenceFindingTest {

    private final ClonePair4865 subject = new ClonePair4865();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue()), new Object[]{-1, 3});
        InvocationOutcome method2Outcome = capture(values -> subject.method2(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue()), new Object[]{-1, 3});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "Integer(2)",
            null,
            "java.lang.Object[][Integer(-1),Integer(3)]",
            "java.lang.Object[][Integer(-1),Integer(3)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "Integer(-1)",
            null,
            "java.lang.Object[][Integer(-1),Integer(3)]",
            "java.lang.Object[][Integer(-1),Integer(3)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
