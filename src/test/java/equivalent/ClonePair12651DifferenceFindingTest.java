package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair12651DifferenceFindingTest {

    private final ClonePair12651 subject = new ClonePair12651();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        Object[] inputs = new Object[]{"a", 'a'};
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0], ((Character) values[1]).charValue()), inputs);
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0], ((Character) values[1]).charValue()), inputs);

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "String()",
            null,
            "java.lang.Object[][String(YQ==),Character(97)]",
            "java.lang.Object[][String(YQ==),Character(97)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "String(YQ==)",
            null,
            "java.lang.Object[][String(YQ==),Character(97)]",
            "java.lang.Object[][String(YQ==),Character(97)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
