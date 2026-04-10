package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair3398DifferenceFindingTest {

    private final ClonePair3398 subject = new ClonePair3398();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((int[]) values[0], (int[]) values[1]), new Object[]{new int[]{0}, new int[]{}});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((int[]) values[0], (int[]) values[1]), new Object[]{new int[]{0}, new int[]{}});

        assertOutcome(
            method1Outcome,
            "OK",
            "Boolean(true)",
            null,
            "",
            "",
            "java.lang.Object[][int[][0],int[][]]",
            "java.lang.Object[][int[][0],int[][]]"
        );
        assertOutcome(
            method2Outcome,
            "EX",
            null,
            "java.lang.ArrayIndexOutOfBoundsException",
            "",
            "",
            "java.lang.Object[][int[][0],int[][]]",
            "java.lang.Object[][int[][0],int[][]]"
        );
    }
}
