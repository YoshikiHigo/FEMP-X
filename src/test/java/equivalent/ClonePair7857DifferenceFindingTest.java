package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair7857DifferenceFindingTest {

    private final ClonePair7857 subject = new ClonePair7857();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        Object[] inputs = new Object[]{new char[]{}, 1, 1, '\0'};
        InvocationOutcome method1Outcome = capture(values -> subject.method1((char[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), ((Character) values[3]).charValue()), inputs);
        InvocationOutcome method2Outcome = capture(values -> subject.method2((char[]) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue(), ((Character) values[3]).charValue()), inputs);

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "Integer(-1)",
            null,
            "java.lang.Object[][char[][],Integer(1),Integer(1),Character(0)]",
            "java.lang.Object[][char[][],Integer(1),Integer(1),Character(0)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "EX",
            null,
            "java.lang.ArrayIndexOutOfBoundsException",
            "java.lang.Object[][char[][],Integer(1),Integer(1),Character(0)]",
            "java.lang.Object[][char[][],Integer(1),Integer(1),Character(0)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
