package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair3743DifferenceFindingTest {

    private final ClonePair3743 subject = new ClonePair3743();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((double[]) values[0], (double[]) values[1], ((Double) values[2]).doubleValue()), new Object[]{null, null, 0.0});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((double[]) values[0], (double[]) values[1], ((Double) values[2]).doubleValue()), new Object[]{null, null, 0.0});

        assertOutcome(
            method1Outcome,
            "EX",
            null,
            "java.lang.NullPointerException",
            "",
            "",
            "java.lang.Object[][null,null,Double(0.0)]",
            "java.lang.Object[][null,null,Double(0.0)]"
        );
        assertOutcome(
            method2Outcome,
            "OK",
            "Boolean(true)",
            null,
            "",
            "",
            "java.lang.Object[][null,null,Double(0.0)]",
            "java.lang.Object[][null,null,Double(0.0)]"
        );
    }
}
