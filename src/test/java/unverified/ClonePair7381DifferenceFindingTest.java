package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair7381DifferenceFindingTest {

    private final ClonePair7381 subject = new ClonePair7381();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0], (String) values[1]), new Object[]{"bar", "foo"});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0], (String) values[1]), new Object[]{"bar", "foo"});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "Boolean(true)",
            null,
            "java.lang.Object[][String(YmFy),String(Zm9v)]",
            "java.lang.Object[][String(YmFy),String(Zm9v)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "Boolean(false)",
            null,
            "java.lang.Object[][String(YmFy),String(Zm9v)]",
            "java.lang.Object[][String(YmFy),String(Zm9v)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
