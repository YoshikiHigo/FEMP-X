package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair3729DifferenceFindingTest {

    private final ClonePair3729 subject = new ClonePair3729();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0], (String) values[1]), new Object[]{"a", "A"});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0], (String) values[1]), new Object[]{"a", "A"});

        assertOutcome(
            method1Outcome,
            "OK",
            "Boolean(false)",
            null,
            "",
            "",
            "java.lang.Object[][String(YQ==),String(QQ==)]",
            "java.lang.Object[][String(YQ==),String(QQ==)]"
        );
        assertOutcome(
            method2Outcome,
            "OK",
            "Boolean(true)",
            null,
            "",
            "",
            "java.lang.Object[][String(YQ==),String(QQ==)]",
            "java.lang.Object[][String(YQ==),String(QQ==)]"
        );
    }
}
