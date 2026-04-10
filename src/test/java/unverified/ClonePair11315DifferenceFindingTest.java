package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair11315DifferenceFindingTest {

    private final ClonePair11315 subject = new ClonePair11315();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((Number) values[0], (Number) values[1]), new Object[]{Double.valueOf(1.5), Integer.valueOf(1)});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((Number) values[0], (Number) values[1]), new Object[]{Double.valueOf(1.5), Integer.valueOf(1)});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "Double(1.5)",
            null,
            "java.lang.Object[][Double(1.5),Integer(1)]",
            "java.lang.Object[][Double(1.5),Integer(1)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "Integer(1)",
            null,
            "java.lang.Object[][Double(1.5),Integer(1)]",
            "java.lang.Object[][Double(1.5),Integer(1)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
