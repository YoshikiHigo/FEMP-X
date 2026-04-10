package unverified;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

@Tag("timeout")
class ClonePair3992DifferenceFindingTest {

    private final ClonePair3992 subject = new ClonePair3992();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = captureWithTimeout(values -> subject.method1((String) values[0], ((Character) values[1]).charValue(), ((Character) values[2]).charValue()), 200L, new Object[]{"foo/bar", 'a', '\0'});
        InvocationOutcome method2Outcome = captureWithTimeout(values -> subject.method2((String) values[0], ((Character) values[1]).charValue(), ((Character) values[2]).charValue()), 200L, new Object[]{"foo/bar", 'a', '\0'});

        assertOutcome(
            method1Outcome,
            "OK",
            "String(Zm9vL2I=)",
            null,
            "",
            "",
            "java.lang.Object[][String(Zm9vL2Jhcg==),Character(97),Character(0)]",
            "java.lang.Object[][String(Zm9vL2Jhcg==),Character(97),Character(0)]"
        );
        assertOutcome(
            method2Outcome,
            "TIMEOUT",
            null,
            null,
            "",
            "",
            "java.lang.Object[][String(Zm9vL2Jhcg==),Character(97),Character(0)]",
            "java.lang.Object[][String(Zm9vL2Jhcg==),Character(97),Character(0)]"
        );
    }
}
