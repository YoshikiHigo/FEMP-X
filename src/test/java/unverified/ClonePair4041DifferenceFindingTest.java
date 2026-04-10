package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair4041DifferenceFindingTest {

    private final ClonePair4041 subject = new ClonePair4041();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0], (String) values[1]), new Object[]{"a=1|b=2", "a"});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0], (String) values[1]), new Object[]{"a=1|b=2", "a"});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "Boolean(false)",
            null,
            "java.lang.Object[][String(YT0xfGI9Mg==),String(YQ==)]",
            "java.lang.Object[][String(YT0xfGI9Mg==),String(YQ==)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "Boolean(true)",
            null,
            "java.lang.Object[][String(YT0xfGI9Mg==),String(YQ==)]",
            "java.lang.Object[][String(YT0xfGI9Mg==),String(YQ==)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
