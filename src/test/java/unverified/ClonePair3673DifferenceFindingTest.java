package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair3673DifferenceFindingTest {

    private final ClonePair3673 subject = new ClonePair3673();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0], (String) values[1]), new Object[]{"a.b", "a.b"});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0], (String) values[1]), new Object[]{"a.b", "a.b"});

        assertOutcome(
            method1Outcome,
            "OK",
            "Boolean(true)",
            null,
            "",
            "",
            "java.lang.Object[][String(YS5i),String(YS5i)]",
            "java.lang.Object[][String(YS5i),String(YS5i)]"
        );
        assertOutcome(
            method2Outcome,
            "OK",
            "Boolean(false)",
            null,
            "",
            "",
            "java.lang.Object[][String(YS5i),String(YS5i)]",
            "java.lang.Object[][String(YS5i),String(YS5i)]"
        );
    }
}
