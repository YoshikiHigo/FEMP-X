package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair12853DifferenceFindingTest {

    private final ClonePair12853 subject = new ClonePair12853();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0], (String) values[1], (String) values[2]), new Object[]{"a", "a.b", "a"});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0], (String) values[1], (String) values[2]), new Object[]{"a", "a.b", "a"});

        assertCoreOutcome(
            method1Outcome,
            "EX",
            null,
            "java.lang.AssertionError",
            "java.lang.Object[][String(YQ==),String(YS5i),String(YQ==)]",
            "java.lang.Object[][String(YQ==),String(YS5i),String(YQ==)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "String(YQ==)",
            null,
            "java.lang.Object[][String(YQ==),String(YS5i),String(YQ==)]",
            "java.lang.Object[][String(YQ==),String(YS5i),String(YQ==)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
