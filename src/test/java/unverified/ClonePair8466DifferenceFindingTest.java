package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair8466DifferenceFindingTest {

    private final ClonePair8466 subject = new ClonePair8466();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0]), new Object[]{" "});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0]), new Object[]{" "});

        assertCoreOutcome(
            method1Outcome,
            "EX",
            null,
            "java.lang.NumberFormatException",
            "java.lang.Object[][String(IA==)]",
            "java.lang.Object[][String(IA==)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "null",
            null,
            "java.lang.Object[][String(IA==)]",
            "java.lang.Object[][String(IA==)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
