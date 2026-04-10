package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair10796DifferenceFindingTest {

    private final ClonePair10796 subject = new ClonePair10796();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2]), new Object[]{"", null, ""});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2]), new Object[]{"", null, ""});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "String()",
            null,
            "java.lang.Object[][String(),null,String()]",
            "java.lang.Object[][String(),null,String()]"
        );
        assertCoreOutcome(
            method2Outcome,
            "EX",
            null,
            "java.lang.NullPointerException",
            "java.lang.Object[][String(),null,String()]",
            "java.lang.Object[][String(),null,String()]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
