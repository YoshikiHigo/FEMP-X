package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair4859DifferenceFindingTest {

    private final ClonePair4859 subject = new ClonePair4859();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{"", 0, -1});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0], ((Integer) values[1]).intValue(), ((Integer) values[2]).intValue()), new Object[]{"", 0, -1});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "String()",
            null,
            "java.lang.Object[][String(),Integer(0),Integer(-1)]",
            "java.lang.Object[][String(),Integer(0),Integer(-1)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "EX",
            null,
            "java.lang.StringIndexOutOfBoundsException",
            "java.lang.Object[][String(),Integer(0),Integer(-1)]",
            "java.lang.Object[][String(),Integer(0),Integer(-1)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
