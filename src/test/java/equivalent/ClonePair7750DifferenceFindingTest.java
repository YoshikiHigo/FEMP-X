package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair7750DifferenceFindingTest {

    private final ClonePair7750 subject = new ClonePair7750();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        Object[] inputs = new Object[]{new double[]{0.0}, 0.5, -1, 0};
        InvocationOutcome method1Outcome = capture(values -> subject.method1((double[]) values[0], ((Double) values[1]).doubleValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), inputs);
        InvocationOutcome method2Outcome = capture(values -> subject.method2((double[]) values[0], ((Double) values[1]).doubleValue(), ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), inputs);

        assertCoreOutcome(
            method1Outcome,
            "EX",
            null,
            "java.lang.ArrayIndexOutOfBoundsException",
            "java.lang.Object[][double[][0.0],Double(0.5),Integer(-1),Integer(0)]",
            "java.lang.Object[][double[][0.0],Double(0.5),Integer(-1),Integer(0)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "Integer(-2)",
            null,
            "java.lang.Object[][double[][0.0],Double(0.5),Integer(-1),Integer(0)]",
            "java.lang.Object[][double[][0.0],Double(0.5),Integer(-1),Integer(0)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
