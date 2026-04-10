package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair12911DifferenceFindingTest {

    private final ClonePair12911 subject = new ClonePair12911();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((java.util.Date) values[0], (java.util.Date) values[1], (java.util.Date) values[2]), new Object[]{date(0L), null, date(-86_400_000L)});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((java.util.Date) values[0], (java.util.Date) values[1], (java.util.Date) values[2]), new Object[]{date(0L), null, date(-86_400_000L)});

        assertCoreOutcome(
            method1Outcome,
            "OK",
            "Boolean(false)",
            null,
            "java.lang.Object[][Date(0),null,Date(-86400000)]",
            "java.lang.Object[][Date(0),null,Date(-86400000)]"
        );
        assertCoreOutcome(
            method2Outcome,
            "EX",
            null,
            "java.lang.NullPointerException",
            "java.lang.Object[][Date(0),null,Date(-86400000)]",
            "java.lang.Object[][Date(0),null,Date(-86400000)]"
        );
        assertTextEquals("stdout", "", method1Outcome.stdout);
        assertTextEquals("stdout", "", method2Outcome.stdout);
        assertTextEquals("stderr", "", method1Outcome.stderr);
        assertTextEquals("stderr", "", method2Outcome.stderr);
    }
}
