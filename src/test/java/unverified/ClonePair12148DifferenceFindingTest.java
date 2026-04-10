package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair12148DifferenceFindingTest {

    private final ClonePair12148 subject = new ClonePair12148();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2]), new Object[]{null, null, null});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2]), new Object[]{null, null, null});

        assertCoreOutcome(
            method1Outcome,
            "EX",
            null,
            "java.lang.NullPointerException",
            "java.lang.Object[][null,null,null]",
            "java.lang.Object[][null,null,null]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "null",
            null,
            "java.lang.Object[][null,null,null]",
            "java.lang.Object[][null,null,null]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
