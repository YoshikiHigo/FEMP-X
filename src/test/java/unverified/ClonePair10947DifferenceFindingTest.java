package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair10947DifferenceFindingTest {

    private final ClonePair10947 subject = new ClonePair10947();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0], (String) values[1]), new Object[]{"Key:\"Value\";Other:Two", "a"});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0], (String) values[1]), new Object[]{"Key:\"Value\";Other:Two", "a"});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "Integer(0)",
            null,
            "java.lang.Object[][String(S2V5OiJWYWx1ZSI7T3RoZXI6VHdv),String(YQ==)]",
            "java.lang.Object[][String(S2V5OiJWYWx1ZSI7T3RoZXI6VHdv),String(YQ==)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "Integer(1)",
            null,
            "java.lang.Object[][String(S2V5OiJWYWx1ZSI7T3RoZXI6VHdv),String(YQ==)]",
            "java.lang.Object[][String(S2V5OiJWYWx1ZSI7T3RoZXI6VHdv),String(YQ==)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
