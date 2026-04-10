package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair10343DifferenceFindingTest {

    private final ClonePair10343 subject = new ClonePair10343();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2]), new Object[]{"foo/bar", "foo", ""});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2]), new Object[]{"foo/bar", "foo", ""});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "String(Zm9vL2Jhcg==)",
            null,
            "java.lang.Object[][String(Zm9vL2Jhcg==),String(Zm9v),String()]",
            "java.lang.Object[][String(Zm9vL2Jhcg==),String(Zm9v),String()]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "String(L2Jhcg==)",
            null,
            "java.lang.Object[][String(Zm9vL2Jhcg==),String(Zm9v),String()]",
            "java.lang.Object[][String(Zm9vL2Jhcg==),String(Zm9v),String()]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
