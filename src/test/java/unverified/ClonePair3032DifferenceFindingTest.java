package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair3032DifferenceFindingTest {

    private final ClonePair3032 subject = new ClonePair3032();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0], (String) values[1]), new Object[]{"foo/bar", "bar"});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0], (String) values[1]), new Object[]{"foo/bar", "bar"});

        assertOutcome(
            method1Outcome,
            "OK",
            "java.lang.String[][String(Zm9vLw==)]",
            null,
            "",
            "",
            "java.lang.Object[][String(Zm9vL2Jhcg==),String(YmFy)]",
            "java.lang.Object[][String(Zm9vL2Jhcg==),String(YmFy)]"
        );
        assertOutcome(
            method2Outcome,
            "OK",
            "java.lang.String[][String(Zm9vLw==),String(YXI=)]",
            null,
            "",
            "",
            "java.lang.Object[][String(Zm9vL2Jhcg==),String(YmFy)]",
            "java.lang.Object[][String(Zm9vL2Jhcg==),String(YmFy)]"
        );
    }
}
