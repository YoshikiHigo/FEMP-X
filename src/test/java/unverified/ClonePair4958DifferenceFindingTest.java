package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair4958DifferenceFindingTest {

    private final ClonePair4958 subject = new ClonePair4958();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((java.util.Hashtable) values[0]), new Object[]{null});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((java.util.Hashtable) values[0]), new Object[]{null});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "String()",
            null,
            "java.lang.Object[][null]",
            "java.lang.Object[][null]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "String()",
            null,
            "java.lang.Object[][null]",
            "java.lang.Object[][null]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertNotEquals(method1Outcome.stderr, method2Outcome.stderr);
        assertTrue(!method1Outcome.stderr.isEmpty());
        assertTrue(!method2Outcome.stderr.isEmpty());
    }
}
