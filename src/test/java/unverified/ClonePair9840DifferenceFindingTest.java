package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair9840DifferenceFindingTest {

    private final ClonePair9840 subject = new ClonePair9840();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue()), new Object[]{"a.b", 3});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue()), new Object[]{"a.b", 3});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "Integer(2)",
            null,
            "java.lang.Object[][String(YS5i),Integer(3)]",
            "java.lang.Object[][String(YS5i),Integer(3)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "Integer(3)",
            null,
            "java.lang.Object[][String(YS5i),Integer(3)]",
            "java.lang.Object[][String(YS5i),Integer(3)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
