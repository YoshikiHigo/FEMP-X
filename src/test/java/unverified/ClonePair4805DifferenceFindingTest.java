package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair4805DifferenceFindingTest {

    private final ClonePair4805 subject = new ClonePair4805();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0], ((Character) values[1]).charValue(), ((Integer) values[2]).intValue()), new Object[]{"a", '\0', 2});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0], ((Character) values[1]).charValue(), ((Integer) values[2]).intValue()), new Object[]{"a", '\0', 2});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "String(YQA=)",
            null,
            "java.lang.Object[][String(YQ==),Character(0),Integer(2)]",
            "java.lang.Object[][String(YQ==),Character(0),Integer(2)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "String(AGE=)",
            null,
            "java.lang.Object[][String(YQ==),Character(0),Integer(2)]",
            "java.lang.Object[][String(YQ==),Character(0),Integer(2)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
