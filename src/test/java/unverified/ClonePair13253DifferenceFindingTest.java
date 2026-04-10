package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair13253DifferenceFindingTest {

    private final ClonePair13253 subject = new ClonePair13253();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0], (String) values[1]), new Object[]{"foo/bar", "bar"});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0], (String) values[1]), new Object[]{"foo/bar", "bar"});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "String(Zm9vLw==)",
            null,
            "java.lang.Object[][String(Zm9vL2Jhcg==),String(YmFy)]",
            "java.lang.Object[][String(Zm9vL2Jhcg==),String(YmFy)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "String(Zm9vL2Jhcg==)",
            null,
            "java.lang.Object[][String(Zm9vL2Jhcg==),String(YmFy)]",
            "java.lang.Object[][String(Zm9vL2Jhcg==),String(YmFy)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
