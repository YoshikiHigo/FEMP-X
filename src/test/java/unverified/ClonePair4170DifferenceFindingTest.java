package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair4170DifferenceFindingTest {

    private final ClonePair4170 subject = new ClonePair4170();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1(((Float) values[0]).floatValue(), ((Float) values[1]).floatValue(), ((Float) values[2]).floatValue()), new Object[]{0.5f, -1.0f, 0.0f});
        InvocationOutcome method2Outcome = capture(values -> subject.method2(((Float) values[0]).floatValue(), ((Float) values[1]).floatValue(), ((Float) values[2]).floatValue()), new Object[]{0.5f, -1.0f, 0.0f});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "Float(-0.5)",
            null,
            "java.lang.Object[][Float(0.5),Float(-1.0),Float(0.0)]",
            "java.lang.Object[][Float(0.5),Float(-1.0),Float(0.0)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "Float(0.0)",
            null,
            "java.lang.Object[][Float(0.5),Float(-1.0),Float(0.0)]",
            "java.lang.Object[][Float(0.5),Float(-1.0),Float(0.0)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
