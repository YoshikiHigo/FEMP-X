package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair3262DifferenceFindingTest {

    private final ClonePair3262 subject = new ClonePair3262();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((Object) values[0], (Object) values[1]), new Object[]{Double.valueOf(1.5), Integer.valueOf(-1)});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((Object) values[0], (Object) values[1]), new Object[]{Double.valueOf(1.5), Integer.valueOf(-1)});

        assertOutcome(
            method1Outcome,
            "EX",
            null,
            "java.lang.ClassCastException",
            "",
            "",
            "java.lang.Object[][Double(1.5),Integer(-1)]",
            "java.lang.Object[][Double(1.5),Integer(-1)]"
        );
        assertOutcome(
            method2Outcome,
            "OK",
            "Integer(1)",
            null,
            "",
            "",
            "java.lang.Object[][Double(1.5),Integer(-1)]",
            "java.lang.Object[][Double(1.5),Integer(-1)]"
        );
    }
}
