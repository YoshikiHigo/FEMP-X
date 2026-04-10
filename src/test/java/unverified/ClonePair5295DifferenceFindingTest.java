package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair5295DifferenceFindingTest {

    private final ClonePair5295 subject = new ClonePair5295();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((char[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new char[]{'A', 'B', 'C'}, 1});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((char[]) values[0], ((Integer) values[1]).intValue()), new Object[]{new char[]{'A', 'B', 'C'}, 1});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "Integer(3)",
            null,
            "java.lang.Object[][char[][A, B, C],Integer(1)]",
            "java.lang.Object[][char[][A, B, C],Integer(1)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "Integer(3)",
            null,
            "java.lang.Object[][char[][A, B, C],Integer(1)]",
            "java.lang.Object[][char[][A, b, c],Integer(1)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
