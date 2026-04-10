package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair7415DifferenceFindingTest {

    private final ClonePair7415 subject = new ClonePair7415();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue(), ((Character) values[2]).charValue()), new Object[]{"a", 2, '\0'});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue(), ((Character) values[2]).charValue()), new Object[]{"a", 2, '\0'});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "String(YQA=)",
            null,
            "java.lang.Object[][String(YQ==),Integer(2),Character(0)]",
            "java.lang.Object[][String(YQ==),Integer(2),Character(0)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "String(AGE=)",
            null,
            "java.lang.Object[][String(YQ==),Integer(2),Character(0)]",
            "java.lang.Object[][String(YQ==),Integer(2),Character(0)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
