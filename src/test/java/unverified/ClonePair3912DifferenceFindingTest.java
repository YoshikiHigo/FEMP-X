package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair3912DifferenceFindingTest {

    private final ClonePair3912 subject = new ClonePair3912();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((double[]) values[0], (double[]) values[1]), new Object[]{new double[]{1.0, 2.0}, new double[]{-1.0, 0.0, 1.0}});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((double[]) values[0], (double[]) values[1]), new Object[]{new double[]{1.0, 2.0}, new double[]{-1.0, 0.0, 1.0}});

        assertOutcome(
            method1Outcome,
            "OK",
            "Double(2.0)",
            null,
            "",
            "",
            "java.lang.Object[][double[][1.0, 2.0],double[][-1.0, 0.0, 1.0]]",
            "java.lang.Object[][double[][1.0, 2.0],double[][-1.0, 0.0, 1.0]]"
        );
        assertOutcome(
            method2Outcome,
            "OK",
            "Double(4.0)",
            null,
            "",
            "",
            "java.lang.Object[][double[][1.0, 2.0],double[][-1.0, 0.0, 1.0]]",
            "java.lang.Object[][double[][1.0, 2.0],double[][-1.0, 0.0, 1.0]]"
        );
    }
}
