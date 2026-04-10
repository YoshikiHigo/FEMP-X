package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair4276DifferenceFindingTest {

    private final ClonePair4276 subject = new ClonePair4276();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0], (String) values[1]), new Object[]{"a.b", "a"});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0], (String) values[1]), new Object[]{"a.b", "a"});
        String lineSeparator = System.lineSeparator();

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "Boolean(false)",
            null,
            "java.lang.Object[][String(YS5i),String(YQ==)]",
            "java.lang.Object[][String(YS5i),String(YQ==)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "Boolean(false)",
            null,
            "java.lang.Object[][String(YS5i),String(YQ==)]",
            "java.lang.Object[][String(YS5i),String(YQ==)]"
        );
        assertNotEquals(method1Outcome.stdout, method2Outcome.stdout);
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "Compare failed: lengths differ" + lineSeparator, method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
