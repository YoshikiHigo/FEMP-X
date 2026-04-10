package unverified;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("timeout")
class ClonePair11198DifferenceFindingTest {

    private final ClonePair11198 subject = new ClonePair11198();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = captureWithTimeout(values -> subject.method1((String) values[0]), 200L, new Object[]{"foo"});
        InvocationOutcome method2Outcome = captureWithTimeout(values -> subject.method2((String) values[0]), 200L, new Object[]{"foo"});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "Boolean(true)",
            null,
            "java.lang.Object[][String(Zm9v)]",
            "java.lang.Object[][String(Zm9v)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "TIMEOUT",
            null,
            null,
            "java.lang.Object[][String(Zm9v)]",
            "java.lang.Object[][String(Zm9v)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
