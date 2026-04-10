package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair3816DifferenceFindingTest {

    private final ClonePair3816 subject = new ClonePair3816();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0], (String) values[1]), new Object[]{"Alpha", "alpha"});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0], (String) values[1]), new Object[]{"Alpha", "alpha"});

        assertOutcome(
            method1Outcome,
            "OK",
            "Boolean(true)",
            null,
            "",
            "",
            "java.lang.Object[][String(QWxwaGE=),String(YWxwaGE=)]",
            "java.lang.Object[][String(QWxwaGE=),String(YWxwaGE=)]"
        );
        assertOutcome(
            method2Outcome,
            "OK",
            "Boolean(false)",
            null,
            "",
            "",
            "java.lang.Object[][String(QWxwaGE=),String(YWxwaGE=)]",
            "java.lang.Object[][String(QWxwaGE=),String(YWxwaGE=)]"
        );
    }
}
