package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair10946DifferenceFindingTest {

    private final ClonePair10946 subject = new ClonePair10946();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue(), (String) values[2]), new Object[]{"", 1, null});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue(), (String) values[2]), new Object[]{"", 1, null});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "String(bnVsbA==)",
            null,
            "java.lang.Object[][String(),Integer(1),null]",
            "java.lang.Object[][String(),Integer(1),null]"
        );
        assertCoreOutcome(
            method2Outcome,
            "EX",
            null,
            "java.lang.NullPointerException",
            "java.lang.Object[][String(),Integer(1),null]",
            "java.lang.Object[][String(),Integer(1),null]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
