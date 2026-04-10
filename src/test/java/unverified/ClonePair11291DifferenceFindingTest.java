package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair11291DifferenceFindingTest {

    private final ClonePair11291 subject = new ClonePair11291();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((Number) values[0], (Number) values[1]), new Object[]{Integer.valueOf(1), Double.valueOf(1.5)});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((Number) values[0], (Number) values[1]), new Object[]{Integer.valueOf(1), Double.valueOf(1.5)});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "Double(1.5)",
            null,
            "java.lang.Object[][Integer(1),Double(1.5)]",
            "java.lang.Object[][Integer(1),Double(1.5)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "Integer(1)",
            null,
            "java.lang.Object[][Integer(1),Double(1.5)]",
            "java.lang.Object[][Integer(1),Double(1.5)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
