package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair4403DifferenceFindingTest {

    private final ClonePair4403 subject = new ClonePair4403();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1(((Double) values[0]).doubleValue(), ((Double) values[1]).doubleValue()), new Object[]{0.0, 0.0});
        InvocationOutcome method2Outcome = capture(values -> subject.method2(((Double) values[0]).doubleValue(), ((Double) values[1]).doubleValue()), new Object[]{0.0, 0.0});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "Double(-0.0)",
            null,
            "java.lang.Object[][Double(0.0),Double(0.0)]",
            "java.lang.Object[][Double(0.0),Double(0.0)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "Double(0.0)",
            null,
            "java.lang.Object[][Double(0.0),Double(0.0)]",
            "java.lang.Object[][Double(0.0),Double(0.0)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
