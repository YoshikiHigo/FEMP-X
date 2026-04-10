package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair5599DifferenceFindingTest {

    private final ClonePair5599 subject = new ClonePair5599();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0], ((Boolean) values[1]).booleanValue()), new Object[]{"foo", false});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0], ((Boolean) values[1]).booleanValue()), new Object[]{"foo", false});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "Boolean(false)",
            null,
            "java.lang.Object[][String(Zm9v),Boolean(false)]",
            "java.lang.Object[][String(Zm9v),Boolean(false)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "Boolean(true)",
            null,
            "java.lang.Object[][String(Zm9v),Boolean(false)]",
            "java.lang.Object[][String(Zm9v),Boolean(false)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
