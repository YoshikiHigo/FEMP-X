package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair4139DifferenceFindingTest {

    private final ClonePair4139 subject = new ClonePair4139();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((java.util.List) values[0]), new Object[]{list("alpha", "beta")});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((java.util.List) values[0]), new Object[]{list("alpha", "beta")});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "java.lang.String[][String(YmV0YQ==),null]",
            null,
            "java.lang.Object[][java.util.ArrayList[String(YWxwaGE=),String(YmV0YQ==)]]",
            "java.lang.Object[][java.util.ArrayList[String(YWxwaGE=),String(YmV0YQ==)]]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "java.lang.String[][String(YWxwaGE=),String(YmV0YQ==)]",
            null,
            "java.lang.Object[][java.util.ArrayList[String(YWxwaGE=),String(YmV0YQ==)]]",
            "java.lang.Object[][java.util.ArrayList[String(YWxwaGE=),String(YmV0YQ==)]]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
