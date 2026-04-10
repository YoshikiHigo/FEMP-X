package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair3311DifferenceFindingTest {

    private final ClonePair3311 subject = new ClonePair3311();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((int[]) values[0], (int[]) values[1]), new Object[]{new int[]{}, new int[]{}});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((int[]) values[0], (int[]) values[1]), new Object[]{new int[]{}, new int[]{}});

        assertOutcome(
            method1Outcome,
            "OK",
            "Boolean(true)",
            null,
            "",
            "",
            "java.lang.Object[][int[][],int[][]]",
            "java.lang.Object[][int[][],int[][]]"
        );
        assertOutcome(
            method2Outcome,
            "OK",
            "Boolean(false)",
            null,
            "",
            "",
            "java.lang.Object[][int[][],int[][]]",
            "java.lang.Object[][int[][],int[][]]"
        );
    }
}
