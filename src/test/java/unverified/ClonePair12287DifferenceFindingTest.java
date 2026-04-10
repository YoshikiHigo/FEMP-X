package unverified;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("timeout")
class ClonePair12287DifferenceFindingTest {

    private final ClonePair12287 subject = new ClonePair12287();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = captureWithTimeout(values -> subject.method1(((Long) values[0]).longValue(), ((Long) values[1]).longValue()), 200L, new Object[]{1L, 0L});
        InvocationOutcome method2Outcome = captureWithTimeout(values -> subject.method2(((Long) values[0]).longValue(), ((Long) values[1]).longValue()), 200L, new Object[]{1L, 0L});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "Long(1)",
            null,
            "java.lang.Object[][Long(1),Long(0)]",
            "java.lang.Object[][Long(1),Long(0)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "TIMEOUT",
            null,
            null,
            "java.lang.Object[][Long(1),Long(0)]",
            "java.lang.Object[][Long(1),Long(0)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
