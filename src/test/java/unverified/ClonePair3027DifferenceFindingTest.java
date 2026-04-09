package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair3027DifferenceFindingTest {

    private final ClonePair3027 subject = new ClonePair3027();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0], (String) values[1]), new Object[]{"", null});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0], (String) values[1]), new Object[]{"", null});

        assertOutcome(
            method1Outcome,
            "EX",
            null,
            "java.lang.NullPointerException",
            "",
            "",
            "java.lang.Object[][String(),null]",
            "java.lang.Object[][String(),null]"
        );
        assertOutcome(
            method2Outcome,
            "OK",
            "java.lang.String[][]",
            null,
            "",
            "",
            "java.lang.Object[][String(),null]",
            "java.lang.Object[][String(),null]"
        );
    }
}
