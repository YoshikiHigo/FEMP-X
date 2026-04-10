package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair8366DifferenceFindingTest {

    private final ClonePair8366 subject = new ClonePair8366();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((double[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new double[]{1.0, 2.0}, 2});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((double[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new double[]{1.0, 2.0}, 2});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "Double(1.0)",
            null,
            "java.lang.Object[][double[][1.0, 2.0],Integer(2)]",
            "java.lang.Object[][double[][1.0, 2.0],Integer(2)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "Double(2.0)",
            null,
            "java.lang.Object[][double[][1.0, 2.0],Integer(2)]",
            "java.lang.Object[][double[][1.0, 2.0],Integer(2)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
