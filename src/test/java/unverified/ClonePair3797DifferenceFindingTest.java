package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair3797DifferenceFindingTest {

    private final ClonePair3797 subject = new ClonePair3797();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0], (String) values[1]), new Object[]{"a=1|b=2", "a=1|b=2"});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0], (String) values[1]), new Object[]{"a=1|b=2", "a=1|b=2"});

        assertOutcome(
            method1Outcome,
            "OK",
            "Boolean(true)",
            null,
            "",
            "",
            "java.lang.Object[][String(YT0xfGI9Mg==),String(YT0xfGI9Mg==)]",
            "java.lang.Object[][String(YT0xfGI9Mg==),String(YT0xfGI9Mg==)]"
        );
        assertOutcome(
            method2Outcome,
            "OK",
            "Boolean(false)",
            null,
            "",
            "",
            "java.lang.Object[][String(YT0xfGI9Mg==),String(YT0xfGI9Mg==)]",
            "java.lang.Object[][String(YT0xfGI9Mg==),String(YT0xfGI9Mg==)]"
        );
    }
}
