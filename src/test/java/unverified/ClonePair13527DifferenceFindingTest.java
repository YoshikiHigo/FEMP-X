package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair13527DifferenceFindingTest {

    private final ClonePair13527 subject = new ClonePair13527();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0]), new Object[]{"a.b"});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0]), new Object[]{"a.b"});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "java.lang.String[][String(YQ==),String(Yg==)]",
            null,
            "java.lang.Object[][String(YS5i)]",
            "java.lang.Object[][String(YS5i)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "java.lang.String[][String(),String(YS5i)]",
            null,
            "java.lang.Object[][String(YS5i)]",
            "java.lang.Object[][String(YS5i)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
