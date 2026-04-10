package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair10953DifferenceFindingTest {

    private final ClonePair10953 subject = new ClonePair10953();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue(), (String) values[2]), new Object[]{"a.b", 2, null});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue(), (String) values[2]), new Object[]{"a.b", 2, null});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "String(YS5i)",
            null,
            "java.lang.Object[][String(YS5i),Integer(2),null]",
            "java.lang.Object[][String(YS5i),Integer(2),null]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "String(YS5udWxs)",
            null,
            "java.lang.Object[][String(YS5i),Integer(2),null]",
            "java.lang.Object[][String(YS5i),Integer(2),null]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
