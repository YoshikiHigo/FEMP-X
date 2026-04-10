package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair3409DifferenceFindingTest {

    private final ClonePair3409 subject = new ClonePair3409();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0]), new Object[]{""});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0]), new Object[]{""});
        String lineSeparator = System.lineSeparator();

        assertOutcome(
            method1Outcome,
            "OK",
            "null",
            null,
            "",
            "",
            "java.lang.Object[][String()]",
            "java.lang.Object[][String()]"
        );
        assertOutcome(
            method2Outcome,
            "OK",
            "null",
            null,
            "",
            "Error decoding Float-String ''" + lineSeparator,
            "java.lang.Object[][String()]",
            "java.lang.Object[][String()]"
        );
    }
}
