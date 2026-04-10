package unverified;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("timeout")
class ClonePair7752DifferenceFindingTest {

    private final ClonePair7752 subject = new ClonePair7752();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = captureWithTimeout(values -> subject.method1(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue()), 200L, new Object[]{1, 0});
        InvocationOutcome method2Outcome = captureWithTimeout(values -> subject.method2(((Integer) values[0]).intValue(), ((Integer) values[1]).intValue()), 200L, new Object[]{1, 0});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "Integer(1)",
            null,
            "java.lang.Object[][Integer(1),Integer(0)]",
            "java.lang.Object[][Integer(1),Integer(0)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "TIMEOUT",
            null,
            null,
            "java.lang.Object[][Integer(1),Integer(0)]",
            "java.lang.Object[][Integer(1),Integer(0)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
