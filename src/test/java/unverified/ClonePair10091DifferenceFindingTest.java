package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair10091DifferenceFindingTest {

    private final ClonePair10091 subject = new ClonePair10091();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((byte[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{new byte[]{0, 1, 2}, 1, 2});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((byte[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{new byte[]{0, 1, 2}, 1, 2});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "Integer(258)",
            null,
            "java.lang.Object[][byte[][0, 1, 2],Integer(1),Integer(2)]",
            "java.lang.Object[][byte[][0, 1, 2],Integer(1),Integer(2)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "Integer(33)",
            null,
            "java.lang.Object[][byte[][0, 1, 2],Integer(1),Integer(2)]",
            "java.lang.Object[][byte[][0, 1, 2],Integer(1),Integer(2)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
