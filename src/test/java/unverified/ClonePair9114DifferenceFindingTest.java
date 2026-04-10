package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair9114DifferenceFindingTest {

    private final ClonePair9114 subject = new ClonePair9114();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1(((Double) values[0]).doubleValue()), new Object[]{-1.0});
        InvocationOutcome method2Outcome = capture(values -> subject.method2(((Double) values[0]).doubleValue()), new Object[]{-1.0});
        String lineSeparator = System.lineSeparator();

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "Double(-1.0)",
            null,
            "java.lang.Object[][Double(-1.0)]",
            "java.lang.Object[][Double(-1.0)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "Double(-1.0)",
            null,
            "java.lang.Object[][Double(-1.0)]",
            "java.lang.Object[][Double(-1.0)]"
        );
        assertNotEquals(method1Outcome.stdout, method2Outcome.stdout);
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "Environment.applyPiecewiseLinearFunction(-) - [warning] - check source for exact definition." + lineSeparator, method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
