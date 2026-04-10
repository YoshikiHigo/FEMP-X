package unverified;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("timeout")
class ClonePair4206DifferenceFindingTest {

    private final ClonePair4206 subject = new ClonePair4206();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = captureWithTimeout(values -> subject.method1(((Float) values[0]).floatValue(), ((Float) values[1]).floatValue(), ((Float) values[2]).floatValue()), 200L, new Object[]{0.0f, -1.0f, -1.0f});
        InvocationOutcome method2Outcome = captureWithTimeout(values -> subject.method2(((Float) values[0]).floatValue(), ((Float) values[1]).floatValue(), ((Float) values[2]).floatValue()), 200L, new Object[]{0.0f, -1.0f, -1.0f});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "Float(-1.0)",
            null,
            "java.lang.Object[][Float(0.0),Float(-1.0),Float(-1.0)]",
            "java.lang.Object[][Float(0.0),Float(-1.0),Float(-1.0)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "TIMEOUT",
            null,
            null,
            "java.lang.Object[][Float(0.0),Float(-1.0),Float(-1.0)]",
            "java.lang.Object[][Float(0.0),Float(-1.0),Float(-1.0)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
