package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair7971DifferenceFindingTest {

    private final ClonePair7971 subject = new ClonePair7971();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0], (String) values[1]), new Object[]{"foo", "foo/bar"});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0], (String) values[1]), new Object[]{"foo", "foo/bar"});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "Boolean(false)",
            null,
            "java.lang.Object[][String(Zm9v),String(Zm9vL2Jhcg==)]",
            "java.lang.Object[][String(Zm9v),String(Zm9vL2Jhcg==)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "Boolean(true)",
            null,
            "java.lang.Object[][String(Zm9v),String(Zm9vL2Jhcg==)]",
            "java.lang.Object[][String(Zm9v),String(Zm9vL2Jhcg==)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
