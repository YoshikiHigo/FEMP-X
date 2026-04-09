package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair3444DifferenceFindingTest {

    private final ClonePair3444 subject = new ClonePair3444();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0]), new Object[]{" "});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0]), new Object[]{" "});

        assertOutcome(
            method1Outcome,
            "OK",
            "null",
            null,
            "",
            "",
            "java.lang.Object[][String(IA==)]",
            "java.lang.Object[][String(IA==)]"
        );
        assertOutcome(
            method2Outcome,
            "OK",
            "null",
            null,
            "",
            "Error decoding Float-String ' '\n",
            "java.lang.Object[][String(IA==)]",
            "java.lang.Object[][String(IA==)]"
        );
    }
}
