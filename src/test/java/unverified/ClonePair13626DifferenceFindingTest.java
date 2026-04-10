package unverified;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("timeout")
class ClonePair13626DifferenceFindingTest {

    private final ClonePair13626 subject = new ClonePair13626();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = captureWithTimeout(values -> subject.method1((String) values[0]), 200L, new Object[]{"0"});
        InvocationOutcome method2Outcome = captureWithTimeout(values -> subject.method2((String) values[0]), 200L, new Object[]{"0"});

        assertCoreOutcome(
            method1Outcome,
            "TIMEOUT",
            null,
            null,
            "java.lang.Object[][String(MA==)]",
            "java.lang.Object[][String(MA==)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "byte[][]",
            null,
            "java.lang.Object[][String(MA==)]",
            "java.lang.Object[][String(MA==)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
