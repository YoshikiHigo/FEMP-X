package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair3793DifferenceFindingTest {

    private final ClonePair3793 subject = new ClonePair3793();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0], (String) values[1]), new Object[]{null, "a"});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0], (String) values[1]), new Object[]{null, "a"});

        assertOutcome(
            method1Outcome,
            "EX",
            null,
            "java.lang.NullPointerException",
            "",
            "",
            "java.lang.Object[][null,String(YQ==)]",
            "java.lang.Object[][null,String(YQ==)]"
        );
        assertOutcome(
            method2Outcome,
            "OK",
            "Boolean(false)",
            null,
            "",
            "",
            "java.lang.Object[][null,String(YQ==)]",
            "java.lang.Object[][null,String(YQ==)]"
        );
    }
}
