package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair5349DifferenceFindingTest {

    private final ClonePair5349 subject = new ClonePair5349();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0], (String) values[1], ((Integer) values[2]).intValue()), new Object[]{"a", "A", -1});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0], (String) values[1], ((Integer) values[2]).intValue()), new Object[]{"a", "A", -1});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "Integer(0)",
            null,
            "java.lang.Object[][String(YQ==),String(QQ==),Integer(-1)]",
            "java.lang.Object[][String(YQ==),String(QQ==),Integer(-1)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "Integer(-1)",
            null,
            "java.lang.Object[][String(YQ==),String(QQ==),Integer(-1)]",
            "java.lang.Object[][String(YQ==),String(QQ==),Integer(-1)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
