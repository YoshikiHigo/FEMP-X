package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair3900DifferenceFindingTest {

    private final ClonePair3900 subject = new ClonePair3900();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0], (String) values[1]), new Object[]{"a", "a"});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0], (String) values[1]), new Object[]{"a", "a"});

        assertOutcome(
            method1Outcome,
            "OK",
            "Boolean(true)",
            null,
            "",
            "",
            "java.lang.Object[][String(YQ==),String(YQ==)]",
            "java.lang.Object[][String(YQ==),String(YQ==)]"
        );
        assertOutcome(
            method2Outcome,
            "OK",
            "Boolean(false)",
            null,
            "",
            "",
            "java.lang.Object[][String(YQ==),String(YQ==)]",
            "java.lang.Object[][String(YQ==),String(YQ==)]"
        );
    }
}
