package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair10286DifferenceFindingTest {

    private final ClonePair10286 subject = new ClonePair10286();

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
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTrue(!method2Outcome.stderr.isEmpty());
    }
}
