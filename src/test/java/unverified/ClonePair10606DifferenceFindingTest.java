package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair10606DifferenceFindingTest {

    private final ClonePair10606 subject = new ClonePair10606();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2]), new Object[]{"a", "a", null});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2]), new Object[]{"a", "a", null});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "String(bnVsbA==)",
            null,
            "java.lang.Object[][String(YQ==),String(YQ==),null]",
            "java.lang.Object[][String(YQ==),String(YQ==),null]"
        );
        assertCoreOutcome(
            method2Outcome,
            "EX",
            null,
            "java.lang.NullPointerException",
            "java.lang.Object[][String(YQ==),String(YQ==),null]",
            "java.lang.Object[][String(YQ==),String(YQ==),null]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
