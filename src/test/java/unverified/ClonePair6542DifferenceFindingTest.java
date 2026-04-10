package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair6542DifferenceFindingTest {

    private final ClonePair6542 subject = new ClonePair6542();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0], (String) values[1]), new Object[]{"1.5", " 1.5 "});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0], (String) values[1]), new Object[]{"1.5", " 1.5 "});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "Boolean(true)",
            null,
            "java.lang.Object[][String(MS41),String(IDEuNSA=)]",
            "java.lang.Object[][String(MS41),String(IDEuNSA=)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "Boolean(false)",
            null,
            "java.lang.Object[][String(MS41),String(IDEuNSA=)]",
            "java.lang.Object[][String(MS41),String(IDEuNSA=)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
