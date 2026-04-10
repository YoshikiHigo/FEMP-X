package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair4423DifferenceFindingTest {

    private final ClonePair4423 subject = new ClonePair4423();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1(((Long) values[0]).longValue()), new Object[]{1L});
        InvocationOutcome method2Outcome = capture(values -> subject.method2(((Long) values[0]).longValue()), new Object[]{1L});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "Boolean(true)",
            null,
            "java.lang.Object[][Long(1)]",
            "java.lang.Object[][Long(1)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "Boolean(false)",
            null,
            "java.lang.Object[][Long(1)]",
            "java.lang.Object[][Long(1)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
