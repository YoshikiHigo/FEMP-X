package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair13515DifferenceFindingTest {

    private final ClonePair13515 subject = new ClonePair13515();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0]), new Object[]{"a"});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0]), new Object[]{"a"});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "java.lang.String[][String(),String(YQ==)]",
            null,
            "java.lang.Object[][String(YQ==)]",
            "java.lang.Object[][String(YQ==)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "java.lang.String[][String(YQ==),null]",
            null,
            "java.lang.Object[][String(YQ==)]",
            "java.lang.Object[][String(YQ==)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
