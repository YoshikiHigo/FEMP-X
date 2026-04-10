package unverified;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("timeout")
class ClonePair13519DifferenceFindingTest {

    private final ClonePair13519 subject = new ClonePair13519();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = captureWithTimeout(values -> subject.method1((String) values[0], (String) values[1], (String) values[2]), 200L, new Object[]{"foo", "foo", ""});
        InvocationOutcome method2Outcome = captureWithTimeout(values -> subject.method2((String) values[0], (String) values[1], (String) values[2]), 200L, new Object[]{"foo", "foo", ""});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "String()",
            null,
            "java.lang.Object[][String(Zm9v),String(Zm9v),String()]",
            "java.lang.Object[][String(Zm9v),String(Zm9v),String()]"
        );
        assertCoreOutcome(
            method2Outcome,
            "TIMEOUT",
            null,
            null,
            "java.lang.Object[][String(Zm9v),String(Zm9v),String()]",
            "java.lang.Object[][String(Zm9v),String(Zm9v),String()]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
