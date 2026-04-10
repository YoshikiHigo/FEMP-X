package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair7070DifferenceFindingTest {

    private final ClonePair7070 subject = new ClonePair7070();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((byte[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new byte[]{0, 1, 2}, 1});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((byte[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new byte[]{0, 1, 2}, 1});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "Integer(0)",
            null,
            "java.lang.Object[][byte[][0, 1, 2],Integer(1)]",
            "java.lang.Object[][byte[][0, 1, 2],Integer(1)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "Integer(258)",
            null,
            "java.lang.Object[][byte[][0, 1, 2],Integer(1)]",
            "java.lang.Object[][byte[][0, 1, 2],Integer(1)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
