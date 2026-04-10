package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair8488DifferenceFindingTest {

    private final ClonePair8488 subject = new ClonePair8488();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0]), new Object[]{"1,5"});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0]), new Object[]{"1,5"});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "null",
            null,
            "java.lang.Object[][String(MSw1)]",
            "java.lang.Object[][String(MSw1)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "Double(1.5)",
            null,
            "java.lang.Object[][String(MSw1)]",
            "java.lang.Object[][String(MSw1)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
