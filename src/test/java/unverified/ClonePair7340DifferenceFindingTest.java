package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair7340DifferenceFindingTest {

    private final ClonePair7340 subject = new ClonePair7340();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((Object) values[0], (Object) values[1]), new Object[]{date(0L), date(0L)});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((Object) values[0], (Object) values[1]), new Object[]{date(0L), date(0L)});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "Boolean(true)",
            null,
            "java.lang.Object[][Date(0),Date(0)]",
            "java.lang.Object[][Date(0),Date(0)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "Boolean(false)",
            null,
            "java.lang.Object[][Date(0),Date(0)]",
            "java.lang.Object[][Date(0),Date(0)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
