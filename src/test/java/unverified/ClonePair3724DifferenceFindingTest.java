package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair3724DifferenceFindingTest {

    private final ClonePair3724 subject = new ClonePair3724();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0], (String) values[1]), new Object[]{null, ""});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0], (String) values[1]), new Object[]{null, ""});

        assertOutcome(
            method1Outcome,
            "EX",
            null,
            "java.lang.NullPointerException",
            "",
            "",
            "java.lang.Object[][null,String()]",
            "java.lang.Object[][null,String()]"
        );
        assertOutcome(
            method2Outcome,
            "OK",
            "Boolean(true)",
            null,
            "",
            "",
            "java.lang.Object[][null,String()]",
            "java.lang.Object[][null,String()]"
        );
    }
}
