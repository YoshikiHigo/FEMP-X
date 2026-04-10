package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair11747DifferenceFindingTest {

    private final ClonePair11747 subject = new ClonePair11747();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2]), new Object[]{"foo", "foo/bar", null});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2]), new Object[]{"foo", "foo/bar", null});

        assertCoreOutcome(
            method1Outcome,
            "EX",
            null,
            "java.lang.NullPointerException",
            "java.lang.Object[][String(Zm9v),String(Zm9vL2Jhcg==),null]",
            "java.lang.Object[][String(Zm9v),String(Zm9vL2Jhcg==),null]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "String(Zm9v)",
            null,
            "java.lang.Object[][String(Zm9v),String(Zm9vL2Jhcg==),null]",
            "java.lang.Object[][String(Zm9v),String(Zm9vL2Jhcg==),null]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
