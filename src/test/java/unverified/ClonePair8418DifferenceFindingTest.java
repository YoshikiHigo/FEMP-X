package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair8418DifferenceFindingTest {

    private final ClonePair8418 subject = new ClonePair8418();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0], (String) values[1]), new Object[]{"", "a"});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0], (String) values[1]), new Object[]{"", "a"});
        String lineSeparator = System.lineSeparator();

        assertCoreOutcome(
            method1Outcome,
            "EX",
            null,
            "java.lang.StringIndexOutOfBoundsException",
            "java.lang.Object[][String(),String(YQ==)]",
            "java.lang.Object[][String(),String(YQ==)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "EX",
            null,
            "java.lang.StringIndexOutOfBoundsException",
            "java.lang.Object[][String(),String(YQ==)]",
            "java.lang.Object[][String(),String(YQ==)]"
        );
        assertNotEquals(method1Outcome.stdout, method2Outcome.stdout);
        assertTextEquals("stdout", "currURL = '', begin = 'a'" + lineSeparator, method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
