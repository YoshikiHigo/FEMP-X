package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair13078DifferenceFindingTest {

    private final ClonePair13078 subject = new ClonePair13078();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2]), new Object[]{"foo/bar", "foo", null});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2]), new Object[]{"foo/bar", "foo", null});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "String(bnVsbC9iYXI=)",
            null,
            "java.lang.Object[][String(Zm9vL2Jhcg==),String(Zm9v),null]",
            "java.lang.Object[][String(Zm9vL2Jhcg==),String(Zm9v),null]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "String(Zm9vL2Jhcg==)",
            null,
            "java.lang.Object[][String(Zm9vL2Jhcg==),String(Zm9v),null]",
            "java.lang.Object[][String(Zm9vL2Jhcg==),String(Zm9v),null]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
