package unverified;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("timeout")
class ClonePair13057DifferenceFindingTest {

    private final ClonePair13057 subject = new ClonePair13057();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = captureWithTimeout(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue()), 200L, new Object[]{"foo", 1});
        InvocationOutcome method2Outcome = captureWithTimeout(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue()), 200L, new Object[]{"foo", 1});
        String lineSeparator = System.lineSeparator();

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "String(Zm9v)",
            null,
            "java.lang.Object[][String(Zm9v),Integer(1)]",
            "java.lang.Object[][String(Zm9v),Integer(1)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "TIMEOUT",
            null,
            null,
            "java.lang.Object[][String(Zm9v),Integer(1)]",
            "java.lang.Object[][String(Zm9v),Integer(1)]"
        );
        assertNotEquals(method1Outcome.stdout, method2Outcome.stdout);
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTrue(!method2Outcome.stdout.isEmpty());
        assertTextContains("stdout", "--1" + lineSeparator + "--2" + lineSeparator + "--3" + lineSeparator + "--5" + lineSeparator + "--7" + lineSeparator + "--8" + lineSeparator + "--10" + lineSeparator + "--11" + lineSeparator + "--7" + lineSeparator + "--8" + lineSeparator + "--10" + lineSeparator + "--11" + lineSeparator + "--7" + lineSeparator + "--8" + lineSeparator + "--10" + lineSeparator + "--11" + lineSeparator + "--7" + lineSeparator + "--8" + lineSeparator + "--10" + lineSeparator + "--11" + lineSeparator + "--7" + lineSeparator + "--8" + lineSeparator + "--10" + lineSeparator + "--11", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
