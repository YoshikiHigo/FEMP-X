package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair13075DifferenceFindingTest {

    private final ClonePair13075 subject = new ClonePair13075();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        Object[] inputs = new Object[]{"foo", "foo", null};
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2]), inputs);
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2]), inputs);

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "String(bnVsbA==)",
            null,
            "java.lang.Object[][String(Zm9v),String(Zm9v),null]",
            "java.lang.Object[][String(Zm9v),String(Zm9v),null]"
        );
        assertCoreOutcome(
            method2Outcome,
            "EX",
            null,
            "java.lang.NullPointerException",
            "java.lang.Object[][String(Zm9v),String(Zm9v),null]",
            "java.lang.Object[][String(Zm9v),String(Zm9v),null]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
