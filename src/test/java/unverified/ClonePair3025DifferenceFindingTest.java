package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair3025DifferenceFindingTest {

    private final ClonePair3025 subject = new ClonePair3025();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0], (String) values[1]), new Object[]{"foo", "foo"});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0], (String) values[1]), new Object[]{"foo", "foo"});

        assertOutcome(
            method1Outcome,
            "OK",
            "java.lang.String[][String()]",
            null,
            "",
            "",
            "java.lang.Object[][String(Zm9v),String(Zm9v)]",
            "java.lang.Object[][String(Zm9v),String(Zm9v)]"
        );
        assertOutcome(
            method2Outcome,
            "OK",
            "java.lang.String[][String(Zm9v)]",
            null,
            "",
            "",
            "java.lang.Object[][String(Zm9v),String(Zm9v)]",
            "java.lang.Object[][String(Zm9v),String(Zm9v)]"
        );
    }
}
