package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair7940DifferenceFindingTest {

    private final ClonePair7940 subject = new ClonePair7940();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0], (String) values[1]), new Object[]{"foo/bar", "foo"});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0], (String) values[1]), new Object[]{"foo/bar", "foo"});
        String lineSeparator = System.lineSeparator();

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "Boolean(false)",
            null,
            "java.lang.Object[][String(Zm9vL2Jhcg==),String(Zm9v)]",
            "java.lang.Object[][String(Zm9vL2Jhcg==),String(Zm9v)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "Boolean(false)",
            null,
            "java.lang.Object[][String(Zm9vL2Jhcg==),String(Zm9v)]",
            "java.lang.Object[][String(Zm9vL2Jhcg==),String(Zm9v)]"
        );
        assertNotEquals(method1Outcome.stdout, method2Outcome.stdout);
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "Compare failed: lengths differ" + lineSeparator, method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
