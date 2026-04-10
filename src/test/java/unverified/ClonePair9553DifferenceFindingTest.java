package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair9553DifferenceFindingTest {

    private final ClonePair9553 subject = new ClonePair9553();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((int[]) values[0]), new Object[]{new int[]{1, 2}});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((int[]) values[0]), new Object[]{new int[]{1, 2}});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "Boolean(false)",
            null,
            "java.lang.Object[][int[][1, 2]]",
            "java.lang.Object[][int[][1, 2]]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "Boolean(true)",
            null,
            "java.lang.Object[][int[][1, 2]]",
            "java.lang.Object[][int[][1, 2]]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
