package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair8017DifferenceFindingTest {

    private final ClonePair8017 subject = new ClonePair8017();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0], ((Character) values[1]).charValue()), new Object[]{" ", '\0'});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0], ((Character) values[1]).charValue()), new Object[]{" ", '\0'});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "null",
            null,
            "java.lang.Object[][String(IA==),Character(0)]",
            "java.lang.Object[][String(IA==),Character(0)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "null",
            null,
            "java.lang.Object[][String(IA==),Character(0)]",
            "java.lang.Object[][String(IA==),Character(0)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertNotEquals(method1Outcome.stderr, method2Outcome.stderr);
        assertTrue(!method1Outcome.stderr.isEmpty());
        assertTrue(!method2Outcome.stderr.isEmpty());
    }
}
