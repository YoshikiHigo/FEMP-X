package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair11248DifferenceFindingTest {

    private final ClonePair11248 subject = new ClonePair11248();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0], (String) values[1]), new Object[]{"", null});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0], (String) values[1]), new Object[]{"", null});

        assertCoreOutcome(
            method1Outcome,
            "EX",
            null,
            "java.lang.NullPointerException",
            "java.lang.Object[][String(),null]",
            "java.lang.Object[][String(),null]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "Integer(-1)",
            null,
            "java.lang.Object[][String(),null]",
            "java.lang.Object[][String(),null]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
