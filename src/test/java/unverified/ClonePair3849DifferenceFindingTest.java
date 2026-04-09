package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair3849DifferenceFindingTest {

    private final ClonePair3849 subject = new ClonePair3849();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((double[]) values[0], (double[]) values[1]), new Object[]{new double[]{}, new double[]{}});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((double[]) values[0], (double[]) values[1]), new Object[]{new double[]{}, new double[]{}});

        assertOutcome(
            method1Outcome,
            "OK",
            "Double(0.0)",
            null,
            "",
            "",
            "java.lang.Object[][double[][],double[][]]",
            "java.lang.Object[][double[][],double[][]]"
        );
        assertOutcome(
            method2Outcome,
            "OK",
            "Double(NaN)",
            null,
            "",
            "",
            "java.lang.Object[][double[][],double[][]]",
            "java.lang.Object[][double[][],double[][]]"
        );
    }
}
