package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair11205DifferenceFindingTest {

    private final ClonePair11205 subject = new ClonePair11205();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0], (String) values[1]), new Object[]{"A", "a"});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0], (String) values[1]), new Object[]{"A", "a"});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "Integer(-32)",
            null,
            "java.lang.Object[][String(QQ==),String(YQ==)]",
            "java.lang.Object[][String(QQ==),String(YQ==)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "Integer(-1)",
            null,
            "java.lang.Object[][String(QQ==),String(YQ==)]",
            "java.lang.Object[][String(QQ==),String(YQ==)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
