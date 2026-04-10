package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair13015DifferenceFindingTest {

    private final ClonePair13015 subject = new ClonePair13015();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0]), new Object[]{"0A"});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0]), new Object[]{"0A"});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "Long(10)",
            null,
            "java.lang.Object[][String(MEE=)]",
            "java.lang.Object[][String(MEE=)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "Long(0)",
            null,
            "java.lang.Object[][String(MEE=)]",
            "java.lang.Object[][String(MEE=)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
