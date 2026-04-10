package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair4035DifferenceFindingTest {

    private final ClonePair4035 subject = new ClonePair4035();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0], (String) values[1]), new Object[]{"a=1|b=2", "Key:\"Value\";Other:Two"});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0], (String) values[1]), new Object[]{"a=1|b=2", "Key:\"Value\";Other:Two"});
        String lineSeparator = System.lineSeparator();

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "Boolean(false)",
            null,
            "java.lang.Object[][String(YT0xfGI9Mg==),String(S2V5OiJWYWx1ZSI7T3RoZXI6VHdv)]",
            "java.lang.Object[][String(YT0xfGI9Mg==),String(S2V5OiJWYWx1ZSI7T3RoZXI6VHdv)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "Boolean(false)",
            null,
            "java.lang.Object[][String(YT0xfGI9Mg==),String(S2V5OiJWYWx1ZSI7T3RoZXI6VHdv)]",
            "java.lang.Object[][String(YT0xfGI9Mg==),String(S2V5OiJWYWx1ZSI7T3RoZXI6VHdv)]"
        );
        assertNotEquals(method1Outcome.stdout, method2Outcome.stdout);
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "Compare failed: lengths differ" + lineSeparator, method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
