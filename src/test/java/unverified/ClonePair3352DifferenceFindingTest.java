package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair3352DifferenceFindingTest {

    private final ClonePair3352 subject = new ClonePair3352();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((int[]) values[0], (int[]) values[1]), new Object[]{new int[]{0}, new int[]{}});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((int[]) values[0], (int[]) values[1]), new Object[]{new int[]{0}, new int[]{}});
        String lineSeparator = System.lineSeparator();

        assertOutcome(
            method1Outcome,
            "OK",
            "Boolean(false)",
            null,
            "",
            "",
            "java.lang.Object[][int[][0],int[][]]",
            "java.lang.Object[][int[][0],int[][]]"
        );
        assertOutcome(
            method2Outcome,
            "OK",
            "Boolean(false)",
            null,
            "\nLength of two configurations are not the same, can not be compared!" + lineSeparator,
            "",
            "java.lang.Object[][int[][0],int[][]]",
            "java.lang.Object[][int[][0],int[][]]"
        );
    }
}
