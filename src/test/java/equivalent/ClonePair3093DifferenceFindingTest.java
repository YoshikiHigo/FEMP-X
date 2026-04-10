package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair3093DifferenceFindingTest {

    private final ClonePair3093 subject = new ClonePair3093();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0]), new Object[]{"_"});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0]), new Object[]{"_"});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "java.util.Locale(Xw==)",
            null,
            "java.lang.Object[][String(Xw==)]",
            "java.lang.Object[][String(Xw==)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "java.util.Locale()",
            null,
            "java.lang.Object[][String(Xw==)]",
            "java.lang.Object[][String(Xw==)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
