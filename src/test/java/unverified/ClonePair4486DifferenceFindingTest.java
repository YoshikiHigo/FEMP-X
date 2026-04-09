package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair4486DifferenceFindingTest {

    private final ClonePair4486 subject = new ClonePair4486();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1(((Double) values[0]).doubleValue(), ((Double) values[1]).doubleValue()), new Object[]{0.0, -1.0});
        InvocationOutcome method2Outcome = capture(values -> subject.method2(((Double) values[0]).doubleValue(), ((Double) values[1]).doubleValue()), new Object[]{0.0, -1.0});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "Double(4.71238898038469)",
            null,
            "java.lang.Object[][Double(0.0),Double(-1.0)]",
            "java.lang.Object[][Double(0.0),Double(-1.0)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "Double(1.5707963267948966)",
            null,
            "java.lang.Object[][Double(0.0),Double(-1.0)]",
            "java.lang.Object[][Double(0.0),Double(-1.0)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
