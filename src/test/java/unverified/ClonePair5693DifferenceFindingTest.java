package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair5693DifferenceFindingTest {

    private final ClonePair5693 subject = new ClonePair5693();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0], ((Boolean) values[1]).booleanValue()), new Object[]{"a", false});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0], ((Boolean) values[1]).booleanValue()), new Object[]{"a", false});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "Boolean(true)",
            null,
            "java.lang.Object[][String(YQ==),Boolean(false)]",
            "java.lang.Object[][String(YQ==),Boolean(false)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "Boolean(false)",
            null,
            "java.lang.Object[][String(YQ==),Boolean(false)]",
            "java.lang.Object[][String(YQ==),Boolean(false)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
