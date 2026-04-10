package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair3014DifferenceFindingTest {

    private final ClonePair3014 subject = new ClonePair3014();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((Object) values[0], (Object) values[1]), new Object[]{null, Integer.valueOf(7)});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((Object) values[0], (Object) values[1]), new Object[]{null, Integer.valueOf(7)});

        assertOutcome(
            method1Outcome,
            "EX",
            null,
            "java.lang.ClassCastException",
            "",
            "",
            "java.lang.Object[][null,Integer(7)]",
            "java.lang.Object[][null,Integer(7)]"
        );
        assertOutcome(
            method2Outcome,
            "OK",
            "Integer(-1)",
            null,
            "",
            "",
            "java.lang.Object[][null,Integer(7)]",
            "java.lang.Object[][null,Integer(7)]"
        );
    }
}
