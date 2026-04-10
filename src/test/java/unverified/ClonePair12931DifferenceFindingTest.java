package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair12931DifferenceFindingTest {

    private final ClonePair12931 subject = new ClonePair12931();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue()), new Object[]{"foo", 4});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue()), new Object[]{"foo", 4});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "String(Zm9vIA==)",
            null,
            "java.lang.Object[][String(Zm9v),Integer(4)]",
            "java.lang.Object[][String(Zm9v),Integer(4)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "String(Zm9vJm5ic3A7)",
            null,
            "java.lang.Object[][String(Zm9v),Integer(4)]",
            "java.lang.Object[][String(Zm9v),Integer(4)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
