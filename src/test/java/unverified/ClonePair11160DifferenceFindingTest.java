package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair11160DifferenceFindingTest {

    private final ClonePair11160 subject = new ClonePair11160();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((Class) values[0], (Class) values[1]), new Object[]{double.class, Integer.class});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((Class) values[0], (Class) values[1]), new Object[]{double.class, Integer.class});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "Boolean(false)",
            null,
            "java.lang.Object[][java.lang.Class(ZG91Ymxl),java.lang.Class(Y2xhc3MgamF2YS5sYW5nLkludGVnZXI=)]",
            "java.lang.Object[][java.lang.Class(ZG91Ymxl),java.lang.Class(Y2xhc3MgamF2YS5sYW5nLkludGVnZXI=)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "OK",
            "Boolean(true)",
            null,
            "java.lang.Object[][java.lang.Class(ZG91Ymxl),java.lang.Class(Y2xhc3MgamF2YS5sYW5nLkludGVnZXI=)]",
            "java.lang.Object[][java.lang.Class(ZG91Ymxl),java.lang.Class(Y2xhc3MgamF2YS5sYW5nLkludGVnZXI=)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
