package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair4169DifferenceFindingTest {

    private final ClonePair4169 subject = new ClonePair4169();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = captureWithTimeout(values -> subject.method1(((Float) values[0]).floatValue(), ((Float) values[1]).floatValue(), ((Float) values[2]).floatValue()), 200L, new Object[]{-1.0f, -1.0f, 0.5f});
        InvocationOutcome method2Outcome = captureWithTimeout(values -> subject.method2(((Float) values[0]).floatValue(), ((Float) values[1]).floatValue(), ((Float) values[2]).floatValue()), 200L, new Object[]{-1.0f, -1.0f, 0.5f});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "Float(-1.0)",
            null,
            "java.lang.Object[][Float(-1.0),Float(-1.0),Float(0.5)]",
            "java.lang.Object[][Float(-1.0),Float(-1.0),Float(0.5)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "TIMEOUT",
            null,
            null,
            "java.lang.Object[][Float(-1.0),Float(-1.0),Float(0.5)]",
            "java.lang.Object[][Float(-1.0),Float(-1.0),Float(0.5)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
