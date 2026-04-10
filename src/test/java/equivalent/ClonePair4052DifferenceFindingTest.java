package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair4052DifferenceFindingTest {

    private final ClonePair4052 subject = new ClonePair4052();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0]), new Object[]{"a"});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0]), new Object[]{"a"});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "Character(36)",
            null,
            "java.lang.Object[][String(YQ==)]",
            "java.lang.Object[][String(YQ==)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "Character(0)",
            null,
            "java.lang.Object[][String(YQ==)]",
            "java.lang.Object[][String(YQ==)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
