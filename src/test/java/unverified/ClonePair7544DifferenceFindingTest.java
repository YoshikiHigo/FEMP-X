package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair7544DifferenceFindingTest {

    private final ClonePair7544 subject = new ClonePair7544();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((Object) values[0], (Object) values[1]), new Object[]{Double.valueOf(Double.NaN), Double.valueOf(Double.NaN)});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((Object) values[0], (Object) values[1]), new Object[]{Double.valueOf(Double.NaN), Double.valueOf(Double.NaN)});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "Boolean(false)",
            null,
            "java.lang.Object[][Double(NaN),Double(NaN)]",
            "java.lang.Object[][Double(NaN),Double(NaN)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "Boolean(true)",
            null,
            "java.lang.Object[][Double(NaN),Double(NaN)]",
            "java.lang.Object[][Double(NaN),Double(NaN)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
