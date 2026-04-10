package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair11850DifferenceFindingTest {

    private final ClonePair11850 subject = new ClonePair11850();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2]), new Object[]{"foo/bar", "foo/bar", "foo"});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2]), new Object[]{"foo/bar", "foo/bar", "foo"});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "String(Zm9v)",
            null,
            "java.lang.Object[][String(Zm9vL2Jhcg==),String(Zm9vL2Jhcg==),String(Zm9v)]",
            "java.lang.Object[][String(Zm9vL2Jhcg==),String(Zm9vL2Jhcg==),String(Zm9v)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "String(Zm9vL2Jhcg==)",
            null,
            "java.lang.Object[][String(Zm9vL2Jhcg==),String(Zm9vL2Jhcg==),String(Zm9v)]",
            "java.lang.Object[][String(Zm9vL2Jhcg==),String(Zm9vL2Jhcg==),String(Zm9v)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
