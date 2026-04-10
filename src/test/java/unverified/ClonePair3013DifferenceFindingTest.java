package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair3013DifferenceFindingTest {

    private final ClonePair3013 subject = new ClonePair3013();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((Object) values[0], (Object) values[1]), new Object[]{"Alpha", "alpha"});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((Object) values[0], (Object) values[1]), new Object[]{"Alpha", "alpha"});

        assertOutcome(
            method1Outcome,
            "OK",
            "Integer(0)",
            null,
            "",
            "",
            "java.lang.Object[][String(QWxwaGE=),String(YWxwaGE=)]",
            "java.lang.Object[][String(QWxwaGE=),String(YWxwaGE=)]"
        );
        assertOutcome(
            method2Outcome,
            "OK",
            "Integer(-32)",
            null,
            "",
            "",
            "java.lang.Object[][String(QWxwaGE=),String(YWxwaGE=)]",
            "java.lang.Object[][String(QWxwaGE=),String(YWxwaGE=)]"
        );
    }
}
