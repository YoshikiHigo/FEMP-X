package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair4872DifferenceFindingTest {

    private final ClonePair4872 subject = new ClonePair4872();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue()), new Object[]{-1, 1});
        InvocationOutcome method2Outcome = capture(values -> subject.method2(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue()), new Object[]{-1, 1});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "Integer(0)",
            null,
            "java.lang.Object[][Integer(-1),Integer(1)]",
            "java.lang.Object[][Integer(-1),Integer(1)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "Integer(1)",
            null,
            "java.lang.Object[][Integer(-1),Integer(1)]",
            "java.lang.Object[][Integer(-1),Integer(1)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
