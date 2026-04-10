package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair12452DifferenceFindingTest {

    private final ClonePair12452 subject = new ClonePair12452();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue()), new Object[]{"a", 2});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue()), new Object[]{"a", 2});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "String(YSA=)",
            null,
            "java.lang.Object[][String(YQ==),Integer(2)]",
            "java.lang.Object[][String(YQ==),Integer(2)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "String(MGE=)",
            null,
            "java.lang.Object[][String(YQ==),Integer(2)]",
            "java.lang.Object[][String(YQ==),Integer(2)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
