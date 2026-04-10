package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair13597DifferenceFindingTest {

    private final ClonePair13597 subject = new ClonePair13597();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1(((Character) values[0]).charValue()), new Object[]{'\0'});
        InvocationOutcome method2Outcome = capture(values -> subject.method2(((Character) values[0]).charValue()), new Object[]{'\0'});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "Integer(-1)",
            null,
            "java.lang.Object[][Character(0)]",
            "java.lang.Object[][Character(0)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "EX",
            null,
            "java.lang.AssertionError",
            "java.lang.Object[][Character(0)]",
            "java.lang.Object[][Character(0)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
