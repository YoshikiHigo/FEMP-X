package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair7855DifferenceFindingTest {

    private final ClonePair7855 subject = new ClonePair7855();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue()), new Object[]{"", 0});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue()), new Object[]{"", 0});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "Boolean(false)",
            null,
            "java.lang.Object[][String(),Integer(0)]",
            "java.lang.Object[][String(),Integer(0)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "Boolean(true)",
            null,
            "java.lang.Object[][String(),Integer(0)]",
            "java.lang.Object[][String(),Integer(0)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
