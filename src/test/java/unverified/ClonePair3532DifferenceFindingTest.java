package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair3532DifferenceFindingTest {

    private final ClonePair3532 subject = new ClonePair3532();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((int[]) values[0], (int[]) values[1]), new Object[]{null, null});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((int[]) values[0], (int[]) values[1]), new Object[]{null, null});

        assertOutcome(
            method1Outcome,
            "OK",
            "Boolean(false)",
            null,
            "",
            "",
            "java.lang.Object[][null,null]",
            "java.lang.Object[][null,null]"
        );
        assertOutcome(
            method2Outcome,
            "OK",
            "Boolean(true)",
            null,
            "",
            "",
            "java.lang.Object[][null,null]",
            "java.lang.Object[][null,null]"
        );
    }
}
