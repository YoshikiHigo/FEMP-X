package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair3038DifferenceFindingTest {

    private final ClonePair3038 subject = new ClonePair3038();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0], (String) values[1]), new Object[]{"foo/bar", "foo"});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0], (String) values[1]), new Object[]{"foo/bar", "foo"});

        assertOutcome(
            method1Outcome,
            "OK",
            "java.lang.String[][String(),String(YXI=)]",
            null,
            "",
            "",
            "java.lang.Object[][String(Zm9vL2Jhcg==),String(Zm9v)]",
            "java.lang.Object[][String(Zm9vL2Jhcg==),String(Zm9v)]"
        );
        assertOutcome(
            method2Outcome,
            "OK",
            "java.lang.String[][String(),String(L2Jhcg==)]",
            null,
            "",
            "",
            "java.lang.Object[][String(Zm9vL2Jhcg==),String(Zm9v)]",
            "java.lang.Object[][String(Zm9vL2Jhcg==),String(Zm9v)]"
        );
    }
}
