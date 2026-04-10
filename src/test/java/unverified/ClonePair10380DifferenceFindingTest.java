package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair10380DifferenceFindingTest {

    private final ClonePair10380 subject = new ClonePair10380();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0]), new Object[]{""});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0]), new Object[]{""});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "null",
            null,
            "java.lang.Object[][String()]",
            "java.lang.Object[][String()]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "null",
            null,
            "java.lang.Object[][String()]",
            "java.lang.Object[][String()]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertNotEquals(method1Outcome.stderr, method2Outcome.stderr);
        assertTrue(!method1Outcome.stderr.isEmpty());
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
