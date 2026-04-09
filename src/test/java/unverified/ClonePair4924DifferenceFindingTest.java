package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair4924DifferenceFindingTest {

    private final ClonePair4924 subject = new ClonePair4924();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1(((Float) values[0]).floatValue()), new Object[]{Float.NaN});
        InvocationOutcome method2Outcome = capture(values -> subject.method2(((Float) values[0]).floatValue()), new Object[]{Float.NaN});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "Float(0.0)",
            null,
            "java.lang.Object[][Float(NaN)]",
            "java.lang.Object[][Float(NaN)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "Float(NaN)",
            null,
            "java.lang.Object[][Float(NaN)]",
            "java.lang.Object[][Float(NaN)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
