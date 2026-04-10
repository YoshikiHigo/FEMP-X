package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair13223DifferenceFindingTest {

    private final ClonePair13223 subject = new ClonePair13223();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0]), new Object[]{""});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0]), new Object[]{""});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "java.lang.String[][null,null]",
            null,
            "java.lang.Object[][String()]",
            "java.lang.Object[][String()]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "java.lang.String[][String(),null]",
            null,
            "java.lang.Object[][String()]",
            "java.lang.Object[][String()]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
