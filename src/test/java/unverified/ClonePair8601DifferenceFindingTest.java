package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair8601DifferenceFindingTest {

    private final ClonePair8601 subject = new ClonePair8601();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0], (String) values[1]), new Object[]{"a", ""});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0], (String) values[1]), new Object[]{"a", ""});
        String lineSeparator = System.lineSeparator();

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "Boolean(false)",
            null,
            "java.lang.Object[][String(YQ==),String()]",
            "java.lang.Object[][String(YQ==),String()]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "Boolean(false)",
            null,
            "java.lang.Object[][String(YQ==),String()]",
            "java.lang.Object[][String(YQ==),String()]"
        );
        assertNotEquals(method1Outcome.stdout, method2Outcome.stdout);
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "Compare failed: lengths differ" + lineSeparator, method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
