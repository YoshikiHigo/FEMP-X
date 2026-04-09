package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair3265DifferenceFindingTest {

    private final ClonePair3265 subject = new ClonePair3265();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((Object) values[0], (Object) values[1]), new Object[]{"a", Integer.valueOf(7)});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((Object) values[0], (Object) values[1]), new Object[]{"a", Integer.valueOf(7)});

        assertOutcome(
            method1Outcome,
            "OK",
            "Integer(42)",
            null,
            "",
            "",
            "java.lang.Object[][String(YQ==),Integer(7)]",
            "java.lang.Object[][String(YQ==),Integer(7)]"
        );
        assertOutcome(
            method2Outcome,
            "OK",
            "Integer(42)",
            null,
            "Warning: compared values: a, 7 have different types\n",
            "",
            "java.lang.Object[][String(YQ==),Integer(7)]",
            "java.lang.Object[][String(YQ==),Integer(7)]"
        );
    }
}
