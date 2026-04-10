package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair12725DifferenceFindingTest {

    private final ClonePair12725 subject = new ClonePair12725();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2]), new Object[]{"a", null, ""});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2]), new Object[]{"a", null, ""});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "String(YQ==)",
            null,
            "java.lang.Object[][String(YQ==),null,String()]",
            "java.lang.Object[][String(YQ==),null,String()]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "String()",
            null,
            "java.lang.Object[][String(YQ==),null,String()]",
            "java.lang.Object[][String(YQ==),null,String()]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
