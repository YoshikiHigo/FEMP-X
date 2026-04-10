package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair7900DifferenceFindingTest {

    private final ClonePair7900 subject = new ClonePair7900();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((char[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new char[]{}, 1});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((char[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new char[]{}, 1});

        assertCoreOutcome(
            method1Outcome,
            "EX",
            null,
            "java.lang.NegativeArraySizeException",
            "java.lang.Object[][char[][],Integer(1)]",
            "java.lang.Object[][char[][],Integer(1)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "EX",
            null,
            "java.lang.NegativeArraySizeException",
            "java.lang.Object[][char[][],Integer(1)]",
            "java.lang.Object[][char[][],Integer(1)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertNotEquals(method1Outcome.stderr, method2Outcome.stderr);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTrue(!method2Outcome.stderr.isEmpty());
    }
}
