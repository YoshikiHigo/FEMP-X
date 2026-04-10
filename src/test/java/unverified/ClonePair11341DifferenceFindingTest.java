package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair11341DifferenceFindingTest {

    private final ClonePair11341 subject = new ClonePair11341();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0], (String) values[1]), new Object[]{"foo/bar", "bar"});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0], (String) values[1]), new Object[]{"foo/bar", "bar"});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "Integer(-1)",
            null,
            "java.lang.Object[][String(Zm9vL2Jhcg==),String(YmFy)]",
            "java.lang.Object[][String(Zm9vL2Jhcg==),String(YmFy)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "Integer(4)",
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
